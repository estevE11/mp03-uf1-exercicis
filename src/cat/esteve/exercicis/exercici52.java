package cat.esteve.exercicis;

import java.util.Scanner;

public class exercici52 {
    // Feu un programa per calcular el màxim comú divisor (m.c.d.) de dos números M i N (enters i > 0 ) fent servir l’
    // algorisme d’ Euclides.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introdueix el primer nombre: ");
        int n0 = sc.nextInt();
        System.out.print("Introdueix el primer nombre: ");
        int n1 = sc.nextInt();
        System.out.println(mcd(n0, n1));
    }

    private static int mcd(int n0, int n1) {
        if(n0 < n1) {
            return mcd(n0, n1-n0);
        } else if(n0 > n1) {
            return mcd(n0-n1, n1);
        } else {
            return n0;
        }
    }
}
