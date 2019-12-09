package cat.esteve.exercicis;

import java.util.LinkedList;
import java.util.Scanner;

public class exercici83 {
    // Donada una taula de N posicions anar demanant a l’usuari un conjunt de números enters,
    // finalitzant la seqüència amb 0. Cada vegada que s’introdueixi un número el programa haurà de
    // dir si aquest número ja l’havia introduït i quantes vegades l’ha introduït en total.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> nums = new LinkedList<Integer>();

        int in = Integer.parseInt(sc.nextLine());
        while(in != 0) {
            int count = 0;
            for(int it : nums) {
                if(in == it) count++;
            }
            if(count != 0) {
                System.out.println("El numero " + in + " ha aparegut " + count + " vegades previament.");
            } else {
                System.out.println("El numero " + in + " no ha aparegut previament.");
            }
            nums.add(in);
            in = Integer.parseInt(sc.nextLine());
        }
    }
}
