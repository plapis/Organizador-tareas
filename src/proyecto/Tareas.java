package proyecto;
import gui.*;

public class Tareas {
    public static Principal principal;

    public static void main(String[] args) {
        principal = new Principal();
        principal.setVisible(true);                                                //Funcion que hace visible la ventana
        principal.requestFocus();                                                  //Funcion que muestra de manera principal la ventana
    }
    
}
