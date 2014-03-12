package multiplicar;
import java.util.Scanner;

public class tablaMultiplicar {

	private static Scanner leer;
	
	public static void main(String[] args) {
		int valor;
	
        leer=new Scanner(System.in);
		System.out.println ("Introduce un numero entero");
        valor=Integer.parseInt(leer.next());
	  	System.out.println ("Tabla de multiplicar del numero " + valor);
		for	(int i=1; i<=10; i++) {
			System.out.println(valor + " x " + i + " = " + valor*i ); 
		}
	}
}
