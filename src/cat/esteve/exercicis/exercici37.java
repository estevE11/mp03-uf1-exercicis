package cat.esteve.exercicis;

import java.util.Scanner;

public class exercici37 {
    // A -Introduir un import en euros enter i indicar el número mínim de bitllets i monedes que li correspon.
    // Bitllets i monedes : 500, 200, 100, 50, 20, 10, 5, 2, 1. (165€ son 1 de 100, 1 de 50, 1 de 10 i 1 de 5)
    //
    // B –Introduir un import en euros real i indicar el número mínim de bitllets i monedes que li correspon.
    // Bitllets i monedes : 500, 200, 100, 50, 20, 10, 5, 2, 1, 0.50, 0.20, 0.10, 0.05, 0.01.

    private static int[] bills = {500, 200, 100, 50, 20, 10, 5, 2, 1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] res = getBillsA(n, bills);
        for(int it : res) {
            System.out.println("> " + it);
        }
    }

    public static int[] getBillsA(int n, int[] bills) {
        int[] res = new int[bills.length];
        for(int i = 0; i < bills.length; i++) {
            int nb = n/bills[i];
            res[i] = nb;
            n -= nb*bills[i];
        }
        return res;
    }
}
