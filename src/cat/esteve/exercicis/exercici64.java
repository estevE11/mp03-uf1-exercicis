package cat.esteve.exercicis;

import java.util.Scanner;

public class exercici64 {
    // Comptar el nombre d’enters negatius d’una sèrie d’enters que anem llegint i que finalitza amb el número zero.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int in = sc.nextInt();
        while(in != 0) {
            if(in > 0) {
                count++;
            }
            in = sc.nextInt();
        }
        System.out.println("Hi havia un total de " + count + " nombres enters.");
    }
}
