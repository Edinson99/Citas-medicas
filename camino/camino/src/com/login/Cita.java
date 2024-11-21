/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.login;

/**
 *
 * @author javie
 */
import java.util.Date;

public class Cita {
    private String paciente;
    private Date fecha;
    private String hora;
    private String diagnostico;

    public Cita(String paciente, Date fecha, String hora) {
        this.paciente = paciente;
        this.fecha = fecha;
        this.hora = hora;
        this.diagnostico = "Pendiente";
    }

    public String getPaciente() {
        return paciente;
    }

    public Date getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    @Override
    public String toString() {
        return "Paciente: " + paciente + "\n" +
               "Fecha: " + fecha + "\n" +
               "Hora: " + hora + "\n" +
               "Diagnóstico: " + diagnostico;
    }
}
