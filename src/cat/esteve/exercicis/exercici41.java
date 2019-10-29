package cat.esteve.exercicis;

import java.util.Scanner;

public class exercici41 {
    // Calcular la mitja aritmètica d’ una seqüència de nombres acabada amb el 0.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        double sum = 0;
        int len = 1;
        while(n != 0) {
            sum += n;
            len++;
            n = sc.nextInt();
        }
        double res = sum/(len-1);
        System.out.println("Resultat: " + res);
    }
}
