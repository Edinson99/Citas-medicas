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
import java.util.*;
import java.util.List;
import java.util.ArrayList;
public class ConsultaCitas extends JFrame {
    private JTextArea citasArea;

    public ConsultaCitas() {
        setTitle("Consultar Citas");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new BorderLayout());

        citasArea = new JTextArea();
        citasArea.setEditable(false);
        add(new JScrollPane(citasArea), BorderLayout.CENTER);

        JButton btnCerrar = new JButton("Cerrar");
        btnCerrar.addActionListener(e -> dispose());
        add(btnCerrar, BorderLayout.SOUTH);

        mostrarCitas();
    }

    private void mostrarCitas() {
        // Simulamos algunas citas
        List<Cita> citas = new ArrayList<>();
        citas.add(new Cita("Juan Pérez", new Date(), "10:00 AM"));
        citas.add(new Cita("Ana Gómez", new Date(), "11:00 AM"));
        citas.add(new Cita("Luis Martínez", new Date(), "02:00 PM"));

        StringBuilder sb = new StringBuilder();
        for (Cita cita : citas) {
            sb.append(cita).append("\n\n");
        }

        citasArea.setText(sb.toString());
    }
}
