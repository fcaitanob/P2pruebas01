package modelo;

public abstract class Alumno extends Persona {
	private String nombre;

	public Alumno(int ci, String nombre) {
		super(ci);
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override // ayuda para no equivocarse en el nombre del método que debe existir
	public String toString() {
		String texto;
		texto = super.toString() ;
		texto += "Alumno [nombre=" + getNombre() + "]\n";
		return texto;
	}
	
	
	
	
	
	
	
	
	

}
