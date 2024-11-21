package com.login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegistroDAO {

    public boolean registrarPaciente(String id,String nombre, String apellido, String fechaNacimiento, String genero, String direccion, String telefono, String email, String fechaIngreso) {
        String sql = "INSERT INTO pacientes (id,nombre, apellido, fecha_nacimiento, genero, direccion, telefono, email,fechaIngreso) VALUES (?, ?, ?, ?, ?, ?, ?,?,?)";
            try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setString(1, id);
            statement.setString(2, nombre);
            statement.setString(3, apellido);
            statement.setString(4, fechaNacimiento);
            statement.setString(5, genero);
            statement.setString(6, direccion);
            statement.setString(7, telefono);
            statement.setString(8, email);
            statement.setString(9, fechaIngreso);
            return statement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

   public boolean registrarEspecialista(String nombre, String apellido, String especialidad, String telefono, String email, String fechaContratacion, String horarioDisponible) {
    String sql = "INSERT INTO especialistas (nombre, apellido, especialidad, telefono, email, fecha_contratacion, horario_disponible) VALUES (?, ?, ?, ?, ?, ?, ?)";
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
