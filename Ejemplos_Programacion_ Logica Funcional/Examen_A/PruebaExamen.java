 
   /*
Interfaz Funcional
*/

    public interface PruebaExamen{

     public default void mensajeHola() {     
      System.out.println(" Hola mi nombre es Abraham" );
    
    }

     public default void mensajeHola(String cadena){
      
     System.out.println(" La cadena es: " + cadena);
   
    }
     public static int operacionPrueba(int a,int b){
   
     int suma = a+b;
     return suma;
     }

     public void operacionPrueba(int a1, int a2, int a3);

    
    }