package simulacion_agosto;

import java.time.LocalDate;
import java.util.HashMap;

public class PruebaHashMap {

	public static void main(String[] args) {
		HashMap<Integer, Perro> perros = new HashMap<>();
		LocalDate fechaAux = LocalDate.of(2020, 2, 15);

		Perro p1 = new Perro(111, fechaAux, "juan");
		perros.put(p1.getIdentificador(), p1);

		p1 = new Perro (222, fechaAux, "dos");
		perros.put(p1.getIdentificador(), p1);
		
		for(Integer i: perros.keySet()) {
			System.out.print(i);
			System.out.println(perros.get(i).getNombre());
		}
		
	}

}
