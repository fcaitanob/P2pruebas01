package aplicacion;

import modelo.*;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		// Crear diccionario de alumnos
        Alumnos alumnos = new Alumnos();

        // Alta de alumnos
        alumnos.alta(new Interno(12345678, "Lucía", "Vegetariano"));
        alumnos.alta(new Interno(87654321, "Carlos", "Carnivoro"));
        alumnos.alta(new Externo(23456789, "María", "Voleibol"));

        // Mostrar todos los alumnos
        System.out.println("Listado de alumnos:-----------------------");
        alumnos.mostrarTodos();

        // Consultar si existe un alumno
        int ciConsulta = 12345678;
        System.out.println("\nConsulta por CI " + ciConsulta + ":-----------------");
        if (alumnos.consulta(ciConsulta)) {
            System.out.println("Existe: " + alumnos.obtiene(ciConsulta));
        } else {
            System.out.println("No existe alumno con CI " + ciConsulta);
        }

        // Baja de un alumno
        int ciBaja = 87654321;
        System.out.println("\nEliminando alumno con CI " + ciBaja + " -----------------------");
        alumnos.baja(ciBaja);

        // Mostrar todos los alumnos después de la baja
        System.out.println("\nListado actualizado de alumnos:-----------------------");
        alumnos.mostrarTodos();
        
        // Alta de administrador
        System.out.println("\nAlta de administrador:-----------------------\n");
        Administrador admin = new Administrador(99999999);
        admin.agregarAlumno(alumnos.obtiene(12345678));
        admin.agregarAlumno(alumnos.obtiene(23456789));
        
        System.out.println("Lista de administrador:-----------------------\n");
        System.out.println(admin);     

    }	

}
