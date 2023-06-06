package org.example.extras;

import java.util.Scanner;

public class ExtraEjercicio06 {
    public static void extraEjercicio06(){
        Scanner scanner = new Scanner(System.in);
        int acumuladorTotal=0;
        int acumuladorEnanos=0;
        int altura;
        do {
            System.out.println("Ingrese la altura de la siguiente persona en cm, 0 para salir");
            altura = scanner.nextInt();
            if (altura<160){
                acumuladorEnanos++;
            }
            acumuladorTotal++;
        }while (altura != 0);

    }
}
