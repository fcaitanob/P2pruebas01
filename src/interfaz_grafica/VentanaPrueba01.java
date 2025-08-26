package interfaz_grafica;

import java.awt.*;
import java.awt.event.*;

public class VentanaPrueba01 {

	public void muestroMenu() {
        Frame frame = new Frame("Menú de prueba 01");
        frame.setSize(400, 300);
        frame.setLayout(new FlowLayout());
        
        // MenuBar
        MenuBar menuBar = new MenuBar();
        
        // Supervisor Menu
        Menu supervisorMenu = new Menu("Supervisor");
        MenuItem administradoresItem = new MenuItem("Lista Administradores");
        MenuItem salirItem = new MenuItem("Salir");
        
        supervisorMenu.add(administradoresItem);
        supervisorMenu.addSeparator();
        supervisorMenu.add(salirItem);
        
        // Administrador Menu
        Menu administradorMenu = new Menu("Administrador");
        MenuItem alumnosItem = new MenuItem("Lista Alumnos");
        
        administradorMenu.add(alumnosItem);
        
        // agrego menúes en el menuBar
        menuBar.add(supervisorMenu);
        menuBar.add(administradorMenu);
        
        // Pongo el menu bar en el frame
        frame.setMenuBar(menuBar);
        
        // Agrego acción para Salir
        salirItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose(); // Cierro window
            }
        });
        
        // window listener para finalizar si le doy en la cruz
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });
        
        frame.setVisible(true);
    }

	
	
	public static void main(String[] args) {
		VentanaPrueba01 menu = new VentanaPrueba01();
		menu.muestroMenu();
	}
}
