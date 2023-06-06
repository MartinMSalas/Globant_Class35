package org.example.extras;

import java.util.Scanner;

public class ExtraEjercicio05 {
    public static void extraEjercicio05() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la clase de socio");
        String claseSocio = scanner.nextLine();
        System.out.println("Ingrese el costo del tratamiento");
        int costoTratamiento = scanner.nextInt();
        double descuento = 1;

        if (claseSocio.toLowerCase().equals("a")) {
            descuento = .50;
        } else if (claseSocio.toLowerCase().equals("b")) {
            descuento = .65;
        }
        double costoFinal = costoTratamiento * descuento;
        System.out.println("El costo final es de $ " + costoFinal);

    }
}
