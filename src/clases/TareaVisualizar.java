package clases;

import gui.Tarea;
import java.util.Date;
import java.sql.*;


public class TareaVisualizar extends Tarea {

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
    }
}
