package PracticoColecciones;

/*
9 Escriba un programa Java para asociar el valor especificado con la clave especificada 
en un HashMap. 
10 Escriba un programa Java para contar el número de asignaciones de clave-valor 
(tamaño) en un HashMap.
*/

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Ej09 {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		hm.put(5, "USA");
		hm.put(1, "Uruguay");
		hm.put(-5, "Chile");
		hm.put(2, "Argentina");
		hm.put(3, "Brasil");

		//-----------------------------------------------------------------------
		// cargo el entrySet en un Map llamado resultado y lo recorro con un for
		// al usar hashmap no me garantiza la salida con orden de clave
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
        
       // Convertir a TreeMap para que quede ordenado por clave
        Map<Integer, String> ordenado = new TreeMap<>(hm);

        for (Map.Entry<Integer, String> entrada : ordenado.entrySet()) {
            System.out.println("Clave: " + entrada.getKey() + ", Valor: " + entrada.getValue());
        }
        
        
        // Recorrer con for
        System.out.println("Utilizar solo for-----------");
        for (Integer i: hm.keySet()) {
            System.out.println("Clave: " + i + ", Valor: " + hm.get(i) );
        	
        }
        
	}

}
