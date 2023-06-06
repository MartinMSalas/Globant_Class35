package org.example.matricesyvectores;

import java.util.Scanner;

public class Ejercicio17 {
//    Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
//    de 2 dígitos, etcétera (hasta 5 dígitos).
    public static void ejercicio17() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ejercicio 17");
        System.out.println("Ingrese el tamaño del vector");
        int n = scanner.nextInt();

        int[] vector = new int[n];

        // rellenar el vector con numeros de 1 a 99999;
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 99999 + 1);
        }

        // mostrar el vector
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Posicion " + i + " valor " + vector[i]);
        }
        // contar cuantos numeros hay de 1 digito, 2 digitos, etc

        int[] contador = new int[5];

        int digitos;
        for (int i = 0; i < vector.length; i++) {
            digitos = contadorDigitos(vector[i]);
            contador[digitos - 1]++;
        }

        for (int i = 0; i < contador.length; i++) {
            System.out.println("Cantidad de numeros con " + (i + 1) + " digitos: " + contador[i]);
        }
    }
    private static int contadorDigitos(int numero){
        int digitos = 0;
        while(numero > 0){
            numero = numero / 10;
            digitos++;
        }
        return digitos;
    }
}
