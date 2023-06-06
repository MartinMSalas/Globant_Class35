package org.example.matricesyvectores;

public class Ejercicio21 {
//    Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de
//3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida
//    dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3 que
//    se pueden formar en la matriz M, desplazándose por filas o columnas, existe al menos una
//    que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la columna de
//    la matriz M en la cual empieza el primer elemento de la submatriz P.
    public static void ejercicio21(){
        System.out.println("Ejercicio 21");
        int[][] matrizM;
        int[][] matrizP;
        matrizM = cargarMatrizCuadrada(10);
        Ejercicio18.mostrarMatriz(matrizM);

        matrizP = cargarMatrizCuadrada(3);
        Ejercicio18.mostrarMatriz(matrizP);
        if(checkMatriz(matrizM,matrizP)){
            System.out.println("La matriz P esta contenida en la matriz M");
        }else {
            System.out.println("La matriz P no esta contenida en la matriz M");
        }

    }
    public static int[][] cargarMatrizCuadrada(int n){
        int[][] matriz = new int[n][n];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j]=(int)(Math.random()*1);
            }
        }
        return matriz;
    }
    public static boolean checkMatriz(int[][] matrizM,int[][] matrizP){

        for (int i = 0; i < matrizM.length-2; i++) {
            for (int j = 0; j < matrizM[i].length-2; j++) {
                if( matrizM[i][j] == matrizP[0][0]){
                    if(matrizM[i][j+1] == matrizP[0][1]){
                        if(matrizM[i][j+2] == matrizP[0][2]){
                            if(matrizM[i+1][j] == matrizP[1][0]){
                                if(matrizM[i+1][j+1] == matrizP[1][1]){
                                    if(matrizM[i+1][j+2] == matrizP[1][2]){
                                        if(matrizM[i+2][j] == matrizP[2][0]){
                                            if(matrizM[i+2][j+1] == matrizP[2][1]){
                                                if(matrizM[i+2][j+2] == matrizP[2][2]){
                                                    System.out.println("La matriz P empieza en la fila "+i+" y columna "+j);

                                                    return true;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }


            }
        }


        return false;


    }

}
