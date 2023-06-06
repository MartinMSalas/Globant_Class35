package org.example.matricesyvectores;

import java.util.Scanner;

public class Ejercicio20 {
    public static void ejercicio20() {
//        Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
//        suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
//        permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
//                El programa deberá comprobar que los números introducidos son correctos, es decir,
//                están entre el 1 y el 9.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ejercicio 20");
        int[][] cuadradoMagico = cargarMatrizAMano();
        Ejercicio18.mostrarMatriz(cuadradoMagico);
        if (checkMatrizMagica(cuadradoMagico)){
            System.out.println("Es un cuadrado magico");
        }else {
            System.out.println("No es un cuadrado magico");
        }

    }
    public static int[][] cargarMatrizAMano(){
        Scanner scanner = new Scanner(System.in);
        int[][] cuadradoMagico = new int[3][3];
        int numero;
        for (int i = 0; i < cuadradoMagico.length; i++) {
            for (int j = 0; j < cuadradoMagico[i].length; j++) {
                do {

                    System.out.println("Ingrese un numero entre 1 y 9");
                    numero = scanner.nextInt();
                }while (numero < 1 || numero > 9);
                cuadradoMagico[i][j] = numero;
            }
        }
        return cuadradoMagico;
    }
    private static boolean checkMatrizMagica(int[][] matriz){
        boolean esMagica = true;
        int sumaFila = 0;
        int sumaColumna = 0;
        int sumaDiagonal = 0;
        int sumaDiagonalInversa = 0;
        int patron = 0;
        for (int i = 0; i < matriz.length; i++) {
            sumaDiagonal = sumaDiagonal + matriz[i][i];
            sumaDiagonalInversa = sumaDiagonalInversa + matriz[i][matriz.length-1-i];
        }
        if(sumaDiagonal != sumaDiagonalInversa) {
            return false;
        }else{
            patron = sumaDiagonal;
            for (int i = 0; i < matriz.length; i++) {
                sumaFila = 0;
                sumaColumna = 0;
                for (int j = 0; j < matriz[i].length; j++) {
                    sumaFila= sumaFila + matriz[i][j];
                    sumaColumna= sumaColumna + matriz[j][i];
                }
                if(sumaFila != patron){
                    return false;
                }
            }
        }
        return true;
    }
}




















