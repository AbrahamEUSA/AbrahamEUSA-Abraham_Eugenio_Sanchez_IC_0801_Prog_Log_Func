public class Principal {
	public static void main(String[] args) {
   
  
        PruebaExamen pe = (a1,a2,a3) ->  System.out.println("1- :"+(a1 + a2 + a3 ));
	pe.operacionPrueba(5,5,5);
        
        System.out.println("2- : "+ PruebaExamen.operacionPrueba(10, 10));
        
        pe.mensajeHola("ProgramacionFuncional");
        
        pe.mensajeHola();
        
        pe = (a1,a2,a3) ->  System.out.println("5- :"+(a1 + (a2 * a3)) );
      	pe.operacionPrueba(5,PruebaExamen.operacionPrueba(1, 1),PruebaExamen.operacionPrueba( 2,2));
        Principal.miMetodo(pe);//tengo duda ya que con esta linea imprime 9
        Principal.miMetodo((a1,  a2,  a3)->System.out.println("7- :"+(a1 + (a2 / a3))));

        pe=((a1,  a2,  a3)->System.out.println("8- :"+(a1 + ((double)a2 / a3))));
        miMetodo(pe,5,1,2); 
        }
private static void miMetodo(PruebaExamen obExamen){
    
  obExamen.operacionPrueba(5,PruebaExamen.operacionPrueba(2, 2),PruebaExamen.operacionPrueba( 3,3));
}
private static void miMetodo(PruebaExamen obExamen,int a1,int a2, int a3){
   
    
    obExamen.operacionPrueba(a1,PruebaExamen.operacionPrueba(a2, a2),PruebaExamen.operacionPrueba( a3,a3));
}  
}