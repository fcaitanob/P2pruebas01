package PracticoColecciones;

import java.util.ArrayList;

//2 Insertar un elemento en el ArrayList en la primera y última posición. 
public class Ej02 {

	public static void main(String[] args) {

		ArrayList<String> arrStr = new ArrayList<String>();

		// inicializo
		arrStr.add("BBB");
		arrStr.add("CCC");
	
		System.out.println("despliego al principio---------");
		for(int i=0; i<arrStr.size();i++) {
			System.out.println(arrStr.get(i));
		}
		
		arrStr.addFirst("AAA");
		arrStr.addLast("DDD");
		
		System.out.println("despliego al final---------");
		for(int i=0; i<arrStr.size();i++) {
			System.out.println(arrStr.get(i));
		}

		System.out.println("despliego indice 2---------");
		System.out.println(arrStr.get(2));

		System.out.println("elimino indice 2---------");
		System.out.println(arrStr.remove(2));
		System.out.println("despliego sin el índice 2---------");
		for(int i=0; i<arrStr.size();i++) {
			System.out.println(arrStr.get(i));
		}

		
	}

}
