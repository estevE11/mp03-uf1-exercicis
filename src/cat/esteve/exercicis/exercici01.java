package cat.esteve.exercicis;

import java.util.Scanner;

public class exercici01 {
    // Calcular l’àrea d’ un cercle. Fórmula : pi*r2

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduieix el radi: ");
        int r = sc.nextInt();
        System.out.println(calcArea(r));
    }

    public static double calcArea(double r) {
        return Math.PI*r*r;
    }
}
