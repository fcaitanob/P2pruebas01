package practico_excepciones;

public class ExcEj1ExcepMainSolo {

	// segundo ejemplo con método de clase - static y dos excepciones
    static void verificoEdad(int anios) throws Exception {
    	if (anios > 120) {
    		throw new Exception("Edad demasiado grande");
    	}
    	if (anios < 0) {
    		throw new Exception("Edad debe ser positiva");
    	}
    }


	
	public static void main(String[] args) {
        // 2o ejemplo con excepción en método de clase - static
		int edad = 0;
        System.out.println("2o ejemplo con método de clase - static----------");
        try {
        	edad = 88;
        	System.out.println("Edad: " + edad);        	
        	verificoEdad(edad);
			System.out.println("Edad correcta");
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println("Edad con algún error");
		}
        try {
        	edad = 220;
        	System.out.println("Edad: " + edad);        	
        	verificoEdad(edad);
			System.out.println("Edad correcta");
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println("Edad con algún error");
		}
        try {
        	edad = -5;
        	System.out.println("Edad: " + edad);        	
        	verificoEdad(edad);
			System.out.println("Edad correcta");
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println("Edad con algún error");
		}


	}

}
