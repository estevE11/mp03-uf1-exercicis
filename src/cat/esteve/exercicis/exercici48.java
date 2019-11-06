package cat.esteve.exercicis;

import java.util.Scanner;

public class exercici48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        printGrid(sc.nextInt());
    }

    private static void printGrid(int n) {
        for(int y = 0; y < n; y++) {
            for(int x = 0; x < n; x++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
