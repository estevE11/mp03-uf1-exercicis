package cat.esteve.exercicis;

import java.util.LinkedList;
import java.util.Scanner;

public class exercici81 {
    // 81. Introduir un conjunt de números pel teclat i guardar-los en una taula finalitzant la seqüencia
    // amb el 0. Després caldrà calcular la mitja i dir quants números son més grans que la mitja i
    // quants son més petits.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> nums = new LinkedList<Integer>();

        int in = Integer.parseInt(sc.nextLine());
        while(in != 0) {
            nums.add(in);
            in = Integer.parseInt(sc.nextLine());
        }

        int avg = 0;
        for(int it : nums) {
            avg += it;
        }
        avg /= nums.size();

        int hi = 0;
        int low = 0;
        for(int it : nums) {
            if(it > avg) hi++;
            if(it < avg) low+;
        }

        System.out.println("AVG:  " + avg + ". Hi ha " + hi + " nombres per sobre mitja i " + low + " per sota.");
    }
}
