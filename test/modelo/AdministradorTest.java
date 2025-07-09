package modelo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import modelo.AlumnoTest.AlumnoAux;

class AdministradorTest {

	class AlumnoAux2 extends Alumno {

		public AlumnoAux2(int ci, String nombre) {
			super(ci, nombre);
		}
		@Override
		public float calculoCuota() {
			return 0;
		}
		
	}

	@Test
	void testAgregarAdministradorYPasarme() {
		AlumnoAux2 aluAux2 = new AlumnoAux2(111, "Alumno uno");
		Administrador admAux21 = new Administrador(111111);
		Administrador admAux22 = new Administrador(111112);
		Administrador admAux23 = new Administrador(111113);
		Administrador admAux24 = new Administrador(111114);
		aluAux2.agregarAdministrador(admAux21);		
		aluAux2.agregarAdministrador(admAux22);		
		aluAux2.agregarAdministrador(admAux23);		
		aluAux2.agregarAdministrador(admAux24);		
		String texto = admAux21.toString();
        assertEquals(texto, "Administrador [CI=111111, Cantidad de alumnos=1]\n"
        					+ "*Persona [CI=111]\n"
        					+ "Alumno [nombre=Alumno uno]\n"
        					+ "SecAdministradores cant: 3\n");
	}

	/*
	@Test
	void testAgregarAlumno() {
		AlumnoAux aluAux = new AlumnoAux(112, "Alumno uno dos");
		Administrador admAux = new Administrador(111111);
		admAux.agregarAlumno(aluAux);		
		String texto = admAux.toString();
        assertEquals(texto, "Administrador [CI=111111, Cantidad de alumnos=1]\n"
        					+ "*Persona [CI=112]\n"
        					+ "Alumno [nombre=Alumno uno dos]\n"
        					+ "SecAdministradores cant: 1\n");
	}
*/
	
	
}
