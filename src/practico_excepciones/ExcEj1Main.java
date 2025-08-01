package practico_excepciones;

import practico_excepciones.ExcEj1Excep.EdadInvalidaException;

public class ExcEj1Main {


	
	
	public static void main(String[] args)  {
        ExcEj1Persona persona = new ExcEj1Persona();

        // primer ejemplo con clase de excepción, persona y main
        try {
            persona.setEdad(-5);  // Esto lanza una excepción
        } catch (EdadInvalidaException e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Programa terminado luego del -5.");
        System.out.println(persona.getEdad());

        try {
            persona.setEdad(5);  // Esto NO lanza una excepción
        } catch (EdadInvalidaException e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Programa terminado luego del 5.");
        System.out.println(persona.getEdad());
        
        
        
    }	
}
