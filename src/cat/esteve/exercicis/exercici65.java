package cat.esteve.exercicis;

import java.util.Scanner;

public class exercici65 {
    // Calcular la mitja aritmètica d’una sèrie de d’enters positius que finalitza amb el 0, només els enters positius.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int len = 0;
        int in = sc.nextInt();
        while(in != 0) {
            if(in > 0) {
                sum += in;
                len++;
            }
            in = sc.nextInt();
        }
        float res = sum/len;
        System.out.println("La mitjana dels nombres enters: " + res);
    }
}
