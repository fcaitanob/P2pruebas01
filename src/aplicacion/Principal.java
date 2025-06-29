package aplicacion;

//----------------------------------------
// No importar nada de modelo para 
// tener total independencia entre capas
//----------------------------------------

import controlador.*;

public class Principal {

	public static void main(String[] args) {

		// Crea atributo de conexión con el modelo utilizando una fachada
		FachadaLogica fl = new FachadaLogica();
		
        // Alta de alumnos
        fl.altaAlumnoInterno(12345678, "Lucía", "Vegetariano");
        fl.altaAlumnoInterno(87654321, "Carlos", "Carnivoro");
        fl.altaAlumnoExterno(23456789, "María", "Voleibol");

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

        // Baja de un alumno
        int ciBaja = 87654321;
        System.out.println("\nEliminando alumno con CI " + ciBaja + " -----------------------");
        fl.bajaAlumno(ciBaja);

        // Mostrar todos los alumnos después de la baja
        System.out.println("\nListado actualizado de alumnos:-----------------------");
        fl.mostrarAlumnos();
        
        // Alta de administrador 1
        System.out.println("\nAlta de administrador:-----------------------\n");
        fl.altaAdministrador(99999999);
        fl.asignarAlumnoAAdministrador(12345678, 99999999);
        fl.asignarAlumnoAAdministrador(23456789, 99999999);
        
        System.out.println("Lista de administradores:-----------------------\n");
        fl.mostrarAdministradores();

        // Alta de administrador 2
        System.out.println("\nAlta de administrador2:-----------------------\n");
        fl.altaAdministrador(88888888);
        fl.asignarAlumnoAAdministrador(12345678, 88888888);
        fl.asignarAlumnoAAdministrador(23456789, 88888888);
        
        System.out.println("Lista de administradores:-----------------------\n");
        fl.mostrarAdministradores();

    }	

}
