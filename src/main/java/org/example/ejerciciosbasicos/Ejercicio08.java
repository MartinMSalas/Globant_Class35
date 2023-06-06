package org.example.ejerciciosbasicos;

import java.util.Scanner;

public class Ejercicio08 {
    public static void ejercicio8() {
//        Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. Si el
//        usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por
//        pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”.
//        Nota: investigar la función Lenght() en Java.
        System.out.println("Ejercicio 8");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una frase o palabra de 8 caracteres");
        String frase = scanner.nextLine();
        if (frase.length() == 8) {
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }
    }
}
