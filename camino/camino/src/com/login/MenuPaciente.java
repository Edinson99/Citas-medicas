/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.login;

/**
 *
 * @author javie
 */
import javax.swing.*;

public class MenuPaciente extends JFrame {
    public MenuPaciente() {
        setTitle("Menú Paciente");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JButton btnGestionarCitas = new JButton("Gestionar citas");
        btnGestionarCitas.setBounds(100, 50, 200, 30);
        add(btnGestionarCitas);

        JButton btnVerHistorial = new JButton("Ver Historial Médico");
        btnVerHistorial.setBounds(100, 100, 200, 30);
        add(btnVerHistorial);

        JButton btnActualizarDatos = new JButton("Actualizar Datos");
        btnActualizarDatos.setBounds(100, 150, 200, 30);
        add(btnActualizarDatos);

        JButton btnCerrarSesion = new JButton("Cerrar Sesión");
        btnCerrarSesion.setBounds(100, 200, 200, 30);
        add(btnCerrarSesion);
        
        
         // Acciones de los botones
        btnGestionarCitas.addActionListener(e -> abrirGestionCitas());
        btnVerHistorial.addActionListener(e -> abrirHistorialMedico());
        btnActualizarDatos.addActionListener(e -> abrirActualizarDatos());
        btnCerrarSesion.addActionListener(e -> {
            new LoginFrame().setVisible(true);
            dispose();
        });
    }
    // Método para abrir la ventana de gestión de citas
    private void abrirGestionCitas() {
        new GestionCitas().setVisible(true);
        dispose(); // Cierra el menú actual
    }

    // Método para abrir la ventana de historial médico
    private void abrirHistorialMedico() {
        new HistorialMedico().setVisible(true);
        dispose(); // Cierra el menú actual
    }

    // Método para abrir la ventana de actualización de datos
    private void abrirActualizarDatos() {
        new ActualizarDatos().setVisible(true);
        dispose(); // Cierra el menú actual
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MenuPaciente().setVisible(true));
    }
}

