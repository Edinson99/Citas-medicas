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

public class Login extends JFrame {
    private JTextField userTxt;
    private JPasswordField passTxt;

    public Login() {
        initComponents();
    }

    private void initComponents() {
        setTitle("Sistema de Inicio de Sesión BUSSINES HEALTH IPS ");
        setSize(450, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        add(panel);

        JLabel userLabel = new JLabel("Usuario:");
        userLabel.setBounds(50, 50, 80, 25);
        panel.add(userLabel);

        userTxt = new JTextField();
        userTxt.setBounds(150, 50, 150, 25);
        panel.add(userTxt);

        JLabel passLabel = new JLabel("Contraseña:");
        passLabel.setBounds(50, 100, 80, 25);
        panel.add(passLabel);

        passTxt = new JPasswordField();
        passTxt.setBounds(150, 100, 150, 25);
        panel.add(passTxt);

        JButton loginBtn = new JButton("Iniciar Sesión");
        loginBtn.setBounds(50, 150, 120, 25);
        panel.add(loginBtn);

        JButton registerBtn = new JButton("Registrarse");
        registerBtn.setBounds(180, 150, 120, 25);
        panel.add(registerBtn);

        loginBtn.addActionListener(e -> iniciarSesion());
        registerBtn.addActionListener(e -> abrirRegistro());
    }

    private void iniciarSesion() {
        String usuario = userTxt.getText();
        String password = new String(passTxt.getPassword());

        String rol = obtenerRolDelUsuario(usuario, password);
        if (rol != null) {
            switch (rol) {
                case "Administrador":
                    new MenuAdministrador().setVisible(true);
                    break;
                case "Especialista":
                    new MenuEspecialista().setVisible(true);
                    break;
                case "Paciente":
                    new MenuPaciente().setVisible(true);
                    break;
            }
            dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Credenciales inválidas.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void abrirRegistro() {
        String[] opciones = {"Paciente", "Especialista"};
        String seleccion = (String) JOptionPane.showInputDialog(
                this,
                "¿Cómo deseas registrarte?",
                "Registro",
                JOptionPane.QUESTION_MESSAGE,
                null,
                opciones,
                opciones[0]
        );

        if ("Paciente".equals(seleccion)) {
            new RegistroPaciente().setVisible(true);
        } else if ("Especialista".equals(seleccion)) {
            new RegistroEspecialista().setVisible(true);
        }
    }

    private String obtenerRolDelUsuario(String usuario, String password) {
        if (usuario.equals("admin") && password.equals("admin123")) return "Administrador";
        if (usuario.equals("especialista") && password.equals("esp456")) return "Especialista";
        if (usuario.equals("paciente") && password.equals("pac789")) return "Paciente";
        return null;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Login().setVisible(true));
    }
}
