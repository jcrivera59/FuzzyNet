package model;

import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		ArrayList<parametrosPWL> bajo = new ArrayList<parametrosPWL>();
		parametrosPWL p = new parametrosPWL();
		p.setX(0.0);
		p.setY(1.0);
		bajo.add(p);
		parametrosPWL p1 = new parametrosPWL();
		p1.setX(4.0);
		p1.setY(0.0);
        bajo.add(p1);




		Administrador A = new Administrador();
//		A.iniciarMatriz();
		A.setNombreRed("Ejemplo");
	        A.iniciaCapas();
		A.capas.get(0).anadirNodo(0, "Amenaza");
		//Entrada
		A.capas.get(0).nodos.get(0).agregarVariableEntrada("PrecipitacionLLuviosa");
//		A.capas.get(0).nodos.get(0).VLEntrada.get(0).agregarCalificador("alta", "Piece-wise linear", bajo);
		//Salida
		A.getCapas().get(0).getNodos().get(0).agregarVariableSalida("amenaza", "COG");
//		A.capas.get(0).nodos.get(0).VLSalida.get(0).agregarCalificador("alta", "Piece-wise linear", bajo);
		//Regla
		A.getCapas().get(0).getNodos().get(0).getSIF().agregarRegla();
		A.getCapas().get(0).getNodos().get(0).getSIF().getReglas().get(0).agregarAntecedente("alta", "PrecipitacionLLuviosa", "");
		A.getCapas().get(0).getNodos().get(0).getSIF().getReglas().get(0).agregarConsecuente("alta", "amenaza");
		// Calculanodo cn = new Calculanodo();
	 //cn.ConstruirFCL(A.capas.get(0).getNodos().get(0));
		 //cn.ConstruirJava(A.capas.get(0).getNodos().get(0));
		calculaRed cr = new calculaRed();
		calculaRed cr1 = new calculaRed();
		cr1.ConstruirFCL(A);
        cr.ConstruirJava(A);

        cr.correrSimulacion(A);






	}

}
