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

public class HistorialMedico extends JFrame {

    private JTextArea historialArea;
    private JButton btnSubirHistorial;

    public HistorialMedico() {
        setTitle("Historial Médico");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        historialArea = new JTextArea();
        historialArea.setEditable(false);
        add(new JScrollPane(historialArea), BorderLayout.CENTER);

        btnSubirHistorial = new JButton("Subir Historial Médico");
        add(btnSubirHistorial, BorderLayout.SOUTH);

        btnSubirHistorial.addActionListener(e -> subirHistorial());
    }

    private void subirHistorial() {
        String historial = JOptionPane.showInputDialog(this, "Ingrese los detalles de su historial médico:");
        if (historial != null && !historial.isEmpty()) {
            historialArea.setText(historial);
            JOptionPane.showMessageDialog(this, "Historial médico actualizado.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new HistorialMedico().setVisible(true));
    }
}
