package modelo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PersonaTest {

    class PersonaAux extends Persona {
        public PersonaAux(int ci) {
            super(ci);
        }
    }
	
    @Test
    public void testGetSetCi() {
        Persona p = new PersonaAux(111);
        assertEquals(111, p.getCi());

        p.setCi(222);
        assertEquals(222, p.getCi());
    }

	@Test
	void testToString() {
	    Persona p = new PersonaAux(123);
        String texto = p.toString();
        assertTrue(texto.contains("Persona [CI=123]"));	}

}
