package personal;

public class EmpleatSol {
	private String nomempl;
	private String numempl;
	private int antiguitat;
	private String carrec;
	public String getCarrec() {
		return carrec;
	}

	public void setCarrec(String carrec) {
		this.carrec = carrec;
	}

	public int getAntiguitat() {
		return antiguitat;
	}

	public void setAntiguitat(int antiguitat) {
		this.antiguitat = antiguitat;
	}

	public void setNomempl(String nomempl) {
		this.nomempl = nomempl;
	}

	public void setNumempl(String numempl) {
		this.numempl = numempl;
	}
	
	public EmpleatSol (String nome, String nume, int ante, String dire ){
		this.nomempl=nome;
		this.numempl=nume;
		this.antiguitat=ante;
		this.carrec=dire;
	}
	
	public EmpleatSol(){}
	
}
