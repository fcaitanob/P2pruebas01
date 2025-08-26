package simulacion_agosto;

import java.time.LocalDate;

public class Perro {
	
	private int identificador;
	private LocalDate fechaNacimiento;
	private String nombre;
	
	public Perro(int identificador, LocalDate fechaNacimiento, String nombre) {
		//super();
		this.identificador = identificador;
		this.fechaNacimiento = fechaNacimiento;
		this.nombre = nombre;
	}

	public int getIdentificador() {
		return identificador;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public String getNombre() {
		return nombre;
	}

	
	
	
	
	
	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float calcularRacion() {
		float ret = 0;
		if (getFechaNacimiento().isBefore(LocalDate.of(2012, 1, 1))) {
			ret = 100;
		} else {
			ret = 200;
		}
		return ret;
	}
	
	public String tipoPerro() {
		return("Perro general");
	}
	
	
}
