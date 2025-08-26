package interfaz_grafica;

import javax.swing.*;
import java.awt.event.*;

public class MenuConSwing {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Menu + JTable");
            frame.setSize(500, 300);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            // Crear la barra de menú
            JMenuBar menuBar = new JMenuBar();

            // Menú "Archivo"
            JMenu fileMenu = new JMenu("Archivo");
            JMenuItem newItem = new JMenuItem("Nuevo");
            JMenuItem exitItem = new JMenuItem("Salir");

            fileMenu.add(newItem);
            fileMenu.addSeparator();
            fileMenu.add(exitItem);

            // Menú "Editar"
            JMenu editMenu = new JMenu("Editar");
            JMenuItem copyItem = new JMenuItem("Copiar");
            JMenuItem pasteItem = new JMenuItem("Pegar");

            editMenu.add(copyItem);
            editMenu.add(pasteItem);

            // Agregar menús a la barra
            menuBar.add(fileMenu);
            menuBar.add(editMenu);

            // Acción de salir
            exitItem.addActionListener(e -> frame.dispose());

            // Asignar la barra de menú al frame
            frame.setJMenuBar(menuBar);

            frame.setVisible(true);
        });
    }
}
