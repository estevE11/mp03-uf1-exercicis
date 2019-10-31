package cat.esteve.exercicis;

import java.util.Scanner;

public class exercici45 {
    // Introduir dos número n i m i fer la taula del 1 al n del número m.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for(int i = 1; i <= m; i++) {
            System.out.println(n + "x" + i + " = " + (n*i));
        }
    }
}
