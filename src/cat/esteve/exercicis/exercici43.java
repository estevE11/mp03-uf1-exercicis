package cat.esteve.exercicis;

import java.util.Scanner;

public class exercici43 {
    // Calcular el valor més gran, més petit i la mitja aritmètica d’ una seqüència de nombres acabada amb el 0.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int in = sc.nextInt();
        int max = in;
        int min = in;
        int sum = 0;
        int len = 0;
        while(in != 0) {
            len++;
            sum += in;
            if(in > max) max = in;
            if(in < min) min = in;
            in = sc.nextInt();
        }
        System.out.println("Maxim: " + max);
        System.out.println("Minim: " + min);
        System.out.println("Mitjana aritmetica: " + sum/len);
    }
}
