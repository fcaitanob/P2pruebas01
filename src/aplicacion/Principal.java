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
	

	//-------------------------------------
	// Texto menu
	//-------------------------------------
	public static void mostrarMenu() {
		
        System.out.println("Menú principal-----------------------\n");
        System.out.println("1. Listar alumnos");
        System.out.println("2. Listar administradores");
        System.out.println("3. Consultar alumno");
        System.out.println("4. Alta alumno externo");
        
        System.out.println("90. Fin\n");
		
	}

	
	//-------------------------------------
	// Alta alumno externo y guardar en BD
	//-------------------------------------
	public static void altaAlumnoExterno() {
		int ci = 0;
		System.out.println("Ingrese cédula de alumno externo para dar de alta: ");
		ci = scan.nextInt();
		String nombre = "";
		System.out.println("Ingrese nombre: ");
		scan.nextLine(); // consumir el ENTER pendiente
		nombre = scan.nextLine();
		int edad = 0;
		System.out.println("Ingrese edad: ");
		edad = scan.nextInt();
		String direccion = "";
		System.out.println("Ingrese dirección: ");
		scan.nextLine(); // consumir el ENTER pendiente
		nombre = scan.nextLine();
		float cuotaMensual = 0;
		System.out.println("Ingrese cuota mensual: ");
		cuotaMensual = scan.nextFloat();
		String hobby = "";
		System.out.println("Ingrese hobby: ");
		scan.nextLine(); // consumir el ENTER pendiente
		hobby = scan.nextLine();
		int admin = 0;
		System.out.println("Ingrese administrador: ");
		admin = scan.nextInt();
		
		
		fl.altaAlumnoExterno(ci, nombre, hobby);
		fl.asignarAlumnoAAdministrador(ci, admin);
		Externo aluExt = new Externo(ci, nombre, hobby);
		aluExt = (Externo) fl.obtenerAlumno(ci);
		fp.altaAlumnoExternoBD(aluExt);
		
	}
	
	
	//-------------------------------------
	// Consultar alumno
	//-------------------------------------
	public static void consultarAlumno() {
		int ci = 0;
		System.out.println("Ingrese alumno para consultar: ");
		ci = scan.nextInt();
		System.out.println(fl.obtenerAlumno(ci).toString());
		ArrayList<Administrador> li = new ArrayList<Administrador>();
		li = fl.obtenerAdmsDeAlumno(ci);
		System.out.println("Administradores del alumno: ----------");
		for(int i=0; i<li.size(); i++) {
			System.out.println(li.get(i).getCi());
		}
	}
	
	
	//----------------------------------------
	// Inicializar objetos y cargar desde BD
	//----------------------------------------
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
		
		// Alta de administradores desde la BD
		ArrayList<Administrador> admins = fp.administradores();
		for(int i = 0; i< admins.size(); i++) {
	        fl.altaAdministrador(admins.get(i).getCi());
		}


		// Alta de administradores x alumno desde la BD
		ArrayList<AdmControlaAlumno> li = fp.admXalu();
		for(int i = 0; i< li.size(); i++) {
			//System.out.println("alumno: " + li.get(i).getCiAlumno());
			//System.out.println("admin: " + li.get(i).getCiAdmin());
	        fl.asignarAlumnoAAdministrador(li.get(i).getCiAlumno(), li.get(i).getCiAdmin());
		}
		
		// Inicializo log
		//LogFile.creoLog();
		LogFile.escriboLog("Inicio del log");
		
	}
	
	//-----------------------------------------
	// Menú ppal
	//-----------------------------------------
	public static void main(String[] args) {
		// Cargo objetos desde la BD
		inicializar();

		//Menú principal
		int opcion = 0;
		do {
			mostrarMenu();
			opcion = scan.nextInt();
			LogFile.escriboLog("Opción seleccionada: " + opcion);
			switch (opcion) {
			case 1: 
				fl.mostrarAlumnos();
				break;
			case 2: 
				fl.mostrarAdministradores();
				break;
			case 3: 
				consultarAlumno();
				break;
			case 4: 
				altaAlumnoExterno();
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

		// codigo muerto para ver más adelante
		if(false) {
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

}
