/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.login;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistroPaciente extends JFrame {
    private JTextField txtNombre;
    private JTextField txtApellido;
    private JTextField txtFechaNacimiento;
    private JComboBox<String> cmbGenero;
    private JTextField txtDireccion;
    private JTextField txtTelefono;
    private JTextField txtEmail;
    private JButton btnRegistrar;
    private RegistroDAO registroDAO;

    public RegistroPaciente() {
        registroDAO = new RegistroDAO();

        setTitle("Registro de Paciente");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel lblNombre = new JLabel("Nombre:");
        lblNombre.setBounds(30, 30, 100, 25);
        add(lblNombre);

        txtNombre = new JTextField();
        txtNombre.setBounds(150, 30, 200, 25);
        add(txtNombre);

        JLabel lblApellido = new JLabel("Apellido:");
        lblApellido.setBounds(30, 70, 100, 25);
        add(lblApellido);

        txtApellido = new JTextField();
        txtApellido.setBounds(150, 70, 200, 25);
        add(txtApellido);

        JLabel lblFechaNacimiento = new JLabel("Fecha de Nac. (YYYY-MM-DD):");
        lblFechaNacimiento.setBounds(30, 110, 200, 25);
        add(lblFechaNacimiento);

        txtFechaNacimiento = new JTextField();
        txtFechaNacimiento.setBounds(230, 110, 120, 25);
        add(txtFechaNacimiento);

        JLabel lblGenero = new JLabel("Género:");
        lblGenero.setBounds(30, 150, 100, 25);
        add(lblGenero);

        cmbGenero = new JComboBox<>(new String[]{"Masculino", "Femenino", "Otro"});
        cmbGenero.setBounds(150, 150, 200, 25);
        add(cmbGenero);

        JLabel lblDireccion = new JLabel("Dirección:");
        lblDireccion.setBounds(30, 190, 100, 25);
        add(lblDireccion);

        txtDireccion = new JTextField();
        txtDireccion.setBounds(150, 190, 200, 25);
        add(txtDireccion);

        JLabel lblTelefono = new JLabel("Teléfono:");
        lblTelefono.setBounds(30, 230, 100, 25);
        add(lblTelefono);

        txtTelefono = new JTextField();
        txtTelefono.setBounds(150, 230, 200, 25);
        add(txtTelefono);

        JLabel lblEmail = new JLabel("Email:");
        lblEmail.setBounds(30, 270, 100, 25);
        add(lblEmail);

        txtEmail = new JTextField();
        txtEmail.setBounds(150, 270, 200, 25);
        add(txtEmail);

        btnRegistrar = new JButton("Registrar");
        btnRegistrar.setBounds(180, 320, 100, 30);
        add(btnRegistrar);

        btnRegistrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = txtNombre.getText();
                String apellido = txtApellido.getText();
                String fechaNacimiento = txtFechaNacimiento.getText();
                String genero = (String) cmbGenero.getSelectedItem();
                String direccion = txtDireccion.getText();
                String telefono = txtTelefono.getText();
                String email = txtEmail.getText();

                boolean exito = registroDAO.registrarPaciente(nombre, apellido, fechaNacimiento, genero, direccion, telefono, email);
                if (exito) {
                    JOptionPane.showMessageDialog(null, "Paciente registrado con éxito.");
                } else {
                    JOptionPane.showMessageDialog(null, "Error al registrar paciente.");
                }
            }
        });
    }
}
