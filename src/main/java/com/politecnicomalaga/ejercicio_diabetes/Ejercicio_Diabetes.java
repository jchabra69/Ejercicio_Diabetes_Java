/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.politecnicomalaga.ejercicio_diabetes;

/**
 * Aplicación en Java con interfaz de texto (E/S básica)
 * que implementa el protocolo de actuación ante diabetes.
 * @author jncb
 */

import java.util.Scanner;

public class Ejercicio_Diabetes {

    public static void main(String[] args) {

        int glucemia;
        String respuesta;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingresa por teclado el valor actual de glucemia en sangre");
        glucemia = entrada.nextInt();

        if (glucemia <= 70) {
            System.out.println("Tienes hipoglucemia porque tus valores en glucemia están por debajo de 70 mg/dl");

            System.out.println("Escribe c si está consciente");
            respuesta = entrada.next();

            if (respuesta.equals("c")) {

                System.out.println("Debes dar líquidos azucarados de absorción rápida, repetir glucemia 5-10 min después y dar hidratos de carbono de absorción lenta");
                
            } else { //Ahora sabemos que la persona está inconsciente
                System.out.println("¡NO DAR NADA POR BOCA. ADMINISTRAR GLUCAGÓN!, avisar a familia y emergencias.");
            }

        } else if (glucemia > 180) {
            System.out.println("Tienes hiperglucemia porque tus valores en glucemia están por encima de 180 mg/dl");

            
        }

    }
}


