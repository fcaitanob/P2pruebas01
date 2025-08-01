package PracticoColecciones;

import java.util.ArrayList;

public class Prueba202507P1 {

	public static void main(String[] args) {
		/*
		1 Qué método se usa para agregar un elemento al final de un ArrayList? 
				A) addLast() 
				B) insert() 
				C) append() 
				D) add() 
				Respuesta: D
		*/
		ArrayList <Integer> al = new ArrayList<>();
		al.addLast(1);
		al.addLast(2);
		System.out.println(al);
		al.add(1, 55);
		System.out.println(al);
		
		
		
		
	}
}
