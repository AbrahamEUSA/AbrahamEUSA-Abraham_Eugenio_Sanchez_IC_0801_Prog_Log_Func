public class Principal {
	public static void main(String[] args) {
   
  
        PruebaExamen pe = (a1,a2,a3) ->  System.out.println("1- :"+(a1 + a2 + a3 ));
	pe.operacionPrueba(5,10,5);
        
        System.out.println("2- : "+ PruebaExamen.operacionPrueba(6, 4));
        
        pe.mensajeHola("ProgramacionFuncional");
        
        pe.mensajeHola();
        
        pe = (a1,a2,a3) ->  System.out.println("5- :"+(a1 + (a2 * a3)) );
	    pe.operacionPrueba(5,10,5);
      	pe.operacionPrueba(1,PruebaExamen.operacionPrueba(1, 2),PruebaExamen.operacionPrueba( 1,2));
       
        //Principal.miMetodo(pe);//tengo duda ya que con esta linea imprime 9
        Principal.miMetodo((a1,  a2,  a3)->System.out.println("7- :"+(a1 + ((double)a2 / a3))));
        pe=((a1,  a2,  a3)->System.out.println("8- :"+(a1 + ((double)a2 / a3))));
        miMetodo(pe,2,2,2); 
        }
private static void miMetodo(PruebaExamen obExamen){
    
  obExamen.operacionPrueba(1,PruebaExamen.operacionPrueba(1, 2),PruebaExamen.operacionPrueba( 1,1));
}
private static void miMetodo(PruebaExamen obExamen,int a1,int a2, int a3){
   
    
    obExamen.operacionPrueba(a1,PruebaExamen.operacionPrueba(a2, a2),PruebaExamen.operacionPrueba( a3,a3));
}  
}