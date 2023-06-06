package org.example.ejerciciosbasicos;

import java.util.Scanner;

public class Ejercicio05 {
    public static void ejercicio5() {
//        Escribir un programa que lea un número entero por teclado y muestre por pantalla el
//        doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ejercicio 5");
        System.out.println("Ingrese un numero");
        int numero = scanner.nextInt();
        System.out.println("El doble del numero es: " + (numero * 2));
        System.out.println("El triple del numero es: " + (numero * 3));
        System.out.println("La raiz cuadrada del numero es: " + Math.sqrt(numero));

    }
}
