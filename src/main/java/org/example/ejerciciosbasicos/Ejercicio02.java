package org.example.ejerciciosbasicos;

import java.util.Scanner;

public class Ejercicio02 {
    public static void ejercicio2() {
//        Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
//        pantalla.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ejercicio 2");
        System.out.println("Ingrese su nombre");
        String nombre = scanner.nextLine();
        System.out.println("Su nombre es: " + nombre);
    }
}
