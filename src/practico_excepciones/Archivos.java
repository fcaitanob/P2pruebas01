package practico_excepciones;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Archivos {

	public static void main(String[] args) {
		try {
			File archivoInet = new File("archivoInet.txt");
			if (archivoInet.createNewFile()) {
				System.out.println("Archivo de nombre: " + archivoInet.getName());
			} else {
				System.out.println("Archivo ya existente");
			}

		} catch (IOException e) {
			System.out.println("Error");
			e.printStackTrace();
		}

		FileWriter miArc;
		try {
			miArc = new FileWriter("archivoInet.txt");
			miArc.write("Hola mundo!");
			miArc.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

}
