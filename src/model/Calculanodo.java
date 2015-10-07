package model;

import java.io.File;
import java.io.FileWriter;


public class Calculanodo {
	String VarSalidas = null;
	String VarSalidasJAVA = null;
	String VarEntradas = null;
	String VarEntradasJAVA = null;
	String VarSYSOJAVA = null;
	String VarRSResultados = null;
	String VarArrayResultados = null;
	String VarCLSalidas = null;
	String VarCLEntradas = null;
	String VarAntecedentes = null;
	String VarConsecuentes = null;
	String totalSalidas = "";
	String totalSalidasJAVA = "";
	String totalEntradas = "";
	String totalEntradasJAVA = "";
	String totalSYSOJAVA = "";
	String totalRSResultados = "";
	String totalArrayResultados = "";
	String totalCLSalidas = "";
	String totalCLEntradas = "";
	String totalAntecedentes = "";
	String totalConsecuentes = "";
	String acumuladorSalidas = "";
	String acumuladorEntradas = "";
	String acumuladorFinalSalidas = "";
	String acumuladorFinalEntradas = "";
	String acumuladorFinalReglas = "";
	String acumuladorFinalConsecuentes = "";
	String imprimirReglas = "";

	public void ConstruirJava(nodo N) {

		Salidas(N);
		Entradas(N);
		VLEntradas(N);
		VLSalidas(N);
		ConstruyeReglas(N);
		MostrarEntradasJAVA(N);
		MostrarSalidasJAVA(N);
		MostrarSYSOJAVA(N);
		// ResultadosSimulacionArray(N);



		String textoJAVA = ("package com.fuzzy;" + "\r\n" + "import net.sourceforge.jFuzzyLogic.FIS;\r\n"
				+ "import net.sourceforge.jFuzzyLogic.FunctionBlock;\r\n" + "public class " + N.getNombreNodo()
				+ "{\r\n" + "public static void main(String[] args) throws Exception {\r\n" + "String fileName =" + "\""
				+ N.getNombreNodo() + ".fcl\"" + ";\r\n" + "FIS fis = FIS.load(fileName, true);\r\n"
				+ "if (fis == null) {\r\n" + "System.err.println(" + "\"No se puede cargar el archivo'\""
				+ " + fileName\r\n" + "+ \"\'\");\r\n" + "return;\r\n" + "}\r\n"
				+ "FunctionBlock functionBlock = fis.getFunctionBlock(null);\r\n" + "functionBlock.chart();\r\n"
				+ "//INPUTS\r\n" + totalEntradasJAVA + "\r\n" + "//EVALUAR\r\n" + "functionBlock.evaluate();\r\n"
				+ "//OUTPUTS\r\n" + totalSalidasJAVA + "\r\n" + "System.out.println(functionBlock);\r\n" + totalSYSOJAVA
				+ "\r\n" + totalRSResultados + "\r\n" + totalArrayResultados + "\r\n" + "}\r\n" + "}\r\n");



		try {
			File creaJAVA = new File(
					"C:/Users/Bones/workspace/RESIDIF/src/com/fuzzy/"
							+ N.getNombreNodo() + ".java");

			FileWriter escribirJAVA = new FileWriter(creaJAVA, false);

			escribirJAVA.write(textoJAVA);

			escribirJAVA.close();
		}

		catch (Exception e) {
			System.out.println("Error al escribir");
		}
	}



	public void ConstruirFCL(nodo N) {

		Salidas(N);
		Entradas(N);
		VLEntradas(N);
		VLSalidas(N);
		ConstruyeReglas(N);
		MostrarEntradasJAVA(N);
		MostrarSalidasJAVA(N);
		MostrarSYSOJAVA(N);
		// ResultadosSimulacionArray(N);

		String textoFCL = ("FUNCTION_BLOCK " + N.nombreNodo + "\r\n" + " \r\n" + "VAR_INPUT\r\n" + totalEntradas
				+ "\r\n" + "END_VAR\r\n" + "VAR_OUTPUT \r\n" + totalSalidas + "\r\n" + "END_VAR\r\n" + " \r\n"
				+ acumuladorFinalEntradas + "\r\n" + acumuladorFinalSalidas + "\r\n" + "RULEBLOCK No1 \r\n" + "AND: "
				+ N.SIF.agregacion + ";\r\n" + "ACT: " + N.SIF.activacion + ";\r\n" + "ACCU: " + N.SIF.acumulacion
				+ ";\r\n" + " \r\n" + imprimirReglas + "\r\n" + "END_RULEBLOCK \r\n" + " \r\n" + "END_FUNCTION_BLOCK");

		String textoJAVA = ("package com.fuzzy;" + "\r\n" + "import net.sourceforge.jFuzzyLogic.FIS;\r\n"
				+ "import net.sourceforge.jFuzzyLogic.FunctionBlock;\r\n" + "public class " + N.getNombreNodo()
				+ "{\r\n" + "public static void main(String[] args) throws Exception {\r\n" + "String fileName =" + "\""
				+ N.getNombreNodo() + ".fcl\"" + ";\r\n" + "FIS fis = FIS.load(fileName, true);\r\n"
				+ "if (fis == null) {\r\n" + "System.err.println(" + "\"No se puede cargar el archivo'\""
				+ " + fileName\r\n" + "+ \"\'\");\r\n" + "return;\r\n" + "}\r\n"
				+ "FunctionBlock functionBlock = fis.getFunctionBlock(null);\r\n" + "functionBlock.chart();\r\n"
				+ "//INPUTS\r\n" + totalEntradasJAVA + "\r\n" + "//EVALUAR\r\n" + "functionBlock.evaluate();\r\n"
				+ "//OUTPUTS\r\n" + totalSalidasJAVA + "\r\n" + "System.out.println(functionBlock);\r\n" + totalSYSOJAVA
				+ "\r\n" + totalRSResultados + "\r\n" + totalArrayResultados + "\r\n" + "}\r\n" + "}\r\n");

		try {
			File creaFCL = new File(N.getNombreNodo() + ".fcl");

			FileWriter escribirFCL = new FileWriter(creaFCL, false);

			escribirFCL.write(textoFCL);

			escribirFCL.close();
		}

		catch (Exception e) {
			System.out.println("Error al escribir");
		}

		try {
			File creaJAVA = new File(
					"C:/Users/Bones/workspace/RESIDIF/src/com/fuzzy/"
							+ N.getNombreNodo() + ".java");

			FileWriter escribirJAVA = new FileWriter(creaJAVA, false);

			escribirJAVA.write(textoJAVA);

			escribirJAVA.close();
		}

		catch (Exception e) {
			System.out.println("Error al escribir");
		}
	}

	public String Salidas(nodo N) {

		int n = N.getVLSalida().size();

		for (int i = 0; i < n; i++) {
			VarSalidas = N.getVLSalida().get(i).getNombreVL() + ": REAL; \r\n";
			totalSalidas = totalSalidas + VarSalidas;
		}
		return VarSalidas;
	}

	public String Entradas(nodo N) {

		int n = N.getVLEntrada().size();

		for (int i = 0; i < n; i++) {
			// System.out.println(N.arrayVLEntrada[i].nombreVL);
			VarEntradas = N.getVLEntrada().get(i).getNombreVL() + ": REAL; \r\n";

			totalEntradas = totalEntradas + VarEntradas;
		}
		return VarSalidas;
	}

	public String VLEntradas(nodo N) {
		int n = N.getVLEntrada().size();

		for (int i = 0; i < n; i++) {

			// Calcula tama�o array CLS
			int j = N.getVLEntrada().get(i).getCalificadores().size();


			for (int k = 0; k < j; k++) {

				N.getVLEntrada().get(i).getCalificadores().get(k).getFm();
				//nuevas funciones
				VarCLEntradas = "TERM "

						+ N.getVLEntrada().get(i).getCalificadores().get(k).getNombreCL();
				        if(N.getVLEntrada().get(i).getCalificadores().get(k).getFm().getTipo().equals("Piece-wise linear")){
				        	int s = N.getVLEntrada().get(i).getCalificadores().get(k).getFm().getParametrsoPWL().size();
				        	for (int y = 0; y < s; y++) {
				        		VarCLEntradas = VarCLEntradas + ":= ("+N.getVLEntrada().get(i).getCalificadores().get(k).getFm().getParametrsoPWL().get(y).getX().toString()+","+N.getVLEntrada().get(i).getCalificadores().get(k).getFm().getParametrsoPWL().get(y).getY().toString()+"  ";
				        	}
				        }
				        if(N.getVLEntrada().get(i).getCalificadores().get(k).getFm().getTipo()!= "Piece-wise linear" ){
				        	int s = N.getVLEntrada().get(i).getCalificadores().get(k).getFm().getParametrsoPWL().size();
				        	VarCLEntradas = VarCLEntradas + ":=" + N.getVLEntrada().get(i).getCalificadores().get(k).getFm().getTipo()+"  ";
				        	for (int y = 0; y < s; y++) {
				        		VarCLEntradas = VarCLEntradas + ""+N.getVLEntrada().get(i).getCalificadores().get(k).getFm().getParametros().get(y).toString()+" ";
				        	}
				        }
						VarCLEntradas = VarCLEntradas + "; \r\n";
				totalCLEntradas = totalCLEntradas + VarCLEntradas;

			}
			acumuladorEntradas = "FUZZIFY " + N.getVLEntrada().get(i).getNombreVL()
					+ " \r\n" + totalCLEntradas + "\r\n" + "END_FUZZIFY\r\n"
					+ " \r\n";
			totalCLEntradas = "";

			acumuladorFinalEntradas = acumuladorFinalEntradas
					+ acumuladorEntradas;

		}

		return acumuladorFinalEntradas;

	}

	public String VLSalidas(nodo N) {
		int n = N.getVLSalida().size();

		for (int i = 0; i < n; i++) {

			// Calcula tama�o array CLS
			int j = N.getVLSalida().get(i).getCalificadores().size();

			for (int k = 0; k < j; k++) {

				VarCLSalidas = "TERM "

				+ N.getVLSalida().get(i).getCalificadores().get(k).getNombreCL() + " := (0,1) (4,0); \r\n";
				totalCLSalidas = totalCLSalidas + VarCLSalidas;

			}

			acumuladorSalidas = "DEFUZZIFY " + N.getVLSalida().get(i).getNombreVL() + " \r\n" + totalCLSalidas
					+ "METHOD: " + N.VLSalida.get(i).getConcresor() + ";\r\n" + "DEFAULT := 0;\r\n"
					+ "END_DEFUZZIFY\r\n" + " \r\n";
			totalCLSalidas = "";

			acumuladorFinalSalidas = acumuladorFinalSalidas + acumuladorSalidas;

		}

		return acumuladorFinalSalidas;

	}

	public String ConstruyeReglas(nodo N) {
		int n = N.getSIF().getReglas().size();
		int k;
		int m;

		for (int i = 0; i < n; i++) {
			// size antecedentes
			int j = N.SIF.getReglas().get(i).getAntecedentes().size();

			int l = N.getSIF().getReglas().get(i).getConsecuentes().size();

			// Array Antecedentes

			totalAntecedentes = " IF ";

			for (k = 0; k < j - 1; k++) {
				VarAntecedentes = N.getSIF().getReglas().get(i).getAntecedentes().get(k).getVariableLinguistica()
						+ " IS "

				+ N.getSIF().getReglas().get(i).getAntecedentes().get(k).getCalificadorLinguistico()
						+ N.getSIF().getReglas().get(i).getAntecedentes().get(k).getConector();
				totalAntecedentes = totalAntecedentes + VarAntecedentes;
			}

			totalAntecedentes = totalAntecedentes
					+ N.getSIF().getReglas().get(i).getAntecedentes().get(j - 1).variableLinguistica + " IS "

			+ N.getSIF().getReglas().get(i).getAntecedentes().get(j - 1).getCalificadorLinguistico();
			System.out.println("TOTALANTECEDENTES: " + totalAntecedentes);
			// Array Consecuentes

			totalConsecuentes = " THEN ";
			for (m = 0; m < l - 1; m++) {

				VarConsecuentes = N.getSIF().getReglas().get(i).getConsecuentes().get(m).getVariableLinguistica()
						+ " IS " + N.getSIF().getReglas().get(i).getConsecuentes().get(m).getCalificadorLinguistico()
						+ " AND ";
				totalConsecuentes = totalConsecuentes + VarConsecuentes;
			}

			totalConsecuentes = totalConsecuentes

			+ N.getSIF().getReglas().get(i).getConsecuentes().get(l - 1).getVariableLinguistica() + " IS "
					+ N.getSIF().getReglas().get(i).getConsecuentes().get(l - 1).getCalificadorLinguistico();
			System.out.println("TOTALCONSCUENTES:" + totalConsecuentes);
			acumuladorFinalReglas = "RULE " + (i + 1) + " : " + totalAntecedentes + totalConsecuentes + ";\r\n";
			System.out.println("ACUMULADOR: " + acumuladorFinalReglas);

			imprimirReglas = imprimirReglas + acumuladorFinalReglas + "\r\n";
			totalConsecuentes = null;
			totalAntecedentes = null;
		}
		return imprimirReglas;
	}

	public String MostrarEntradasJAVA(nodo N) {
		int n = N.getVLEntrada().size();

		for (int i = 0; i < n; i++) {
			VarEntradasJAVA = "functionBlock.setVariable(\"" + N.getVLEntrada().get(i).getNombreVL() + "\",3);"
					+ "\r\n";
			totalEntradasJAVA = totalEntradasJAVA + VarEntradasJAVA;
		}
		return totalEntradasJAVA;
	}

	public String MostrarSalidasJAVA(nodo N) {
		int n = N.getVLSalida().size();

		for (int i = 0; i < n; i++) {
			VarSalidasJAVA = "functionBlock.getVariable(\"" + N.getVLSalida().get(i).getNombreVL()
					+ "\").chartDefuzzifier(true);" + "\r\n";
			totalSalidasJAVA = totalSalidasJAVA + VarSalidasJAVA;
		}
		return totalSalidasJAVA;
	}

	public String MostrarSYSOJAVA(nodo N) {
		int n = N.getVLSalida().size();

		for (int i = 0; i < n; i++) {
			VarSYSOJAVA = "System.out.println(\"" + N.getVLSalida().get(i).getNombreVL()
					+ "\" + functionBlock.getVariable(\"" + N.getVLSalida().get(i).getNombreVL() + "\" ).getValue());"
					+ "\r\n";
			totalSYSOJAVA = totalSYSOJAVA + VarSYSOJAVA;
		}
		return totalSYSOJAVA;
	}

	// public String ResultadosSimulacionArray (nodo N){
	// int n = 0;
	// while (N.VLSalida[n] != null) {
	// n = n + 1;
	// }
	//
	// for (int j = 0; j < n; j++){
	// VarRSResultados = "resultadoSimulacion RS"+j+" = new
	// resultadoSimulacion();";
	// totalRSResultados = totalRSResultados + VarRSResultados;
	//
	// }
	//
	// for (int i = 0; i < n; i++) {
	// VarArrayResultados = "RS"+i+".variableLinguistica = \"" +
	// N.VLSalida[i].nombreVL +"\";\r\n"+"RS"+i+".Resultado =
	// functionBlock.getVariable(\""+ N.VLSalida[i].nombreVL +
	// "\").getValue();\r\n"
	// +"Administrador.arrayResultadosSimulacion.add(RS"+i+");\r\n";
	// totalArrayResultados = totalArrayResultados + VarArrayResultados;
	// //Administrador.contadorArrayResultados++;
	// }
	//
	//
	// return totalArrayResultados;
	//
	// }

}
