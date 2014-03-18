package daw;

public class avaluacio {


	public static void main(String[] args) {
		int n;
		int enes[]= {5,5,8,9,5,4};
		String modul="M05";
		String uefe="UF2";
		n=calculNota.calculaNota(modul,uefe,enes);
		System.out.println("La nota de la "+uefe+" és "+n);
	}

}
