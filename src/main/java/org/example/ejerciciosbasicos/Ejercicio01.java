package org.example.ejerciciosbasicos;

import java.util.Scanner;

public class Ejercicio01 {
    public static void ejercicio1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ejercicio 1");
        System.out.println("Ingrese el primer numero");
        int numero1 = scanner.nextInt();
        System.out.println("Ingrese el segundo numero");
        int numero2 = scanner.nextInt();
        System.out.println("La suma de los dos numeros es: " + (numero1 + numero2));
    }
}
