package modelo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ExternoTest {

	@Test
	void testToString() {
		Externo aux = new Externo(111, "Uno", "hobby uno");
		String texto = aux.toString();
        assertEquals(texto, "Persona [CI=111]\n"
        		+ "Alumno [nombre=Uno]\n"
        		+ "SecAdministradores cant: 0\n"
        		+ "Externo [Hobby=hobby uno]\n");

        assertTrue(texto.contains("hobby uno"));
	}

}
