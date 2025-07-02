package modelo;

public class AdmControlaAlumno {

    private int ciAdmin;
    private int ciAlumno;
    
    public AdmControlaAlumno(int ciAdmin, int ciAlumno) {
        this.ciAdmin = ciAdmin;
        this.ciAlumno = ciAlumno;
    }

    public int getCiAdmin() {
        return ciAdmin;
    }

    public int getCiAlumno() {
        return ciAlumno;
    }
}
