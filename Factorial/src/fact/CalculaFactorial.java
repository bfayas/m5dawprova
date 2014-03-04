package fact;

public class CalculaFactorial {

	public int calcfac (int n){

     if (n<0){
    	 System.out.println("No es pot calcular el factorial de un número negatiu");
    	 return 0;
     }else {
	 if (n==0)
		     return 1;
		else {
		    int resultat = n * calcfac(n-1);
		    return resultat;
		}
	}
	}

	/*
	 * double result; result=1; while (n>0) { result = result * n; n=n-1; }
	 * return result; }
	 */

	public static void main(String[] args) {
		CalculaFactorial f = new CalculaFactorial();
		int num=8;
		System.out.println(f.calcfac(num));

	}

}
