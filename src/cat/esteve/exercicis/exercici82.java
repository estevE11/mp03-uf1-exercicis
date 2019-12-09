package cat.esteve.exercicis;

import java.util.LinkedList;
import java.util.Scanner;

public class exercici82 {
    // 82.Igual que el 81 però en lloc de dir quants caldrà mostrar tots els números dient si són més grans
    // o més petits que la mitja

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

        for(int it : nums) {
            System.out.println("El numero " + it  + " es mes " + (it > avg ? "gran" : "petit") + " que la mitjana. (" + avg + ")");
        }
    }
}
