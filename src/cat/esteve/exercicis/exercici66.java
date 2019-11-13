package cat.esteve.exercicis;

import java.util.Scanner;

public class exercici66 {
    // Escriure els divisors d’un número enter llegit per teclat.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n);
        for(int i = n/2; i > 0; i--) {
            if(n % i == 0) System.out.println(i);
        }
    }
}
