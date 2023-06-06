package org.example.ejerciciosbasicos;

import java.util.Scanner;

public class Ejercicio09 {
    public static void ejercicio9() {
//        Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase
//        es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que
//        diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar
//        la función Substring y equals() de Java.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ejercicio 9");
        System.out.println("Ingrese una frase o palabra");
        String frase = scanner.nextLine();
        if (frase.substring(0, 1).equals("A")) {
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }
    }
}
