package gui;

import clases.TareaClass;
import java.util.Date;


public class TareaNueva extends Tarea{

    public TareaNueva() {
        actividadTxt.setEditable(true);
        actividadTxt.setText("");
        fechaSpinner.setEnabled(true);
        eliminarButton.setVisible(false);
        terminarButton.setVisible(false);
    }
    TareaClass getTareaClass(){
        Date fecha = (Date) fechaSpinner.getValue();
        String actividad = actividadTxt.getText();
        long avance = Long.parseLong(avanceTxt.getText());
        String contra = contraTxt.getText();
        String descripcion = descripcionTxt.getText();
        TareaClass tareaClass= new TareaClass(fecha.getTime(), actividad, avance, contra, descripcion);
        return tareaClass;
    }

    @Override
    void eliminar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    void marcar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}