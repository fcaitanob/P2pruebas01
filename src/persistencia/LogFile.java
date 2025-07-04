package persistencia;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LogFile {

	private static File archivoLog = new File("log.txt");
	private static LocalDateTime fechayhora = LocalDateTime.now();
	private static DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");
	
	
	public static void creoLog() {
		try {
			if (archivoLog.createNewFile()) {
				//System.out.println("Archivo de nombre: " + archivoLog.getName());
			} else {
				//System.out.println("Archivo ya existente");
			}
		} catch (IOException e) {
			System.out.println("Error");
			e.printStackTrace();
		}
	}
	
	public static void escriboLog(String s) {
		FileWriter miArc = null;
		fechayhora = LocalDateTime.now();
		String fh = "\n" + fechayhora.format(formato) + ": ";
		try {
			miArc = new FileWriter("log.txt", true);
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			miArc.write(fh + s);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			miArc.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		creoLog();
	}

}
