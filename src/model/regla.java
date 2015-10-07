package model;

import java.util.ArrayList;

public class regla {
    ArrayList <antecedente> antecedentes = new ArrayList <antecedente>();
    ArrayList <consecuente> consecuentes = new ArrayList <consecuente>();
	public ArrayList<antecedente> getAntecedentes() {
		return antecedentes;
	}
	public void setAntecedentes(ArrayList<antecedente> antecedentes) {
		this.antecedentes = antecedentes;
	}
	public ArrayList<consecuente> getConsecuentes() {
		return consecuentes;
	}
	public void setConsecuentes(ArrayList<consecuente> consecuentes) {
		this.consecuentes = consecuentes;
	}

	public void agregarAntecedente(String cl, String vl, String conector) {
		antecedente an= new antecedente();
		an.setVariableLinguistica(vl);
		an.setCalificadorLinguistico(cl);
		an.setConector(conector);

		antecedentes.add(an);

	}

	public void agregarConsecuente(String cl, String vl ) {
		consecuente con= new consecuente();
		con.setVariableLinguistica(vl);
		con.setCalificadorLinguistico(cl);

		consecuentes.add(con);

	}
}
