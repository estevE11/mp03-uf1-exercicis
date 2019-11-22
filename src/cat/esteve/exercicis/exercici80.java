package cat.esteve.exercicis;

import java.util.LinkedList;
import java.util.Scanner;

public class exercici80 {
    // Un nombre perfecte és aquell que és igual a la suma dels seus divisors excloent ell mateix.
    // Realitzar un algoritme que permeti llegir una seqüència de nombres enters positius finalitzant
    // amb la seqüència amb el 0. Després dir de cada un d’aquests quins són perfectes i dels perfectes
    // quin és el més gran.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> perfs = new LinkedList<Integer>();

        int in = Integer.parseInt(sc.nextLine());
        while(in != 0) {
            if(isPerfect(in)) {
                perfs.add(in);
                System.out.println("Es perfecte!");
            } else {
                System.out.println("No es perfecte!");
            }
            in = Integer.parseInt(sc.nextLine());
        }

        int max = 0;
        for(int it : perfs) {
            if(it > max) max = it;
        }
        System.out.println("El perfecte mes gran es " + max);
    }

    private static boolean isPerfect(int n) {
        int sum = 0;
        for(int i = n/2; i > 0; i--) {
            if(n % i == 0) {
                sum+=i;
            }
        }
        if(sum == n) {
            return true;
        }
        return false;
    }
}
