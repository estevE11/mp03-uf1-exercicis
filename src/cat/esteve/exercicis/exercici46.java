package cat.esteve.exercicis;

import java.util.Scanner;

public class exercici46 {
    // Visualitzar els N primers nombres imparells positius, sent N un valor entrat per teclat.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i < n; i+=2) {
            System.out.println(i);
        }
    }
}
