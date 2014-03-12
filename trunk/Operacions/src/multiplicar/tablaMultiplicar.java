package multiplicar;
import java.util.Scanner;

public class tablaMultiplicar {

	private static Scanner llegir;
	
	public static void main(String[] args) {
		int valor;
	
        llegir=new Scanner(System.in);
		System.out.println ("Introduce un numero entero");
        valor=Integer.parseInt(llegir.next());
	  	System.out.println ("Tabla de multiplicar del numero " + valor);
		for	(int i=1; i<=10; i++) {
			System.out.println(valor + " x " + i + " = " + valor*i ); 
		}
	}
}
