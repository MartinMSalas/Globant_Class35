package org.example.ejerciciosbasicos;

import java.util.Scanner;

public class Ejercicio06 {
    public static void ejercicio6() {
//        Crear un programa que dado un numero determine si es par o impar.
        System.out.println("Ejercicio 6");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println("El numero " + numero + " es par");
        } else {
            System.out.println("El numero " + numero + " es impar");
        }
    }
}
