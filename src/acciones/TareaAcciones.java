package acciones;

import clases.TareaClass;
import gui.Historial;
import gui.Principal;
import java.sql.*;
import java.util.ArrayList;


public class TareaAcciones {
    
    public static void guardarTarea(TareaClass tareaClass) throws SQLException{
        long id = insertarTarea(tareaClass);
        tareaClass.setID(id);
    }

    private static long insertarTarea(TareaClass tareaClass) throws SQLException{
        String sql = "insert into tareas (fecha, actividad, avance, contra, descripcion) " + "values (?,?,?,?,?);";
        PreparedStatement ps = Conexion.pepareStatement(sql);
        ps.setLong(1, tareaClass.fecha);
        ps.setString(2, tareaClass.actividad);
        ps.setLong(3, tareaClass.avance);
        ps.setString(4, tareaClass.contra);
        ps.setString(5, tareaClass.descripcion);
        int id = 0;
        ps.execute();
        sql = "select last_insert_rowid();";
        ps = Conexion.pepareStatement(sql, true);
        ResultSet rs = ps.executeQuery();
        if (rs.next()){
            id = rs.getInt(1);
        }
        return id;
    }

    public static ArrayList<TareaClass> obtenerTareas() throws SQLException {
        String sql = "select tarea_id, fecha, actividad, avance, contra, descripcion from tareas order by fecha";
        PreparedStatement ps = Conexion.pepareStatement(sql);
        ArrayList<TareaClass> list = new ArrayList<>();
        try(ResultSet rs = ps.executeQuery()){
            while(rs.next()){
                long id = rs.getLong("tarea_id");
                long fecha = rs.getLong("fecha");
                String actividad = rs.getString("actividad");
                long avance = rs.getLong("avance");
                String contra = rs.getString("contra");
                String descripcion = rs.getString("descripcion");
                TareaClass tareaClass = new TareaClass(id, fecha, actividad, avance, contra, descripcion);
                list.add(tareaClass);
            }
        }
        return list;
    }

    public static void eliminarTarea(TareaClass tareaClass) throws SQLException {
        String sql = "delete from tareas where tarea_id=?";
        PreparedStatement ps = Conexion.pepareStatement(sql);   
        ps.setLong(1, tareaClass.getID());
        ps.execute();
    }

    public static void finalizarTarea(TareaClass tareaClass) throws SQLException {
        insertarTareaHistorial(tareaClass);
        eliminarTarea(tareaClass);
    }

    private static void insertarTareaHistorial(TareaClass tareaClass) throws SQLException {
        String sql = "insert into historial (tarea_id, fecha, actividad, avance, contra, descripcion) " + "values (?,?,?,?,?,?);";
        PreparedStatement ps = Conexion.pepareStatement(sql);
        ps.setLong(1, tareaClass.getID());
        ps.setLong(2, tareaClass.fecha);
        ps.setString(3, tareaClass.actividad);
        ps.setLong(4, tareaClass.avance);
        ps.setString(5, tareaClass.contra);
        ps.setString(6, tareaClass.descripcion);
        int id = 0;
        ps.execute();    
    }

    public static ArrayList<TareaClass> obtenerTareasHistoria() throws SQLException {
        String sql = "select tarea_id, fecha, actividad, avance, contra, descripcion from historial order by fecha desc";
        PreparedStatement ps = Conexion.pepareStatement(sql);
        ArrayList<TareaClass> list = new ArrayList<>();
        try(ResultSet rs = ps.executeQuery()){
            while(rs.next()){
                long id = rs.getLong("tarea_id");
                long fecha = rs.getLong("fecha");
                String actividad = rs.getString("actividad");
                long avance = rs.getLong("avance");
                String contra = rs.getString("contra");
                String descripcion = rs.getString("descripcion");
                TareaClass tareaClass = new TareaClass(id, fecha, actividad, avance, contra, descripcion);
                list.add(tareaClass);
            }
        }
        return list;    
    }

    public static void reactivarTarea(TareaClass tareaClass) throws SQLException {
        long id = insertarTarea(tareaClass);
        eliminarTareaHistorial(tareaClass);
        tareaClass.setID(id);
    }

    public static void eliminarTareaHistorial(TareaClass tareaClass) throws SQLException {
        String sql = "delete from historial where tarea_id=?";
        PreparedStatement ps = Conexion.pepareStatement(sql);   
        ps.setLong(1, tareaClass.getID());
        ps.execute();
    }
}