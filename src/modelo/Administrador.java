package modelo;

import java.util.ArrayList;

public class Administrador extends Persona {

    private ArrayList<Alumno> secAlumnos;
    private static final int MAX_ALUMNOS = 14;

    public Administrador(int ci) {
        super(ci);
        this.secAlumnos = new ArrayList<>();
    }

    public boolean agregarAlumno(Alumno a) {
        if (secAlumnos.size() < MAX_ALUMNOS) {
            secAlumnos.add(a);
            return true;
        } else {
            System.out.println("No se puede agregar más de " + MAX_ALUMNOS + " alumnos.");
            return false;
        }
    }

    public void mostrarAlumnos() {
        System.out.println("Administrador CI: " + ci + " tiene los siguientes alumnos:");
        for (Alumno a : secAlumnos) {
            System.out.println(a);
        }
    }

    @Override
    public String toString() {
    	String texto = "";
    	texto += "Administrador [CI=" + ci + ", Cantidad de alumnos=" + secAlumnos.size() + "]\n";
    	for (Alumno a : secAlumnos) {
    		texto += "*";
            texto += a.toString();
        }
        return texto;
    }	
	
	
	
	
}
