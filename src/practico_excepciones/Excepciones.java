package practico_excepciones;

// Teorico 19 - excepciones

public class Excepciones {

	public static void main(String[] args) {
		
		try {
			int []misNumeros = {1, 2, 3};
			System.out.println (misNumeros[1]);
			System.out.println (misNumeros[10]);

		} catch (Exception e) {
			System.out.println ("Hay algún error");
			System.out.println ("Datos de la excepcion: " + e.getMessage());
		} finally {
			System.out.println ("El 'try catch' ha terminado.");
		} // fin del try
		
		int numerador=10;
		int denominador=0;
		float division;
		System.out.println ("----------------------------");
		System.out.println ("Antes de la división");
		division = 0;
		try {
			division=numerador/denominador;
		}catch (ArithmeticException ex) {
			division =0; //si hay una excepcion le doy el valor 0 a division
			System.out.println ("Error: "+ex.getMessage());
		} finally {
			System.out.println ("División: "+ division);
			System.out.println ("Después de división");
		} // fin del 2o try
		
		
		
		
		
	} // fin del main

}
