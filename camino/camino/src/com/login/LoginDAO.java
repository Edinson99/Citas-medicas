/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author javie
 */
public class LoginDAO {
    public String autenticarUsuario(String username, String password) {
    String sql = "SELECT rol FROM Usuario WHERE username = ? AND password = ?";
    try (Connection connection = DatabaseConnection.getConnection();
         PreparedStatement statement = connection.prepareStatement(sql)) {

        statement.setString(1, username);
        statement.setString(2, password);

        ResultSet resultSet = statement.executeQuery();
        if (resultSet.next()) {
            return resultSet.getString("rol");
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return null; // Retorna null si el usuario no existe o la autenticación falla
}

}
