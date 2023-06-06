package org.example.ejerciciobucles;

import java.util.Scanner;

public class Ejercicio10 {
    public static void ejercicio10() {
//        Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
//        números al usuario hasta que la suma de los números introducidos supere el límite inicial.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ejercicio 10");
        System.out.println("Ingrese un valor límite positivo");
        int limite = scanner.nextInt();
        int suma = 0;
        int numero;
        while (suma <= limite) {
            System.out.println("Ingrese un número");
            numero = scanner.nextInt();
            suma += numero;
        }

    }
}
