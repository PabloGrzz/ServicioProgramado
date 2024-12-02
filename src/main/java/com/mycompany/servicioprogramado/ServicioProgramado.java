/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.servicioprogramado;

/**
 *
 * @author pablo
 */


import java.util.Scanner;
import javax.swing.*;
import java.util.Timer;
import java.util.TimerTask;

public class ServicioProgramado {
    private final Timer timer;
    private int reminderCount;
    private final int maxReminders;
    private final int intervalMinutes;
    private final int breakMinutes;
    static Scanner sc = new Scanner(System.in);

    public ServicioProgramado(int intervalMinutes, int breakMinutes, int maxReminders) {
        this.timer = new Timer();
        this.reminderCount = 0;
        this.maxReminders = maxReminders;
        this.intervalMinutes = intervalMinutes;
        this.breakMinutes = breakMinutes;
    }

    public void start() {
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                if (reminderCount < maxReminders) {
                    reminderCount++;
                    showReminder();
                } else {
                    timer.cancel();
                }
            }
        }, 0, intervalMinutes * 60 *1000);
    }

    private void showReminder() {
        SwingUtilities.invokeLater(() -> {
            JOptionPane.showMessageDialog(null, "¡Es hora de un descanso de " + breakMinutes + " minutos!", "Recordatorio de Descanso", JOptionPane.INFORMATION_MESSAGE);
        });
        System.out.println("Descansa loco!!");
    }

    public static void main(String[] args) {
        
        System.out.println("Introduce cada cuantos minutos quieres el aviso : ");
        int cuantosMinutos = sc.nextInt();
        
        System.out.println("Introduce cuantos minutos quieres descansar : ");
        int tiempoDescanso = sc.nextInt();
        
        System.out.println("Introduce el maximo de recordatorios que quieres : ");
        int cuantosAvisos = sc.nextInt();
        
        System.out.println("Sus avisos quedan programados.");
        
        ServicioProgramado service = new ServicioProgramado(cuantosMinutos, tiempoDescanso, cuantosAvisos); // Ejemplo: cada 30 minutos, descanso de 5 minutos, máximo 10 avisos.
        service.start();
    }
}