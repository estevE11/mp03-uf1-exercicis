package cat.esteve.exercicis;

import java.util.Scanner;

public class exercici56 {
    // Fer un programa per entrar (caràcter a caràcter) un text (no buit) del que hem de dir el número de A’s que hi
    // ha. El text s’ acaba quan s’entri un intro.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0;
        String in = sc.next();
        while(!in.equals("\n")) {
            System.out.println("Still here");
            if(in.length() > 1) {
                System.out.println("ERROR: Input length must be 1.");
                System.exit(1);
            }
            if(in.equals("A") || in.equals("a")) {
                count++;
            }
            System.out.println(count);
            in = sc.next();
            System.out.println("asdfasdfasfsadfs");
        }
        System.out.println("asdfasdfasfsadfs");
        System.out.println("Hi havia un tot al de " + count + " lletres A.");
    }
}
