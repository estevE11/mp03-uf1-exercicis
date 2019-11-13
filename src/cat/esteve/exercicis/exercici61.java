package cat.esteve.exercicis;

import java.util.Scanner;

public class exercici61 {
    // Ídem anterior però ara s’ha de comptar ‘LA’ i ‘SI’.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n_la = 0, n_si = 0;
        String old = "";
        String in = sc.nextLine();
        while(!in.equals("")) {
            if(old.equals("L") && in.equals("A")) {
                n_la++;
            } else if(old.equals("S") && in.equals("I")) {
                n_si++;
            }
            old = in;
            in = sc.nextLine();
        }
        System.out.println("LA: " + n_la);
        System.out.println("SI: " + n_si);
    }
}
