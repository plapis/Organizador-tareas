package clases;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Tiempo {
        public String fecha() {
        Calendar fecha = new GregorianCalendar();
        String month;
        
        String year = Integer.toString(fecha.get(Calendar.YEAR));
        int monthInt = fecha.get(Calendar.MONTH);
        String day = Integer.toString(fecha.get(Calendar.DATE));
        
        month = mes(monthInt + 1);
        
        
        String fechaCompleta = "Hoy es " + day + " de " + month + " del " + year;
        
        return fechaCompleta;
    }
        
        
        
        public String mes(int monthInt){
            String conversion = "";
            
            
            switch (monthInt) {
                case 1 -> conversion = "Enero";
                case 2 -> conversion = "Febrero";
                case 3 -> conversion = "Marzo";
                case 4 -> conversion = "Abril";
                case 5 -> conversion = "Mayo";
                case 6 -> conversion = "Junio";
                case 7 -> conversion = "Julio";
                case 8 -> conversion = "Agosto";
                case 9 -> conversion = "Septiembre";
                case 10 -> conversion = "Octubre";
                case 11 -> conversion = "Noviembre";
                case 12 -> conversion = "Diciembre";
            }
                    
                    
            return conversion;
        }
}
