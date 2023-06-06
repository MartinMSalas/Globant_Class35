package org.example.extras;

public class ExtraEjercicio03 {
//    Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
//    Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String.
    public static void extraEjercicio03(String letra) {
        String letraMinuscula = letra.toLowerCase();
        if (letraMinuscula.equals("a") || letraMinuscula.equals("e") || letraMinuscula.equals("i") || letraMinuscula.equals("o") || letraMinuscula.equals("u")) {
            System.out.println("La letra ingresada es una vocal");
        } else {
            System.out.println("La letra ingresada no es una vocal");
        }
    }
    public static void extraEjercicio03B(String letra){
        switch (letra) {
            case "a", "e", "i", "o", "u" -> System.out.println("La letra ingresada es una vocal");
            default -> System.out.println("La letra ingresada no es una vocal");
        }

    }
}
