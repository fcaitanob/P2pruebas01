package PracticoColecciones;


import java.util.ArrayList;
import modelo.*;


/* -----------------------------------------
 * En un array puedo almacenar tipos primitivos y objetos
 * Son de largo fijo.
 * Para largo variable utilizo colecciones como ArrayList que pueden almacenar 
 * objetos, no puedo almacenar tipos primitivos.
 * -----------------------------------------
 */

public class Ej01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> autos = new ArrayList<String>();
		autos.add("Fiat 850");
		autos.add("Susuki Fronx");
		
		System.out.println(autos.get(1));
		int largo = autos.size();
		for(int i=0; i<largo; i++) {
			System.out.println(autos.get(i));
		}
		
		
		ArrayList<Interno> alsInts = new ArrayList<Interno>();
		Interno alumnoInterno = new Interno(111, "Nombre Uno", "Vegetariano Uno") ;
		alsInts.add(alumnoInterno);
		alumnoInterno = new Interno(222, "Nombre Dos", "Vegetariano Dos") ;
		alsInts.add(alumnoInterno);
		System.out.println("Alumnos internos----------");
		largo = alsInts.size();
		for(int i=0; i<largo; i++) {
			System.out.println(alsInts.get(i));
		}
		

		ArrayList<Alumno> als = new ArrayList<Alumno>();
		alumnoInterno = new Interno(333, "Nombre Tres", "Vegetariano Tres") ;
		als.add(alumnoInterno);
		alumnoInterno = new Interno(444, "Nombre Cuatro", "Vegetariano Cuatro") ;
		als.add(alumnoInterno);
		System.out.println("Alumnos internos en arrayList de alumnos----------");
		largo = als.size();
		for(int i=0; i<largo; i++) {
			System.out.println(als.get(i));
		}

		ArrayList<Alumno> alsMezcla = new ArrayList<Alumno>();
		alumnoInterno = new Interno(555, "Nombre Cinco interno", "Vegetariano Cinco") ;
		alsMezcla.add(alumnoInterno);
		Externo alumnoExterno = new Externo(666, "Nombre Seis externo", "Vegetariano seis") ;
		alsMezcla.add(alumnoExterno);
		System.out.println("Alumnos Mezcla en arrayList de alumnos----------");
		largo = alsMezcla.size();
		for(int i=0; i<largo; i++) {
			System.out.println(alsMezcla.get(i));
		}

		ArrayList<Persona> alsMezclaPersona = new ArrayList<Persona>();
		alumnoInterno = new Interno(777, "Nombre Siete interno", "Vegetariano Siete") ;
		alsMezclaPersona.add(alumnoInterno);
		alumnoExterno = new Externo(888, "Nombre Ocho externo", "Vegetariano ocho") ;
		alsMezclaPersona.add(alumnoExterno);
		System.out.println("Alumnos Mezcla en arrayList de personas----------");
		largo = alsMezclaPersona.size();
		for(int i=0; i<largo; i++) {
			System.out.println(alsMezclaPersona.get(i));
		}
		
	}

}
