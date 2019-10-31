package cat.esteve.exercicis;

import java.util.Scanner;

public class exercici42 {
    // Dir quin és el valor més gran d’ una seqüència de nombres acabada amb el 0.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        int in = sc.nextInt();
        if(in > max) max = in;
        while(in != 0) {
            in = sc.nextInt();
            if(in > max) max = in;
            System.out.println(max);
        }
        System.out.println("Resultat: " + max);
    }
}
