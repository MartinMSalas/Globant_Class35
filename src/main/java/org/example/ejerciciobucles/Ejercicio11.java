package org.example.ejerciciobucles;

import java.util.Scanner;

public class Ejercicio11 {

    public static void ejercicio11() {
//        Realizar un programa que pida dos números enteros positivos por teclado y muestre por
//        pantalla el siguiente menú:

//        El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla
//        y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5.
//        Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa
//        directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que
//        desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del
//        programa, caso contrario se vuelve a mostrar el menú.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ejercicio 11");
        System.out.println("Ingrese un número entero positivo");
        int numero1 = scanner.nextInt();
        System.out.println("Ingrese otro número entero positivo");
        int numero2 = scanner.nextInt();
        boolean salir=false;
        do {

            System.out.println("Menú de opciones");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.println("Ingrese una opción");
            int opcion = scanner.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("La suma de los números es: " + (numero1 + numero2));
                    break;
                case 2:
                    System.out.println("La resta de los números es: " + (numero1 - numero2));
                    break;
                case 3:
                    System.out.println("La multiplicación de los números es: " + (numero1 * numero2));
                    break;
                case 4:
                    if(numero2 != 0){
                    System.out.println("La división de los números es: " + (numero1 / numero2));
                    }
                    else{
                        System.out.println("No se puede dividir por cero");
                    }
                    break;
                case 5:
                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                    String respuesta = scanner.next();
                    if(respuesta.equals("S")){
                        System.out.println("Saliendo del programa");
                        salir=true;
                    }
                    else{
                        System.out.println("Volviendo al menú");
                        salir=false;
                    }
            }
        }while (!salir);
    }
}
