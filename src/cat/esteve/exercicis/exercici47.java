package cat.esteve.exercicis;

import java.util.Scanner;

public class exercici47 {
    // Calcular el factorial d’ un nombre demanat per teclat. Exemple: 5! = 5*4*3*2*1

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(getFactorial(n));
    }

    private static int getFactorial(int n) {
        if(n == 1) return 1;
        return n*getFactorial(n-1);
    }
}
