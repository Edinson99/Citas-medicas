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

public class ActualizarDatos extends JFrame {
    
    private JTextField nombreField, apellidoField, direccionField, telefonoField;
    private JButton btnGuardar;

    public ActualizarDatos() {
        setTitle("Actualizar Datos");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 2, 10, 10));

        add(new JLabel("Nombre:"));
        nombreField = new JTextField();
        add(nombreField);

        add(new JLabel("Apellido:"));
        apellidoField = new JTextField();
        add(apellidoField);

        add(new JLabel("Dirección:"));
        direccionField = new JTextField();
        add(direccionField);

        add(new JLabel("Teléfono:"));
        telefonoField = new JTextField();
        add(telefonoField);

        btnGuardar = new JButton("Guardar Cambios");
        add(btnGuardar);

        btnGuardar.addActionListener(e -> guardarDatos());
    }

    private void guardarDatos() {
        String nombre = nombreField.getText();
        String apellido = apellidoField.getText();
        String direccion = direccionField.getText();
        String telefono = telefonoField.getText();

        // Lógica para guardar los datos en la base de datos o sistema
        JOptionPane.showMessageDialog(this, "Datos actualizados correctamente.");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ActualizarDatos().setVisible(true));
    }
}
