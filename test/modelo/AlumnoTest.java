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

	@Test
	void testAgregarAdministrador() {
		AlumnoAux aluAux2 = new AlumnoAux(111, "Alumno uno");
		Administrador admAux2 = new Administrador(111111);
		aluAux2.agregarAdministrador(admAux2);		
		String texto = aluAux2.toString();
        assertEquals(texto, "Persona [CI=111]\n"
        		+ "Alumno [nombre=Alumno uno]\n"
        		+ "SecAdministradores cant: 1\n");
	}

	@Test
	void testAgregarAdministradorYPasarme() {
		AlumnoAux aluAux = new AlumnoAux(111, "Alumno uno");
		Administrador admAux = new Administrador(111111);
		Administrador admAux2 = new Administrador(111112);
		Administrador admAux3 = new Administrador(111113);
		Administrador admAux4 = new Administrador(111114);
		aluAux.agregarAdministrador(admAux);		
		aluAux.agregarAdministrador(admAux2);		
		aluAux.agregarAdministrador(admAux3);		
		aluAux.agregarAdministrador(admAux4);		
		String texto = aluAux.toString();
        assertEquals(texto, "Persona [CI=111]\n"
        		+ "Alumno [nombre=Alumno uno]\n"
        		+ "SecAdministradores cant: 3\n");
	}


}
