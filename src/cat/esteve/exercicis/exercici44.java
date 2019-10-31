package cat.esteve.exercicis;

import java.net.StandardSocketOptions;
import java.util.Scanner;

public class exercici44 {
    // Introduir un número i que es visualitzi la seva taula de multiplicar del 1 al 10.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introdueix un nombre: ");
        int n = sc.nextInt();
        for(int i = 1; i <= 10; i++) {
            System.out.println(n + "x" + i + " = " + (n*i));
        }
    }
}
