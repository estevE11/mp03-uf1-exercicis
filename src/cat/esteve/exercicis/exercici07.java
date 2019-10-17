package cat.esteve.exercicis;

import java.util.Scanner;

public class exercici07 {
    // Intercanviar els valors de dues variables prèviament introduïdes

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("< A: ");
        int a = sc.nextInt();
        System.out.print("< B: ");
        int b = sc.nextInt();
        int aa = a;
        a = b;
        b = aa;
        System.out.println("> A: " + a);
        System.out.println("> B: " + b);
    }
}
