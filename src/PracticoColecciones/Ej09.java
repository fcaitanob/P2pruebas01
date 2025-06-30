package PracticoColecciones;

/*
9 Escriba un programa Java para asociar el valor especificado con la clave especificada 
en un HashMap. 
10 Escriba un programa Java para contar el número de asignaciones de clave-valor 
(tamaño) en un HashMap.
*/

import java.util.HashMap;
import java.util.Map;

public class Ej09 {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		hm.put(1, "Uruguay");
		hm.put(2, "Argentina");
		hm.put(3, "Brasil");

		//-----------------------------------------------------------------------
		// cargo el entrySet en un Map llamado resultado y lo recorro con un for
		//-----------------------------------------------------------------------
		int cuenta = 0;
        for (Map.Entry<Integer, String> resultado : hm.entrySet()) {
			Integer clave = resultado.getKey();
			String pais = resultado.getValue();
		    System.out.println("clave: " + clave + " - País: " + pais);
		    cuenta++;

		}
        System.out.println("Cantidad con variable cuenta: " + cuenta);
        System.out.println("Cantidad con size: " + hm.size());
		
	}

}
