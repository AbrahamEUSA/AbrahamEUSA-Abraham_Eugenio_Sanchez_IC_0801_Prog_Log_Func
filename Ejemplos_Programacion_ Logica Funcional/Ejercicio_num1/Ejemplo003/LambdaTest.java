public class LambdaTest{
	public static void main(String[] args) {
		// Expresión lambda ==>  representa un objeto de una interfaz funcional
		Operaciones op = (num1, num2) -> System.out.println(num1+num2);//implementación del método abstracto  "saludar()"
		                                                     //de la interfaz funcional
		op.imprimeSuma(5,10);
	}
}