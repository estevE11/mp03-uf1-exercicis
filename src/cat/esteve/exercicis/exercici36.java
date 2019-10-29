package cat.esteve.exercicis;

import java.sql.SQLOutput;
import java.util.Scanner;

public class exercici36 {
    // Visualitzar el següent sèrie tants elements com l’usuari indiqui: n --> n*2

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("> ");
        int n = sc.nextInt();
        for(int i = 0; i <= n; i++) {
            System.out.println(i*2);
        }
    }
}
