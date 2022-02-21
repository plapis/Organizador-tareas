package gui;

import acciones.TareaAcciones;
import clases.TareaClass;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;


public class TareaHistorial extends Tarea{

    final TareaClass tareaClass;
    
    public TareaHistorial(TareaClass tareaClass) {
        this.tareaClass = tareaClass;
        actividadTxt.setEditable(false);
        actividadTxt.setText(tareaClass.actividad);
        fechaSpinner.setEnabled(false);
        fechaSpinner.setValue(new Date(tareaClass.fecha));
        eliminarButton.setVisible(false);
        terminarButton.setVisible(true);
        avanceTxt.setEditable(false);
        avanceTxt.setText(String.valueOf(tareaClass.avance));
        descripcionTxt.setEditable(false);
        descripcionTxt.setText(tareaClass.descripcion);
        if (tareaClass.contra == null){
            contraTxt.setVisible(false);
            contraLabel.setVisible(false);
        } 
        else {
            contraTxt.setText("******");
            contraTxt.setEditable(false);
        }
        eliminarButton.setVisible(true);
        terminarButton.setVisible(true);
        terminarButton.setText("Reactivar");
    }

    @Override
    void eliminar() {
        try {
            TareaAcciones.eliminarTareaHistorial(tareaClass);
        } catch (SQLException ex) {
            Logger.getLogger(TareaHistorial.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    void marcar() {
         try {
            TareaAcciones.reactivarTarea(tareaClass);
            Historial.obtenInstancia().eliminarTarea(this);
            proyecto.Tareas.principal.agregarTarea(tareaClass);
        } catch (SQLException ex) {
            Logger.getLogger(TareaHistorial.class.getName()).log(Level.SEVERE, null, ex);
        }       
    }
}
