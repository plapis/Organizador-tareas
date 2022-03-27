package clases;

public class TareaClass{
    long tareaID;
    public final long fecha, avance;
    public final String actividad, contra, descripcion;

    public TareaClass(long fecha, String actividad, long avance, String contra, String descripcion) {
        this.fecha = fecha;
        this.actividad = actividad;
        this.avance = avance;
        this.contra = contra;
        this.descripcion = descripcion;
    }

    public TareaClass(long tareaID, long fecha, String actividad, long avance, String contra, String descripcion) {
        this.tareaID = tareaID;
        this.fecha = fecha;
        this.actividad = actividad;
        this.avance = avance;
        this.contra = contra;
        this.descripcion = descripcion;
    }
    
    public void setID(long tareaID){
        this.tareaID = tareaID;
    }
    
    public long getID(){
        return tareaID;
    }
}