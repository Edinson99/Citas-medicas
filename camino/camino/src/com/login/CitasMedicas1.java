/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.login;

/**
 *
 * @author javie
 */
public class CitasMedicas1 {

 // Clase base Persona
class Persona {
    private String nombre;
    private String apellido;
    private String id;
    private String direccion;
    private String email;
    private String telefono;

    public Persona(String nombre, String apellido, String id, String direccion, String email, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.direccion = direccion;
        this.email = email;
        this.telefono = telefono;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getId() {
        return id;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefono() {
        return telefono;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Apellido: " + apellido + ", ID: " + id +
                ", Dirección: " + direccion + ", Email: " + email + ", Teléfono: " + telefono;
    }
}

// Clase hija Paciente
class Paciente extends Persona {
    private String historialMedico;

    public Paciente(String nombre, String apellido, String id, String direccion, String email, String telefono, String historialMedico) {
        super(nombre, apellido, id, direccion, email, telefono);
        this.historialMedico = historialMedico;
    }

    public String getHistorialMedico() {
        return historialMedico;
    }

    @Override
    public String toString() {
        return super.toString() + ", Historial Médico: " + historialMedico;
    }
}

// Clase hija Especialista
class Especialista extends Persona {
    private String especialidad;

    public Especialista(String nombre, String apellido, String id, String direccion, String email, String telefono, String especialidad) {
        super(nombre, apellido, id, direccion, email, telefono);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    @Override
    public String toString() {
        return super.toString() + ", Especialidad: " + especialidad;
    }
}


}