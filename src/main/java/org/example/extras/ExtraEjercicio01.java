package org.example.extras;

public class ExtraEjercicio01 {
//    Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
//    usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
    public static void extraEjercicio01(int minutos) {
        int dias = minutos / 1440;
        int horasRestantes = minutos % 1440;
        int minutosRestantes = minutos % 60;

        int horas = (minutos % 1440) / 60;
        System.out.println(minutos + " minutos equivalen a " + dias + " dias y " + horas + " horas" + " y " + minutosRestantes + " minutos");
    }
}
