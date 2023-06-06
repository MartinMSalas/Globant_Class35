package org.example.ejerciciobucles;

import java.util.Scanner;

public class Ejercicio12 {
    public static void ejercicio12() {
//        Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
//        dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
//        fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser
//        X y el último tiene que ser una O.
//                Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
//        especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta
//        de FDE, que no respete el formato se considera incorrecta.
//                Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas
//        e incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
//        siguientes funciones de Java Substring(), Length(), equals().
        System.out.println("Ejercicio 12");
        Scanner scanner = new Scanner(System.in);
        int correctas = 0;
        int incorrectas = 0;
        String cadena;
        do {
            System.out.println("Ingrese una cadena de texto");
            cadena = scanner.nextLine();
            if (cadena.length() == 5 && cadena.charAt(0) == 'X' && cadena.charAt(4) == 'O' ){

                correctas++;
                System.out.println("Cadena correcta");

            }else {
                incorrectas++;
                System.out.println("Cadena incorrecta");
            }
        } while (!cadena.equals("&&&&&"));
        System.out.println("La cantidad de cadenas correctas es: " + correctas);
        System.out.println("La cantidad de cadenas incorrectas es: " + incorrectas);

    }
}
