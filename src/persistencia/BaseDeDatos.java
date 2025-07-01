package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BaseDeDatos {

	private String dbName = "p2pruebas01";
	private String url = "jdbc:mysql://localhost:3306/" + dbName;
    private String user = "root"; 
    private String password = "tuclave"; 
    private Connection conn;

	
    
	public Connection getConn() {
		return conn;
	}

	public Connection conectar() {
		
	    try {
			// Establecemos la conexión con la base de datos.
			conn = DriverManager.getConnection (url,user, password);	
			System.out.println("Conexión exitosa");
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }

	    return conn;

	}

	public void desconectar() {
	    if (conn != null) {
	        try {
	            conn.close();
	            System.out.println("Conexión cerrada");
	        } catch (SQLException e) {
	            System.out.println("Error al cerrar la conexión:");
	            e.printStackTrace();
	        }
	    }
	}

	
	// ejecuta consulas select
	public ResultSet ejecutarConsulta(String consultaSQL) {
	    ResultSet resultado = null;

	    try {
	        if (conn == null || conn.isClosed()) {
	            conn = conectar();
	        }
	        Statement sentencia = conn.createStatement();
	        resultado = sentencia.executeQuery(consultaSQL);
	    } catch (SQLException e) {
	        System.out.println("Error al ejecutar la consulta:");
	        e.printStackTrace();
	    }

	    return resultado;
	}
	
	
	public static void main(String[] args) {
		BaseDeDatos x = new BaseDeDatos();
		x.conectar();
		ResultSet rs;
		rs = x.ejecutarConsulta("select * from alumnos");
		try {
			while (rs.next()) {
			    System.out.println("CI: " + rs.getInt("ci") + " - Nombre: " + rs.getString("nombre"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		x.desconectar();
		
	}
	
	
}
