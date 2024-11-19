/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.login;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistroEspecialista extends JFrame {

    private JTextField txtNombre;
    private JTextField txtApellido;
    private JTextField txtEspecialidad;
    private JTextField txtTelefono;
    private JTextField txtEmail;
    private JTextField txtFechaContratacion;
    private JTextField txtHorarioDisponible;
    private JButton btnRegistrar;
    private RegistroDAO registroDAO;

    public RegistroEspecialista() {
        registroDAO = new RegistroDAO();

        setTitle("Registro de Especialista");
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

        JLabel lblEspecialidad = new JLabel("Especialidad:");
        lblEspecialidad.setBounds(30, 110, 100, 25);
        add(lblEspecialidad);

        txtEspecialidad = new JTextField();
        txtEspecialidad.setBounds(150, 110, 200, 25);
        add(txtEspecialidad);

        JLabel lblTelefono = new JLabel("Teléfono:");
        lblTelefono.setBounds(30, 150, 100, 25);
        add(lblTelefono);

        txtTelefono = new JTextField();
        txtTelefono.setBounds(150, 150, 200, 25);
        add(txtTelefono);

        JLabel lblEmail = new JLabel("Email:");
        lblEmail.setBounds(30, 190, 100, 25);
        add(lblEmail);

        txtEmail = new JTextField();
        txtEmail.setBounds(150, 190, 200, 25);
        add(txtEmail);

        JLabel lblFechaContratacion = new JLabel("Fecha Contratación (YYYY-MM-DD):");
        lblFechaContratacion.setBounds(30, 230, 220, 25);
        add(lblFechaContratacion);

        txtFechaContratacion = new JTextField();
        txtFechaContratacion.setBounds(260, 230, 90, 25);
        add(txtFechaContratacion);

        JLabel lblHorarioDisponible = new JLabel("Horario Disponible:");
        lblHorarioDisponible.setBounds(30, 270, 150, 25);
        add(lblHorarioDisponible);

        txtHorarioDisponible = new JTextField();
        txtHorarioDisponible.setBounds(150, 270, 200, 25);
        add(txtHorarioDisponible);

        btnRegistrar = new JButton("Registrar");
        btnRegistrar.setBounds(180, 320, 100, 30);
        add(btnRegistrar);

        btnRegistrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = txtNombre.getText();
                String apellido = txtApellido.getText();
                String especialidad = txtEspecialidad.getText();
                String telefono = txtTelefono.getText();
                String email = txtEmail.getText();
                String fechaContratacion = txtFechaContratacion.getText();
                String horarioDisponible = txtHorarioDisponible.getText();

                boolean exito = registroDAO.registrarEspecialista(nombre, apellido, especialidad, telefono, email, fechaContratacion, horarioDisponible);
                if (exito) {
                    JOptionPane.showMessageDialog(null, "Especialista registrado con éxito.");
                } else {
                    JOptionPane.showMessageDialog(null, "Error al registrar especialista.");
                }
            }
        });
    }
}
