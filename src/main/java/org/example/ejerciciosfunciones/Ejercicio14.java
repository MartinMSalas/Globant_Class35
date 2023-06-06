package org.example.ejerciciosfunciones;

import java.util.Scanner;

public class Ejercicio14 {
    public static void ejercicio14(int cantEuros,String monedaAConvertir) {
//        Crea una aplicación que a través de una función nos convierta una cantidad de euros
//        introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
//        función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
//        una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
//                (void).
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ejercicio 14");
        switch (monedaAConvertir) {
            case "dolares" -> {
                System.out.println("La cantidad de euros ingresada es: " + cantEuros);
                System.out.println("La cantidad de dolares es: " + cantEuros * 1.07);
            }
            case "yenes" -> {
                System.out.println("La cantidad de euros ingresada es: " + cantEuros);
                System.out.println("La cantidad de yenes es: " + cantEuros * 150.46);
            }
            case "libras" -> {
                System.out.println("La cantidad de euros ingresada es: " + cantEuros);
                System.out.println("La cantidad de libras es: " + cantEuros * 0.87);
            }
            default -> System.out.println("La moneda ingresada no es válida");
        }

    }
}
