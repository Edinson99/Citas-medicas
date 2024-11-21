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

public class MenuAdministrador extends JFrame {
    public MenuAdministrador() {
        setTitle("Menú Administrador");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JButton btnGestionarUsuarios = new JButton("Gestionar Usuarios");
        btnGestionarUsuarios.setBounds(100, 50, 200, 30);
        add(btnGestionarUsuarios);

        JButton btnGestionarCitas = new JButton("Gestionar Citas");
        btnGestionarCitas.setBounds(100, 100, 200, 30);
        add(btnGestionarCitas);

        JButton btnVerReportes = new JButton("Ver Reportes");
        btnVerReportes.setBounds(100, 150, 200, 30);
        add(btnVerReportes);

        JButton btnConfigurarSistema = new JButton("Configurar Sistema");
        btnConfigurarSistema.setBounds(100, 200, 200, 30);
        add(btnConfigurarSistema);

        JButton btnCerrarSesion = new JButton("Cerrar Sesión");
        btnCerrarSesion.setBounds(100, 250, 200, 30);
        add(btnCerrarSesion);

        btnCerrarSesion.addActionListener(e -> {
            new LoginFrame().setVisible(true);
            dispose();
        });
    }
}
