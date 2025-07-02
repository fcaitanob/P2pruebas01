package aplicacion;

import java.util.ArrayList;
import java.util.Scanner;

import controlador.*;
import persistencia.*;
import modelo.*;


public class Principal {

	// Crea atributo de conexión con el modelo utilizando una fachada
	public static FachadaLogica fl = new FachadaLogica();
	public static FachadaPersistencia fp = new FachadaPersistencia();
	static Scanner scan = new Scanner(System.in);
	

	public static void mostrarMenu() {
		
        System.out.println("Menú principal-----------------------\n");
        System.out.println("1. Listar alumnos\n");
        System.out.println("2. Listar administradores\n");
        System.out.println("3. Consultar alumno\n");
        
        System.out.println("90. Fin\n");
		
	}

	
	
	
	public static void consultarAlumno() {
		int ci = 0;
		System.out.println("Ingrese alumno para consultar: ");
		ci = scan.nextInt();
		System.out.println(fl.obtenerAlumno(ci).toString());
	}
	
	
	public static void inicializar() {
		
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
		
		// tomar desde la BD
		// Alta de administrador 1
        //System.out.println("\nAlta de administrador:-----------------------\n");
        fl.altaAdministrador(99999999);
        fl.asignarAlumnoAAdministrador(11111111, 99999999);
        fl.asignarAlumnoAAdministrador(22222222, 99999999);
        
        //System.out.println("Lista de administradores:-----------------------\n");
        //fl.mostrarAdministradores();

        // Alta de administrador 2
        //System.out.println("\nAlta de administrador2:-----------------------\n");
        fl.altaAdministrador(88888888);
        fl.asignarAlumnoAAdministrador(44444444, 88888888);
        fl.asignarAlumnoAAdministrador(33333333, 88888888);
        fl.asignarAlumnoAAdministrador(22222222, 88888888);
		
	}
	
	public static void main(String[] args) {
	
		// Cargo objetos desde la BD
		inicializar();
		
		
		//Menú principal
		int opcion = 0;
		
		do {
			mostrarMenu();
			opcion = scan.nextInt();
			switch (opcion) {
			case 1: 
				fl.mostrarAlumnos();
				break;
			case 3: 
				consultarAlumno();
				break;
			case 90:
				System.out.println("Fin del programa");
				break;
			default:
				System.out.println("Opción inválida");
			}
			System.out.println();
			
		} while (opcion != 90);

		scan.close();

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
        
        
        System.out.println("Lista de administradores:-----------------------\n");
        fl.mostrarAdministradores();

    }	

}
