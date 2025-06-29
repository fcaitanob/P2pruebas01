package modelo; 
 
public class Interno extends Alumno {
	 private String regAlim;  // Régimen alimentario

    public Interno(int ci, String nombre, String regAlim) {
        super(ci, nombre);
        this.regAlim = regAlim;
    }

    public String getRegAlim() {
        return regAlim;
    }

    public void setRegAlim(String regAlim) {
        this.regAlim = regAlim;
    }

    @Override
    public String toString() {
		String texto;
		texto = super.toString() ;
    	texto += "Interno [RegAlim=" + getRegAlim() + "]\n";
    	return texto;
    }	
	
	
}
