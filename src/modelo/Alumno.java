package modelo;

import java.util.ArrayList;

public abstract class Alumno extends Persona {
	private String nombre;
	private int edad;
	private String direccion;
	private int cuotaMensual;
	private int cuotaReal;

	private ArrayList<Administrador> secAdministradores;
    public static final int MAX_ADMINISTRADOR = 3;

    
	
	public ArrayList<Administrador> getSecAdministradores() {
		return secAdministradores;
	}

	public Alumno(int ci, String nombre) {
		super(ci);
		this.nombre = nombre;
		this.secAdministradores = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	
	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getCuotaMensual() {
		return cuotaMensual;
	}

	public void setCuotaMensual(int cuotaMensual) {
		this.cuotaMensual = cuotaMensual;
	}

	public int getCuotaReal() {
		return cuotaReal;
	}

	public void setCuotaReal(int cuotaReal) {
		this.cuotaReal = cuotaReal;
	}

	@Override // ayuda para no equivocarse en el nombre del método que debe existir
	public String toString() {
		String texto;
		texto = super.toString() ;
		texto += "Alumno [nombre=" + getNombre() + "]\n";
		texto += "SecAdministradores cant: " + this.getSecAdministradores().size() + "\n";
		return texto;
	}
	
	public boolean agregarAdministrador(Administrador a) {
        if (secAdministradores.size() < MAX_ADMINISTRADOR) {
            secAdministradores.add(a);
            return true;
        } else {
            System.out.println("No se puede agregar más de " + MAX_ADMINISTRADOR + " administradores.");
            return false;
        }
    }
	
	
	
	
	
	
	
	

}
