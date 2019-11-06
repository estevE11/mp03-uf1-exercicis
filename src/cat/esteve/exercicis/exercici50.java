package cat.esteve.exercicis;

import java.util.Scanner;

public class exercici50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        fib(sc.nextInt());
    }

    private static void fib(int n) {
        int x = 1, y = 1, z = 1;

        do {
            System.out.println(z);
            z = x + y;
            x = y;
            y = z;
        } while(y < n);
    }
}
