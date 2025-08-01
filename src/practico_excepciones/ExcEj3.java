package practico_excepciones;

public class ExcEj3 {
	//3 Escriba código para generar y capturar una excepción del tipo 
	//ArrayIndexOutOfBoundsException 
	//(Índice de array fuera de límites)
	
	public static void main(String[] args) {
		int[] v = new int[5];
		v[0] = 0;
		v[3] = 3;
		
		System.out.println(v[0]);		
		System.out.println(v[3]);
		System.out.println(v[1]);	
		
		try {
			System.out.println(v[15]);
		} catch (Exception e) {
			System.out.println("error");
			System.out.println(e.getMessage());
			//System.out.println(e.initCause(e));
			
		}	finally {
			System.out.println("estoy al final; no aporta mucho");
		}
	} // fin main

} // fin clase
