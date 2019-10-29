package cat.esteve.exercicis;

import java.util.Scanner;

public class exercici40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        while(n != 0) {
            sum += n;
            n = sc.nextInt();
        }
        System.out.println("Resultat: " + sum);
    }
}
