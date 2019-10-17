package cat.esteve.exercicis;

import java.util.Scanner;

public class exercici06 {
    // Introduir els anys d’ una persona i obtenir l’ equivalent en dies i segons

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introdueix els anys: ");
        int years = sc.nextInt();
        int[] res = yearsToDaysSec(years);
        System.out.println(res[0] + " dies, " + res[1] + " segons");
    }

    public static int[] yearsToDaysSec(int years) {
        // 0: Dies
        // 1: Segons
        int[] res = {0, 0};
        res[0] = years*365;
        res[1] = years*365*12*24*60*60;
        return res;
    }
}
