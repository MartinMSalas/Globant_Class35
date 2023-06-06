package org.example.ejerciciosbasicos;

import java.util.Scanner;

public class Ejercicio04 {
    public static void ejercicio4() {
//        Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
//        Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ejercicio 4");
        System.out.println("Ingrese la temperatura en grados centigrados");
        double gradosCentigrados = scanner.nextDouble();
        double gradosFahrenheit = 32 + (9 * gradosCentigrados / 5);
        System.out.println("La temperatura en grados Fahrenheit es: " + gradosFahrenheit);
    }
}
