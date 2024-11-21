/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.login;

import com.toedter.calendar.JDateChooser;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

public class RegistroPaciente extends JFrame {
    private JTextField txtId;
    private JTextField txtNombre;
    private JTextField txtApellido;
    private JDateChooser dateChooserNacimiento;
    private JComboBox<String> cmbGenero;
    private JTextField txtDireccion;
    private JTextField txtTelefono;
    private JTextField txtEmail;
    private JLabel lblFechaIngreso;
    private JButton btnRegistrar;
    private RegistroDAO registroDAO;

    public RegistroPaciente() {
        registroDAO = new RegistroDAO();

        setTitle("Registro de Paciente");
        setSize(500, 550);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel lblId = new JLabel("ID:");
        lblId.setBounds(30, 30, 100, 25);
        add(lblId);

        txtId = new JTextField();
        txtId.setBounds(150, 30, 200, 25);
        add(txtId);

        JLabel lblNombre = new JLabel("Nombre:");
        lblNombre.setBounds(30, 70, 100, 25);
        add(lblNombre);

        txtNombre = new JTextField();
        txtNombre.setBounds(150, 70, 200, 25);
        add(txtNombre);

        JLabel lblApellido = new JLabel("Apellido:");
        lblApellido.setBounds(30, 110, 100, 25);
        add(lblApellido);

        txtApellido = new JTextField();
        txtApellido.setBounds(150, 110, 200, 25);
        add(txtApellido);

        JLabel lblFechaNacimiento = new JLabel("Fecha de Nac.:");
        lblFechaNacimiento.setBounds(30, 150, 150, 25);
        add(lblFechaNacimiento);

        dateChooserNacimiento = new JDateChooser();
        dateChooserNacimiento.setBounds(150, 150, 200, 25);
        dateChooserNacimiento.setDateFormatString("yyyy-MM-dd");
        add(dateChooserNacimiento);

        JLabel lblGenero = new JLabel("Género:");
        lblGenero.setBounds(30, 190, 100, 25);
        add(lblGenero);

        cmbGenero = new JComboBox<>(new String[]{"Masculino", "Femenino", "Otro"});
        cmbGenero.setBounds(150, 190, 200, 25);
        add(cmbGenero);

        JLabel lblDireccion = new JLabel("Dirección:");
        lblDireccion.setBounds(30, 230, 100, 25);
        add(lblDireccion);

        txtDireccion = new JTextField();
        txtDireccion.setBounds(150, 230, 200, 25);
        add(txtDireccion);

        JLabel lblTelefono = new JLabel("Teléfono:");
        lblTelefono.setBounds(30, 270, 100, 25);
        add(lblTelefono);

        txtTelefono = new JTextField();
        txtTelefono.setBounds(150, 270, 200, 25);
        add(txtTelefono);

        JLabel lblEmail = new JLabel("Email:");
        lblEmail.setBounds(30, 310, 100, 25);
        add(lblEmail);

        txtEmail = new JTextField();
        txtEmail.setBounds(150, 310, 200, 25);
        add(txtEmail);

        JLabel lblFechaIngresoTitle = new JLabel("Fecha de Ingreso:");
        lblFechaIngresoTitle.setBounds(30, 350, 150, 25);
        add(lblFechaIngresoTitle);

        lblFechaIngreso = new JLabel();
        lblFechaIngreso.setBounds(150, 350, 200, 25);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        lblFechaIngreso.setText(dateFormat.format(new Date())); // Fecha actual
        add(lblFechaIngreso);

        btnRegistrar = new JButton("Registrar");
        btnRegistrar.setBounds(180, 400, 100, 30);
        add(btnRegistrar);

        btnRegistrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String id = txtId.getText();
                String nombre = txtNombre.getText();
                String apellido = txtApellido.getText();
                String fechaNacimiento = "";
                if (dateChooserNacimiento.getDate() != null) {
                    fechaNacimiento = dateFormat.format(dateChooserNacimiento.getDate());
                }
                String genero = (String) cmbGenero.getSelectedItem();
                String direccion = txtDireccion.getText();
                String telefono = txtTelefono.getText();
                String email = txtEmail.getText();
                String fechaIngreso = lblFechaIngreso.getText(); // Fecha de ingreso actual

                boolean exito = registroDAO.registrarPaciente(id, nombre, apellido, fechaNacimiento, genero, direccion, telefono, email, fechaIngreso);
                if (exito) {
                    JOptionPane.showMessageDialog(null, "Paciente registrado con éxito.");
                } else {
                    JOptionPane.showMessageDialog(null, "Error al registrar paciente.");
                }
            }
        });
    }
}
