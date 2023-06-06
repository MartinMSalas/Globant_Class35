package org.example.matricesyvectores;

public class Ejercicio19 {
    public static void ejercicio19(int[][] matriz ) {
        System.out.println("Ejercicio 19");
        int[][] matrizTraspuesta = new int[matriz[0].length][matriz.length];
        System.out.println("Matriz original");
        Ejercicio18.mostrarMatriz(matriz);
        System.out.println("Matriz traspuesta");
        Ejercicio18.transponerMatriz(matriz,matrizTraspuesta);
        Ejercicio18.mostrarMatriz(matrizTraspuesta);
        chequearAntiSimetrica(matriz,matrizTraspuesta);

    }
    public static void chequearAntiSimetrica(int[][] matriz, int[][] matrizTranspuesta){
        boolean esAntiSimetrica = true;
        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {
                if(matriz[i][j]+matrizTranspuesta[i][j] !=0){
                    esAntiSimetrica=false;
                    System.out.println("La matriz no es antisimetrica");
                    return;

                }

            }

        }
        System.out.println("La matriz es antisimetrica");
    }
}
