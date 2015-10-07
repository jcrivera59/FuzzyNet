package model;

import java.util.ArrayList;

public class capa {
     ArrayList <nodo> nodos = new ArrayList <nodo>();
     int nivel;
	public ArrayList<nodo> getNodos() {
		return nodos;
	}
	public void setNodos(ArrayList<nodo> nodos) {
		this.nodos = nodos;
	}
	public int getNivel() {
		return nivel;
	}
	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public void anadirNodo(int index, String nombre) {
		nodo n= new nodo();
		n.setNombreNodo(nombre);

		//preconfiguracion metodos de inferencia
		sistemaDeInferencia sif= new sistemaDeInferencia();
		sif.setAgregacion("MIN");
		sif.setAcumulacion("MAX");
		sif.setActivacion("MIN");

		n.setSIF(sif);


		nodos.add(index, n);

	}
}
