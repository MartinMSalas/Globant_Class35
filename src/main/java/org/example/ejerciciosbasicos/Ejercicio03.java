package org.example.ejerciciosbasicos;

import java.util.Scanner;

public class Ejercicio03 {
    public static void ejercicio3() {
//        Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
//        en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java.
        System.out.println("Ejercicio 3");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String frase = scanner.nextLine();
        System.out.println("La frase en mayusculas es: " + frase.toUpperCase());
        System.out.println("La frase en minusculas es: " + frase.toLowerCase());

    }
}
