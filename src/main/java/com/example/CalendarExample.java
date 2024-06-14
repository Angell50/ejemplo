package com.example;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CalendarExample extends JFrame {
    public CalendarExample() {
        // Crear el JFrame
        setTitle("Ejemplo de JCalendar");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Crear el JPanel
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        // Crear el JDateChooser
        JDateChooser dateChooser = new JDateChooser();
        dateChooser.setDateFormatString("dd-MM-yyyy");

        // Agregar el JDateChooser al JPanel
        panel.add(dateChooser);

        // Agregar el JPanel al JFrame
        add(panel);

        // Mostrar el JFrame
        setVisible(true);
    }

    public static void main(String[] args) {
        // Ejecutar en el hilo de eventos de Swing
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CalendarExample();
            }
        });
    }
}
