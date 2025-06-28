package modelo;

public class Externo extends Alumno {
	private String hobby;

    public Externo(int ci, String nombre, String hobby) {
        super(ci, nombre);
        this.hobby = hobby;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    @Override
    public String toString() {
		String texto;
		texto = super.toString() ;
		texto += "Externo [Hobby=" + getHobby() + "]\n";
		return texto;
    }
}
