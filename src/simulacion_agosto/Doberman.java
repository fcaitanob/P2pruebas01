package simulacion_agosto;

import java.time.LocalDate;

public class Doberman extends Perro {

	private float peso;

	public Doberman(int identificador, LocalDate fechaNacimiento, String nombre, float peso) {
		super(identificador, fechaNacimiento, nombre);
		this.peso = peso;
	}
	
	public float getPeso() {
		return peso;
	}
	
	@Override
	public String tipoPerro() {
		return("Perro doberman");
	}

	@Override
	public float calcularRacion() {
		float racion;
		racion = super.calcularRacion();
		racion += this.getPeso() * 0.10;
		return racion;
	}
	
	
	
}
