/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.login;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class DatabaseConnection {
     private static final String usuario="root";
     private static final String contrasenia="lavilla5441187";
     private static final String bd="basedatosips";
     private static final String ip="localhost";
     private static final String puerto="3306";
    
     private static final String cadena= "jdbc:mysql://localhost:3306/baseDatosIps";
    private static Connection connection;

    public static Connection getConnection() {
        if (connection == null) {
            try {
                connection = DriverManager.getConnection(cadena, usuario, contrasenia);
                JOptionPane.showMessageDialog(null,"se pudo conectar");
            } catch (SQLException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null,"no se pudo conectar");
            }
        }
        return connection;
    }
}
