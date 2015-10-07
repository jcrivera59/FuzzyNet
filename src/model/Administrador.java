package model;

import java.util.ArrayList;

public class Administrador {

	String nombreRed;
	ArrayList <capa> capas = new ArrayList <capa>();
	VL [][] matrizOD =  new  VL [12][12];
    ArrayList <resultadoSimulacion> resultados = new ArrayList <resultadoSimulacion>();


    public String getNombreRed() {
		return nombreRed;
	}

	public void setNombreRed(String nombreRed) {
		this.nombreRed = nombreRed;
	}

	public ArrayList<capa> getCapas() {
		return capas;
	}

	public void setCapas(ArrayList<capa> capas) {
		this.capas = capas;
	}
   public void anadirCapa(int index) {
	   capa c = new capa();
	   capas.add(index, c);
	}

   public ArrayList<resultadoSimulacion> getResultados() {
	return resultados;
}

public void setResultados(ArrayList<resultadoSimulacion> resultados) {
	this.resultados = resultados;
}

//Enlazamiento con vl nodo origen.
   public void enlazamiento1(nodo origen, nodo destino, variableLinguistica vl) {
	   destino.VLEntrada.add(vl);
	}
   //Enlazamiento con vl nodo destino
   public void enlazamiento2 (nodo origen, nodo destino, variableLinguistica vl) {
	   origen.VLSalida.add(vl);
	}



 

public VL[][] getMatrizOD() {
	return matrizOD;
}

public void setMatrizOD(VL[][] matrizOD) {
	this.matrizOD = matrizOD;
}

public void iniciaCapas(){
capa c= new capa();
getCapas().set(0, c);
}


}
