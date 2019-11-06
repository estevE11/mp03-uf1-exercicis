package cat.esteve.exercicis;

import java.util.Scanner;

public class exercici49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        printFloydTriangle(sc.nextInt());
    }

    private static void printFloydTriangle(int n) {
        int step = 1;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < i; j++) {
                System.out.print(step + " ");
                step++;
            }
            System.out.println();
        }
    }
}
