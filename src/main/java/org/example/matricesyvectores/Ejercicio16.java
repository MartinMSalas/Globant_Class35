package org.example.matricesyvectores;

import java.util.Scanner;

public class Ejercicio16 {
    public static void ejercicio16() {
//        Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
//        usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
//        numero y si se encuentra repetido
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ejercicio 16");
        System.out.println("Ingrese el tamaño del vector");
        int n = scanner.nextInt();
        int[] vector = new int[n];
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 11);
        }
        System.out.println("Ingrese un numero a buscar");
        int numeroABuscar = scanner.nextInt();
        boolean encontrado = false;

        for (int i = 0; i < vector.length; i++) {
            System.out.println("Posicion " + i + " valor " + vector[i]);
        }
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == numeroABuscar) {
                if (encontrado) {
                    System.out.println("El numero se encuentra repetido en la posicion " + i );
                } else {
                    System.out.println("El numero se encuentra en la posicion " + i);
                    encontrado = true;
                }
            }
        }
    }
}
