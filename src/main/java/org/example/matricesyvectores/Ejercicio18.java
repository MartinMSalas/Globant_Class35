package org.example.matricesyvectores;

public class Ejercicio18 {
    public static void ejercicio18() {
//        Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
//        traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene
//        cambiando sus filas por columnas (o viceversa).
        System.out.println("Ejercicio 18");
        int[][] matriz = new int[4][4];
        int[][] matrizTraspuesta = new int[4][4];
        cargarMatriz(matriz);
        System.out.println("Matriz original");
        mostrarMatriz(matriz);
        System.out.println("Matriz traspuesta");
        transponerMatriz(matriz,matrizTraspuesta);
        mostrarMatriz(matrizTraspuesta);

    }
    public static void mostrarMatriz(int[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("|");
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]+"|");
            }
            System.out.println();
        }
    }
    public static void cargarMatriz(int[][] matriz){
        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j]=(int)(Math.random()*11);

            }

        }
    }
    public static void transponerMatriz(int[][] matriz, int[][] matrizTraspuesta){
        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {
                matrizTraspuesta[j][i]=matriz[i][j];

            }

        }
    }
}
