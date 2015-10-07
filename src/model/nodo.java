package model;

import java.util.ArrayList;

public class nodo {
     String nombreNodo;

     ArrayList <variableLinguistica> VLEntrada = new ArrayList <variableLinguistica>();
     ArrayList <variableLinguistica> VLSalida = new ArrayList <variableLinguistica>();
     sistemaDeInferencia SIF = new sistemaDeInferencia();
	public String getNombreNodo() {
		return nombreNodo;
	}
	public void setNombreNodo(String nombreNodo) {
		this.nombreNodo = nombreNodo;
	}
	public ArrayList<variableLinguistica> getVLEntrada() {
		return VLEntrada;
	}
	public void setVLEntrada(ArrayList<variableLinguistica> vLEntrada) {
		VLEntrada = vLEntrada;
	}
	public ArrayList<variableLinguistica> getVLSalida() {
		return VLSalida;
	}
	public void setVLSalida(ArrayList<variableLinguistica> vLSalida) {
		VLSalida = vLSalida;
	}
	public sistemaDeInferencia getSIF() {
		return SIF;
	}
	public void setSIF(sistemaDeInferencia sIF) {
		SIF = sIF;
	}
  //no puden existir variables con nombres iguales dentro de la red (DEBE VALIDARSE)
	public void agregarVariableEntrada(String nombre) {
		variableLinguistica vle=new variableLinguistica();
		vle.setNombreVL(nombre);
		vle.setDifusor("Singleton");
		VLEntrada.add(vle);
	}

	public void agregarVariableSalida(String nombre, String concresor) {
		variableLinguistica vle=new variableLinguistica();
		vle.setNombreVL(nombre);
		vle.setConcresor("COG");
		VLSalida.add(vle);
	}





}
