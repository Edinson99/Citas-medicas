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
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class MenuEspecialista extends JFrame {
    // Constructor de la clase
    public MenuEspecialista() {
        setTitle("Menú Especialista");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        // Botones de menú
        JButton btnConsultarCitas = new JButton("Consultar Citas");
        btnConsultarCitas.setBounds(100, 50, 200, 30);
        add(btnConsultarCitas);

        JButton btnRegistrarDiagnostico = new JButton("Registrar Diagnósticos");
        btnRegistrarDiagnostico.setBounds(100, 100, 200, 30);
        add(btnRegistrarDiagnostico);

        JButton btnVerHorario = new JButton("Ver Horario");
        btnVerHorario.setBounds(100, 150, 200, 30);
        add(btnVerHorario);

        JButton btnCerrarSesion = new JButton("Cerrar Sesión");
        btnCerrarSesion.setBounds(100, 200, 200, 30);
        add(btnCerrarSesion);

        // Acción para consultar citas
        btnConsultarCitas.addActionListener(e -> {
            new ConsultaCitas().setVisible(true);
            dispose(); // Cierra el menú actual
        });

        // Acción para registrar diagnóstico
        btnRegistrarDiagnostico.addActionListener(e -> {
            String paciente = JOptionPane.showInputDialog(this, "Ingrese el nombre del paciente:");
            String diagnostico = JOptionPane.showInputDialog(this, "Ingrese el diagnóstico:");
            if (paciente != null && diagnostico != null) {
                // Aquí guardarías el diagnóstico en una base de datos o lista
                JOptionPane.showMessageDialog(this, "Diagnóstico registrado para " + paciente + ":\n" + diagnostico);
            }
        });

        // Acción para ver horario
        btnVerHorario.addActionListener(e -> {
            // Aquí mostrarías el horario real del especialista, por ejemplo en una ventana emergente
            JOptionPane.showMessageDialog(this, "Este es el horario del especialista:\nLunes a Viernes: 8:00 AM - 5:00 PM");
        });

        // Acción para cerrar sesión
        btnCerrarSesion.addActionListener(e -> {
            new LoginFrame().setVisible(true);
            dispose();
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MenuEspecialista().setVisible(true));
    }
}
