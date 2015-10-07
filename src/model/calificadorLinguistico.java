package model;

import java.util.ArrayList;

public class calificadorLinguistico {
    String nombreCL;
    funcionMembresia fm;
	public String getNombreCL() {
		return nombreCL;
	}
	public void setNombreCL(String nombreCL) {
		this.nombreCL = nombreCL;
	}
	public funcionMembresia getFm() {
		return fm;
	}
	public void setFm(funcionMembresia fm) {
		this.fm = fm;
	}

	public void configuraFuncion(String tipo, ArrayList<parametrosPWL> parametros) {
		fm.setTipo(tipo);
		fm.setParametrsoPWL(parametros);


	}

}
