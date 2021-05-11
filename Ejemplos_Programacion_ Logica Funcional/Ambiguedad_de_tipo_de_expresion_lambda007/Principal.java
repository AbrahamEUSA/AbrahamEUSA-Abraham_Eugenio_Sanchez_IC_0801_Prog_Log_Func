

public class Principal{
	public static void main(String[] args) {
	     try{
                int a=8, b=4;
                long a1=4, b1=0;
                 System.out.println("==> CalculadoraInt ---> resultado =" +Principal.engine(a, b));
                 System.out.println("==> CalculadoraLong ---> resultado =" +Principal.engine(a1, b1));
         
                } catch (Exception e) {
                System.out.println("Erro al dividir por cero");
            }
            
              
           
	}
//sobre carga de metodos
private static int engine(int x1, int y2){
    
 
        CalculadoraInt op = (x, y) -> x/y;
        return  op.calcular(x1, y2);
   
       
 
}    
private static long engine(long x1, long y2){
 
        CalculadoraLong op1 = (x, y) -> x/y; 
           return  op1.calcular(x1, y2);
}

}