package model;

import java.util.ArrayList;

public class variableLinguistica {

    String nombreVL;
    String difusor;
    String concresor;
    ArrayList<calificadorLinguistico> calificadores = new ArrayList<calificadorLinguistico>();

    public String getNombreVL() {
        return nombreVL;
    }

    public void setNombreVL(String nombreVL) {
        this.nombreVL = nombreVL;
    }

    public String getDifusor() {
        return difusor;
    }

    public void setDifusor(String difusor) {
        this.difusor = difusor;
    }

    public String getConcresor() {
        return concresor;
    }

    public void setConcresor(String concresor) {
        this.concresor = concresor;
    }

    public ArrayList<calificadorLinguistico> getCalificadores() {
        return calificadores;
    }

    public void setCalificadores(ArrayList<calificadorLinguistico> calificadores) {
        this.calificadores = calificadores;
    }

    public void agregarCalificadorPWL(String nombre, String tipo, ArrayList<parametrosPWL> parametros) {
        calificadorLinguistico cl = new calificadorLinguistico();
        cl.setNombreCL(nombre);
        funcionMembresia fm = new funcionMembresia();
        fm.setTipo(tipo);
        fm.setParametrsoPWL(parametros);
        cl.setFm(fm);
        calificadores.add(cl);

    }

    public void agregarCalificador(String nombre, String tipo, ArrayList<Double> parametros) {

        calificadorLinguistico cl = new calificadorLinguistico();
        cl.setNombreCL(nombre);
        funcionMembresia fm = new funcionMembresia();
        if (tipo.equals("Triangular")) {
            fm.setTipo("trian ");
        }
        
        
        fm.setParametros(parametros);
        cl.setFm(fm);
        calificadores.add(cl);

    }
}
