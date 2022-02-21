package gui;

import acciones.TareaAcciones;
import clases.TareaClass;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;


public class TareaVisualizar extends Tarea{

    final TareaClass tareaClass;
    
    public TareaVisualizar(TareaClass tareaClass) {
        this.tareaClass = tareaClass;
        actividadTxt.setEditable(false);
        actividadTxt.setText(tareaClass.actividad);
        fechaSpinner.setEnabled(false);
        fechaSpinner.setValue(new Date(tareaClass.fecha));
        avanceTxt.setEditable(false);
        avanceTxt.setText(String.valueOf(tareaClass.avance));
        descripcionTxt.setEditable(false);
        descripcionTxt.setText(tareaClass.descripcion);
        /*if (tareaClass.contra == null){
            contraTxt.setVisible(false);
            contraLabel.setVisible(false);
        } 
        else {
            contraTxt.setText("******");
            contraTxt.setEditable(false);
        }*/
        
        
        eliminarButton.setVisible(true);
        terminarButton.setVisible(true);
    }

    @Override
    void eliminar() {
        try {
            TareaAcciones.eliminarTarea(tareaClass);
            proyecto.Tareas.principal.eliminarTarea(this);
        } catch (SQLException ex) {
            Logger.getLogger(TareaVisualizar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    void marcar() {
        try {
            TareaAcciones.finalizarTarea(tareaClass);
            proyecto.Tareas.principal.eliminarTarea(this);
        } catch (SQLException ex) {
            Logger.getLogger(TareaVisualizar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     
    
}
