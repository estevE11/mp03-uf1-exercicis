package cat.esteve.exercicis;

import java.util.Scanner;

public class exercici75 {
    // Donada una taula de n elements enters, buscar el valor màxim, i el lloc on es troba aquest valor,
    // tenint en compte que no poden existir valors repetits. Aquests números seran introduïts pel
    // teclat validant que no hi hagi duplicacions, finalitzant la sèrie amb el -999.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introdueix quants valors vols introduir: ");
        int len = Integer.parseInt(sc.nextLine());

        int[] vals = new int[len];
        for(int i = 0; i < len; i++) {
            System.out.print(i + " > ");
            int val = Integer.parseInt(sc.nextLine());
            boolean keepAsking = true;
            while(keepAsking) {
                keepAsking = false;
                for(int j = 0; j < i; j++) {
                    if(val == vals[j]) {
                        System.out.print(i + " > ");
                        val = Integer.parseInt(sc.nextLine());
                        keepAsking = true;
                        break;
                    }
                }
            }
            vals[i] = val;
        }
        System.out.println("---------------");
        int max = 0;
        int max_i = 0;
        for(int i = 0; i < vals.length; i++) {
            if(vals[i] > max) {
                max = vals[i];
                max_i = i;
            }
        }
        System.out.println("El valor mes gran es " + max + " que està a la posició " + max_i);
    }
}
