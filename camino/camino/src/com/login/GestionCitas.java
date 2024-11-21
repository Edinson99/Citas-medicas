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
import com.toedter.calendar.JDateChooser;
import java.util.*;

public class GestionCitas extends JFrame {

    private JComboBox<String> especialistaCombo;
    private JButton btnAgendarCita, btnCancelarCita, btnReagendarCita;
    private JTextArea citaArea;
    private JDateChooser fechaChooser;
    private JComboBox<String> horaCombo;

    public GestionCitas() {
        setTitle("Gestionar Citas");
        setSize(400, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Agregar elementos
        JLabel label = new JLabel("Seleccione un especialista:");
        add(label);

        especialistaCombo = new JComboBox<>(new String[]{
            "Dr. Juan Pérez (Cardiólogo)",
            "Dr. Ana Gómez (Dermatólogo)",
            "Dr. Luis Martínez (Pediatra)"
        });
        add(especialistaCombo);

        // Calendario para seleccionar la fecha
        JLabel fechaLabel = new JLabel("Seleccionar Fecha:");
        add(fechaLabel);
        fechaChooser = new JDateChooser();
        fechaChooser.setDateFormatString("dd/MM/yyyy");
        add(fechaChooser);

        // ComboBox para seleccionar la hora
        JLabel horaLabel = new JLabel("Seleccionar Hora:");
        add(horaLabel);
        horaCombo = new JComboBox<>(new String[]{
            "08:00 AM", "09:00 AM", "10:00 AM", "11:00 AM",
            "12:00 PM", "01:00 PM", "02:00 PM", "03:00 PM",
            "04:00 PM", "05:00 PM"
        });
        add(horaCombo);

        // Botones de gestión de citas
        btnAgendarCita = new JButton("Agendar Cita");
        add(btnAgendarCita);
        
        btnCancelarCita = new JButton("Cancelar Cita");
        add(btnCancelarCita);
        
        btnReagendarCita = new JButton("Reagendar Cita");
        add(btnReagendarCita);

        // Área de texto para mostrar la cita
        citaArea = new JTextArea(5, 30);
        citaArea.setEditable(false);
        add(new JScrollPane(citaArea));

        // Eventos para los botones
        btnAgendarCita.addActionListener(e -> agendarCita());
        btnCancelarCita.addActionListener(e -> cancelarCita());
        btnReagendarCita.addActionListener(e -> reagendarCita());
    }

    private void agendarCita() {
        // Obtener los datos seleccionados
        Date fechaSeleccionada = fechaChooser.getDate();
        String especialista = (String) especialistaCombo.getSelectedItem();
        String hora = (String) horaCombo.getSelectedItem();

        if (fechaSeleccionada != null) {
            // Formatear la fecha seleccionada
            String fechaFormateada = String.format("%1$td/%1$tm/%1$tY", fechaSeleccionada);
            citaArea.setText("Cita agendada con " + especialista + "\n" +
                             "Fecha: " + fechaFormateada + "\n" +
                             "Hora: " + hora);
            JOptionPane.showMessageDialog(this, "Cita agendada con " + especialista + " para el " + fechaFormateada + " a las " + hora);
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione una fecha.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void cancelarCita() {
        String especialista = (String) especialistaCombo.getSelectedItem();
        citaArea.setText("Cita cancelada con " + especialista);
        JOptionPane.showMessageDialog(this, "Cita cancelada con " + especialista);
    }

    private void reagendarCita() {
        String especialista = (String) especialistaCombo.getSelectedItem();
        citaArea.setText("Cita reagendada con " + especialista);
        JOptionPane.showMessageDialog(this, "Cita reagendada con " + especialista);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new GestionCitas().setVisible(true));
    }
}
