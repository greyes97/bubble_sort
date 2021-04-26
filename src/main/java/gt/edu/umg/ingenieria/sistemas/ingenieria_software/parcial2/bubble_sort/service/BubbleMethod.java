package gt.edu.umg.ingenieria.sistemas.ingenieria_software.parcial2.bubble_sort.service;

public class BubbleMethod {
    
    public String[] sort(String[] cadena){
        String aux;
        for(int i=1; i<=cadena.length; i++) {
            for(int j=0; j<cadena.length-i; j++) {
                if( cadena[j].compareTo(cadena[j+1] ) > 0 ) {
                    aux   = cadena[j];
                    cadena[j]  = cadena[j+1];
                    cadena[j+1]= aux;
                }
            }
        }
        return cadena;
    }

}
