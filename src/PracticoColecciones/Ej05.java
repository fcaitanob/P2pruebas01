package PracticoColecciones;

/*
5 Escriba un programa Java para agregar un elemento especificado al final de una 
LinkedList. 
*/

import java.util.LinkedList;

public class Ej05 {

	public static void main(String[] args) {

		LinkedList<String> lListString = new LinkedList<String>();
		
		lListString.add("BBB");
		lListString.add("ccc");
		
		System.out.println("Listo incial............");
		for(int i=0; i<lListString.size(); i++) {
			System.out.println(lListString.get(i));
		}
		
		lListString.addFirst("AAA");
		lListString.addLast("ZZZ");
		lListString.add(3, "ccc Nuevo");

		System.out.println("Listo final............");
		for(int i=0; i<lListString.size(); i++) {
			System.out.println(lListString.get(i));
		}

		
		
		
		
	}

}
