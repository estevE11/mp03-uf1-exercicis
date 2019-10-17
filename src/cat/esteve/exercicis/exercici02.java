package cat.esteve.exercicis;

import java.util.Scanner;

public class exercici02 {
    // Introduir dos números i calcular la seva suma

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introdueix el primer nombre: ");
        int a = sc.nextInt();
        System.out.print("Introdueix el segon nombre: ");
        int b = sc.nextInt();
        System.out.println("Resultat: " + (a+b));
    }
}
