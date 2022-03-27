package main;

import gui.Principal;

public class Main {

    public static void main(String[] args) {
        Principal principal = new Principal();

        //Se determina el tamaño, bloquea el resize, la visibilidad y el focus
        //principal.setBounds(100, 100, 800, 600);
        //principal.setResizable(false);
        principal.setVisible(true);
        principal.requestFocus();


    }


}
