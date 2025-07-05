package modelo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AlumnoTest {

	
	class AlumnoAux extends Alumno {

		public AlumnoAux(int ci, String nombre) {
			super(ci, nombre);
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

	@Test
	void testAgregarAdministrador() {
		AlumnoAux aluAux = new AlumnoAux(111, "Alumno uno");
		Administrador admAux = new Administrador(111111);
		aluAux.agregarAdministrador(admAux);		
		String texto = aluAux.toString();
        assertEquals(texto, "Persona [CI=111]\n"
        		+ "Alumno [nombre=Alumno uno]\n"
        		+ "SecAdministradores cant: 1\n");
	}
}
