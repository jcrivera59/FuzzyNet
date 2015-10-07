package model;

import java.util.ArrayList;

public class sistemaDeInferencia {
    ArrayList <regla> reglas = new ArrayList <regla>();
    String agregacion;
    String acumulacion;
    String activacion;
	public ArrayList<regla> getReglas() {
		return reglas;
	}
	public void setReglas(ArrayList<regla> reglas) {
		this.reglas = reglas;
	}
	public String getAgregacion() {
		return agregacion;
	}
	public void setAgregacion(String agregacion) {
		this.agregacion = agregacion;
	}
	public String getAcumulacion() {
		return acumulacion;
	}
	public void setAcumulacion(String acumulacion) {
		this.acumulacion = acumulacion;
	}
	public String getActivacion() {
		return activacion;
	}
	public void setActivacion(String activacion) {
		this.activacion = activacion;
	}

	public void agregarRegla() {
		regla r= new regla();
		reglas.add(r);

	}


}
