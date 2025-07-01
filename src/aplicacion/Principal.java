package aplicacion;

import java.util.ArrayList;
import controlador.*;
import persistencia.*;
import modelo.*;


public class Principal {

	public static void main(String[] args) {

		// Crea atributo de conexión con el modelo utilizando una fachada
		FachadaLogica fl = new FachadaLogica();
		FachadaPersistencia fp = new FachadaPersistencia();
		
        // Alta de alumnos internos desde la BD
		ArrayList<Interno> ali = fp.internos();
		for(int i = 0; i< ali.size(); i++) {
	        fl.altaAlumnoInterno(ali.get(i).getCi(), ali.get(i).getNombre(), ali.get(i).getRegAlim());
		}
		
		// Alta alumnos externos desde la BD
		ArrayList<Externo> ale = fp.externos();
		for(int i = 0; i< ale.size(); i++) {
	        fl.altaAlumnoExterno(ale.get(i).getCi(), ale.get(i).getNombre(), ale.get(i).getHobby());
		}

        // Mostrar todos los alumnos
        System.out.println("Listado de alumnos:-----------------------");
        fl.mostrarAlumnos();

        // Consultar si existe un alumno
        int ciConsulta = 12345678;
        System.out.println("\nConsulta por CI " + ciConsulta + ":-----------------");
        if (fl.existeAlumno(ciConsulta)) {
            System.out.println("Existe: " + fl.obtenerAlumno(ciConsulta));
        } else {
            System.out.println("No existe alumno con CI " + ciConsulta);
        }
        // Consultar si existe un alumno
        ciConsulta = 11111111;
        System.out.println("\nConsulta por CI " + ciConsulta + ":-----------------");
        if (fl.existeAlumno(ciConsulta)) {
            System.out.println("Existe alumno \n" + fl.obtenerAlumno(ciConsulta));
        } else {
            System.out.println("No existe alumno con CI " + ciConsulta);
        }

        // Baja de alumnos ----------------
        int ciBaja = 87654321;
        System.out.println("\nEliminando alumno con CI " + ciBaja + " -----------------------");
        if (fl.existeAlumno(ciBaja)) {
        	fl.bajaAlumno(ciBaja);
        } else {
        	System.out.println("Alumno no existe para dar de baja");
        }

        ciBaja = 33333339;
        System.out.println("\nEliminando alumno con CI " + ciBaja + " -----------------------");
        if (fl.existeAlumno(ciBaja)) {
        	fl.bajaAlumno(ciBaja);
        } else {
        	System.out.println("Alumno no existe para dar de baja");
        }
        
        // Mostrar todos los alumnos después de la baja
        System.out.println("\nListado actualizado de alumnos:-----------------------");
        fl.mostrarAlumnos();
        
        // Alta de administrador 1
        System.out.println("\nAlta de administrador:-----------------------\n");
        fl.altaAdministrador(99999999);
        fl.asignarAlumnoAAdministrador(11111111, 99999999);
        fl.asignarAlumnoAAdministrador(22222222, 99999999);
        
        System.out.println("Lista de administradores:-----------------------\n");
        fl.mostrarAdministradores();

        // Alta de administrador 2
        System.out.println("\nAlta de administrador2:-----------------------\n");
        fl.altaAdministrador(88888888);
        fl.asignarAlumnoAAdministrador(44444444, 88888888);
        fl.asignarAlumnoAAdministrador(33333333, 88888888);
        
        System.out.println("Lista de administradores:-----------------------\n");
        fl.mostrarAdministradores();

    }	

}
