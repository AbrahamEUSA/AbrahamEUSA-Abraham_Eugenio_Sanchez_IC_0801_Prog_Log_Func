

public class Principal{
	public static void main(String[] args) {
	  	Principal.engine((int x, int y)->  x + y );
	    Principal.engine((int x, int y)->  x * y );
	    Principal.engine((int x, int y)->  x / y );
	    Principal.engine((int x, int y)->  x - y );
	    Principal.engine((int x, int y)->  x % y );
	     Principal.engine((long x, long y)-> x + y );
	     Principal.engine((long x, long y)-> x * y );
	     Principal.engine((long x, long y)-> x / y );
	     Principal.engine((long x, long y)-> x - y );
	     Principal.engine((long x, long y)-> x % y );
 
 
	}
//sobre carga de metodos

private static void engine(CalculadoraInt cal){
try{	 int x = 2, y = 0;
     int resultado = cal.calcular(x, y);
     System.out.println("resultado entero =" + resultado);
       } catch (Exception e) {
                System.err.println("Error al dividir por cero");
            }
      
}

private static void engine(CalculadoraLong cal){
	try{ long x = 2, y = 0;
     long resultado = cal.calcular(x, y);
     System.out.println("resultado long=" + resultado);
      } catch (Exception e) {
                System.err.println("Error al dividir por cero");
            }
}

}