package simulacion_agosto;

import java.time.LocalDate;

public class PruebaPerros {

	public static void main(String[] args) {
		// Esto es para poner una fecha, se usa Calendar y Date
		LocalDate fechaAux = LocalDate.of(2020, 2, 15);
		
		Perro policia01 = new Perro(111, fechaAux, "juan");
		System.out.println("------------------------------------------------");
		System.out.println("El perro se llama: " + policia01.getNombre());
		System.out.println("Identificador: " + policia01.getIdentificador());
		System.out.println("Nacimiento: " + policia01.getFechaNacimiento());
		System.out.println("Ración: " + policia01.calcularRacion());
		System.out.println("Ración: " + policia01.tipoPerro());
		System.out.println("------------------------------------------------\n");

		LocalDate fechaAux2 = LocalDate.of(2020, 2, 18);
		Perro dob01 = new Doberman(222, fechaAux2, "dobi", 20);
		System.out.println("------------------------------------------------");
		System.out.println("El perro se llama: " + dob01.getNombre());
		System.out.println("Identificador: " + dob01.getIdentificador());
		System.out.println("Nacimiento: " + dob01.getFechaNacimiento());
		System.out.println("Ración: " + dob01.calcularRacion());
		System.out.println("Ración: " + dob01.tipoPerro());
		System.out.println("------------------------------------------------\n");
		
		
		
		
	}

}
