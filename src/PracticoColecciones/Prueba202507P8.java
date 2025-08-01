package PracticoColecciones;

import java.util.ArrayList;

public class Prueba202507P8 {

	public static void main(String[] args) {

		ArrayList<Integer> numeros = new ArrayList<>();
		for (int i = 1; i <= 5; i++) {
		 numeros.add(i * 2);
		}
		numeros.removeIf(n -> n % 4 == 0);
		System.out.println(numeros);
		
		
	}

}
