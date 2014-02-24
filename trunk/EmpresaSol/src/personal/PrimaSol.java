package personal;

public class PrimaSol {
	
	public static int calculalaPrima(EmpleatSol e) {
		int p=0;
		if (e.getAntiguitat() > 0 && e.getAntiguitat() < 1000) {
			if (e.getCarrec() == "S") {
				if (e.getAntiguitat() < 12)
					p = 400;
				else
					p = 600;
			} else if (e.getCarrec() == "N") {
				if (e.getAntiguitat() < 12)
					p = 100;
				else
					p = 150;
			} else
				System.out.println("Error: el codi del càrrec ha de ser 'S' o 'N'");
		}else{
			System.out.println("La antiugitat ha de ser un número entre 0 i 999");
			/*if (e.getAntiguitat() < 0)
				throw new AntiguitatNegatiu();
			if (e.getAntiguitat() >= 1000)
				throw new AntiguitatMassaGran();*/
		}
		return p;
	}
	

}
