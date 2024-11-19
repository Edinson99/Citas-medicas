package com.login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegistroDAO {

    public boolean registrarPaciente(String nombre, String apellido, String fechaNacimiento, String genero, String direccion, String telefono, String email) {
        String sql = "INSERT INTO Paciente (nombre, apellido, fecha_nacimiento, genero, direccion, telefono, email) VALUES (?, ?, ?, ?, ?, ?, ?)";
            try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setString(1, nombre);
            statement.setString(2, apellido);
            statement.setString(3, fechaNacimiento);
            statement.setString(4, genero);
            statement.setString(5, direccion);
            statement.setString(6, telefono);
            statement.setString(7, email);
            return statement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

   public boolean registrarEspecialista(String nombre, String apellido, String especialidad, String telefono, String email, String fechaContratacion, String horarioDisponible) {
    String sql = "INSERT INTO Especialista (nombre, apellido, especialidad, telefono, email, fecha_contratacion, horario_disponible) VALUES (?, ?, ?, ?, ?, ?, ?)";
    try (Connection connection = DatabaseConnection.getConnection();
         PreparedStatement statement = connection.prepareStatement(sql)) {

        statement.setString(1, nombre);
        statement.setString(2, apellido);
        statement.setString(3, especialidad);
        statement.setString(4, telefono);
        statement.setString(5, email);
        statement.setString(6, fechaContratacion);
        statement.setString(7, horarioDisponible);
        return statement.executeUpdate() > 0;
    } catch (SQLException e) {
        e.printStackTrace();
        return false;
    }
}
}
