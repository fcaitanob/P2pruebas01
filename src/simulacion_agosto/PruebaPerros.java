package simulacion_agosto;

import java.time.LocalDate;
import java.util.ArrayList;

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
		
		ArrayList<Perro> perros = new ArrayList<Perro>();
		perros.add(dob01);
		perros.add(policia01);
		
		policia01 = new Perro(88801, LocalDate.of(2025, 8, 1), "perro ago01");
		perros.add(policia01);
		
		dob01 = new Doberman(88802, LocalDate.of(2025, 8, 2), "doberman ago02", 25);
		perros.add(dob01);

		System.out.println("------------------------------------------------\n");
		System.out.println("Imprimo con for");
		System.out.println("------------------------------------------------\n");
		for(int i = 0; i< perros.size(); i++) {
			System.out.println("------------------------------------------------");
			System.out.println("El perro se llama: " + perros.get(i).getNombre());
			System.out.println("Identificador: " + perros.get(i).getIdentificador());
			System.out.println("Nacimiento: " + perros.get(i).getFechaNacimiento());
			System.out.println("Ración: " + perros.get(i).calcularRacion());
			System.out.println("Ración: " + perros.get(i).tipoPerro());
			System.out.println("------------------------------------------------\n");
			
		}
		
	}

}
