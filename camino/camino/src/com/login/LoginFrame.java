/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.login;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame extends JFrame {
    private JTextField txtUsername;
    private JPasswordField txtPassword;
    private JButton btnLogin;
    private LoginDAO loginDAO;

    public LoginFrame() {
        loginDAO = new LoginDAO();

        setTitle("Inicio de Sesión");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel lblUsername = new JLabel("Usuario:");
        lblUsername.setBounds(50, 50, 100, 25);
        add(lblUsername);

        txtUsername = new JTextField();
        txtUsername.setBounds(150, 50, 150, 25);
        add(txtUsername);

        JLabel lblPassword = new JLabel("Contraseña:");
        lblPassword.setBounds(50, 100, 100, 25);
        add(lblPassword);

        txtPassword = new JPasswordField();
        txtPassword.setBounds(150, 100, 150, 25);
        add(txtPassword);

        btnLogin = new JButton("Iniciar Sesión");
        btnLogin.setBounds(150, 150, 150, 30);
        add(btnLogin);

        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = txtUsername.getText();
                String password = new String(txtPassword.getPassword());

                String rol = loginDAO.autenticarUsuario(username, password);
                if (rol != null) {
                    JOptionPane.showMessageDialog(null, "Bienvenido, " + username);
                    abrirMenuPorRol(rol);
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos.");
                }
            }
        });
    }

    private void abrirMenuPorRol(String rol) {
        if ("Paciente".equals(rol)) {
            new MenuPaciente().setVisible(true);
        } else if ("Especialista".equals(rol)) {
            new MenuEspecialista().setVisible(true);
        } else if ("Administrador".equals(rol)) {
            new MenuAdministrador().setVisible(true);
        }
    }
}
