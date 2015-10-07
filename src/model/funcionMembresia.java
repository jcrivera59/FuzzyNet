package model;

import java.util.ArrayList;

public class funcionMembresia {
   String tipo;
   ArrayList <Double> parametros = new ArrayList <Double>();
   ArrayList<parametrosPWL> parametrsoPWL = new ArrayList<parametrosPWL>();
public ArrayList<parametrosPWL> getParametrsoPWL() {
	return parametrsoPWL;
}
public void setParametrsoPWL(ArrayList<parametrosPWL> parametrsoPWL) {
	this.parametrsoPWL = parametrsoPWL;
}
public String getTipo() {
	return tipo;
}
public void setTipo(String tipo) {
	this.tipo = tipo;
}
public ArrayList<Double> getParametros() {
	return parametros;
}
public void setParametros(ArrayList<Double> parametros) {
	this.parametros = parametros;
}

}
