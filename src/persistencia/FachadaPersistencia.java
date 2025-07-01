package persistencia;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import modelo.*;

public class FachadaPersistencia {
	BaseDeDatos BD = new BaseDeDatos();

	
	// Alumnos internos en la BD
	public ArrayList<Interno> internos() {
		BD.conectar();
		String sql = "SELECT * FROM p2pruebas01.alumnos a "
				+ "join p2pruebas01.aluinterno b "
				+ "on a.ci = b.ci "
				+ "order by a.ci ";
		ResultSet rs = BD.ejecutarConsulta(sql);
		ArrayList<Interno> li = new ArrayList<Interno>();
		try {
			while (rs.next()) {
					Interno aluInt = new Interno(1, "", "");
					aluInt.setCi(rs.getInt("ci"));
					aluInt.setNombre(rs.getString("nombre"));
					aluInt.setRegAlim(rs.getString("regalim"));
					li.add(aluInt);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		BD.desconectar();
		return li;
		
	}
	
	// Alumnos externos en la BD
	public ArrayList<Externo> externos() {
		BD.conectar();
		String sql = "SELECT * FROM p2pruebas01.alumnos a "
				+ "join p2pruebas01.aluexterno b "
				+ "on a.ci = b.ci "
				+ "order by a.ci ";
		ResultSet rs = BD.ejecutarConsulta(sql);
		ArrayList<Externo> li = new ArrayList<Externo>();
		try {
			while (rs.next()) {
					Externo aluExt = new Externo(1, "", "");
					aluExt.setCi(rs.getInt("ci"));
					aluExt.setNombre(rs.getString("nombre"));
					aluExt.setHobby(rs.getString("hobby"));
					li.add(aluExt);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		BD.desconectar();
		return li;
		
	}
	
	
	
	public static void main(String[] args) {
		ArrayList<Interno> li = null;
		FachadaPersistencia fp = new FachadaPersistencia();
		li = fp.internos();
		for(int i=0 ; i<li.size(); i++) {
			System.out.print("CI: " + li.get(i).getCi() + " ");
			System.out.print("Nombre: " + li.get(i).getNombre() + " ");
			System.out.println("Regimen: " + li.get(i).getRegAlim() + " ");
			
		}
	}

}
