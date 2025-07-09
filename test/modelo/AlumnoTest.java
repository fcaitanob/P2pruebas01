package modelo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AlumnoTest {

	
	class AlumnoAux extends Alumno {

		public AlumnoAux(int ci, String nombre) {
			super(ci, nombre);
		}
		@Override
		public float calculoCuota() {
			return 0;
		}

	}
	
	@Test
	void testToString() {
		AlumnoAux aux = new AlumnoAux(111, "Alumno uno");
		String texto = aux.toString();
        assertEquals(texto, "Persona [CI=111]\n"
        		+ "Alumno [nombre=Alumno uno]\n"
        		+ "SecAdministradores cant: 0\n");
		assertTrue(texto.contains("Alumno uno"));
	}

}
