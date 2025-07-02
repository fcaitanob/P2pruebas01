package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;

import modelo.*;

public class FachadaPersistencia {
	BaseDeDatos BD = new BaseDeDatos();


	//----------------------------------------
	// Alta de alumno externo en la BD
	//----------------------------------------
	public void guardarAlumnoExterno(Externo externo) {
	    Connection conn = BD.conectar();

	    try {
	        String sql1 = "INSERT INTO alumnos (CI, nombre, edad, direccion, cuotaMensual, cuotaReal) VALUES (?, ?, ?, ?, ?, ?)";
	        PreparedStatement ps1 = conn.prepareStatement(sql1);
	        ps1.setInt(1, externo.getCi());
	        ps1.setString(2, externo.getNombre());
	        ps1.setInt(3, externo.getEdad());
	        ps1.setString(4, externo.getDireccion());
	        ps1.setInt(5, externo.getCuotaMensual());
	        ps1.setInt(6, externo.getCuotaReal());
	        ps1.executeUpdate();

	        String sql2 = "INSERT INTO aluexterno (ci, hobby) VALUES (?, ?)";
	        PreparedStatement ps2 = conn.prepareStatement(sql2);
	        ps2.setInt(1, externo.getCi());
	        ps2.setString(2, externo.getHobby());
	        ps2.executeUpdate();
	        
	        String sql3 = "INSERT INTO personas (ci) VALUES (?)";
	        PreparedStatement ps3 = conn.prepareStatement(sql3);
	        ps3.setInt(1, externo.getCi());
	        ps3.executeUpdate();

	        
	        
	    } catch (SQLException e) {
	        e.printStackTrace();
	    } finally {
	        BD.desconectar();
	    }
	}

	
	
	
	//----------------------------------------
	// Administradores x alumnos desde la BD
	//----------------------------------------
	public ArrayList<AdmControlaAlumno> admXalu() {
		BD.conectar();
		String sql = "SELECT * FROM p2pruebas01.administra a ";
		ResultSet rs = BD.ejecutarConsulta(sql);
		ArrayList<AdmControlaAlumno> li = new ArrayList<AdmControlaAlumno>();
		try {
			while (rs.next()) {
					AdmControlaAlumno admXal = new AdmControlaAlumno(rs.getInt("ciadmin"), rs.getInt("cialumno"));
					li.add(admXal);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		BD.desconectar();
		return li;
		
	}

	
	
	
	//-------------------------------------
	// Alumnos internos desde la BD
	//-------------------------------------
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
	
	//-------------------------------------
	// Alumnos externos desde la BD
	//-------------------------------------
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
	
	//-------------------------------------
	// Administradores desde la BD
	//-------------------------------------
	public ArrayList<Administrador> administradores() {
		BD.conectar();
		String sql = "SELECT * FROM p2pruebas01.administradores a ";
		ResultSet rs = BD.ejecutarConsulta(sql);
		ArrayList<Administrador> li = new ArrayList<Administrador>();
		try {
			while (rs.next()) {
					Administrador admin = new Administrador(1);
					admin.setCi(rs.getInt("ci"));
					li.add(admin);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		BD.desconectar();
		return li;
	}
	
	
	//-------------------------------------
	// main que solo se usa para probar
	//-------------------------------------
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
