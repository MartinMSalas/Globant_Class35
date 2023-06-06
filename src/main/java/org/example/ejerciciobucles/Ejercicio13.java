package org.example.ejerciciobucles;

import java.util.Scanner;

public class Ejercicio13 {
    public static void ejercicio13() {
//        Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
//        cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
        System.out.println("Ejercicio 13");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de elementos por lado");
        int elementos = scanner.nextInt();
        for (int i = 0; i < elementos; i++) {
            if(i== 0 || i==elementos-1){
                for (int j = 0; j < elementos; j++) {
                    System.out.print("* ");
                }
            }else {
                System.out.print("* "+"  ".repeat(elementos-2)+"*" );
            }
            System.out.println();
        }
    }
}
