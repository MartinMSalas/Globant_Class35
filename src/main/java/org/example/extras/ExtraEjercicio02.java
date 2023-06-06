package org.example.extras;

public class ExtraEjercicio02 {
    public static void extraEjercicio02() {
        int A,B,C,D,aux;
        A =(int) (Math.random()*11);
        B =(int) (Math.random()*11);
        C =(int) (Math.random()*11);
        D =(int) (Math.random()*11);
        System.out.println("A: "+A+" B: "+B+" C: "+C+" D: "+D);
        aux = B;
        B = C;
        C = A;
        A = D;
        D = aux;
        System.out.println("A: "+A+" B: "+B+" C: "+C+" D: "+D);
    }
}
