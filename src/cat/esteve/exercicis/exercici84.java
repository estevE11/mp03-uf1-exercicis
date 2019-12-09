package cat.esteve.exercicis;

import java.util.LinkedList;
import java.util.Scanner;

public class exercici84 {
    // Introduir valors reals en una taula fins que entrin el valor 0. Posteriorment s'hauran de generar 2
    // taules en una posarem el valors positius i en l'altre els negatius. Posteriorment haurem de
    // mostrar cada una de les taules en ordre invers.

    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> nums_pos = new LinkedList<Integer>();
        LinkedList<Integer> nums_neg = new LinkedList<Integer>();

        int in = Integer.parseInt(sc.nextLine());
        while(in != 0) {
            if(in > 0) nums_pos.add(in);
            else nums_neg.add(in);
            in = Integer.parseInt(sc.nextLine());
        }

        System.out.println(". : Nombres positius : .");
        for(int i = nums_pos.size()-1; i > -1; i--) {
            System.out.println(nums_pos.get(i));
        }

        System.out.println(". : Nombres negatius : .");
        for(int i = nums_neg.size()-1; i > -1; i--) {
            System.out.println(nums_neg.get(i));
        }
    }
}
