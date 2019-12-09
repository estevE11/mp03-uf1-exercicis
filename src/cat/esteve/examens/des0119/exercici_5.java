package cat.esteve.examens.des0119;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class exercici_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedList<Integer> temps = new LinkedList<Integer>();

        int temp = sc.nextInt();
        while(temp != -999) {
            int rep_count = 0;
            for(int it : temps) {
                if(temp == it) rep_count++;
            }
            temps.add(temp);
            if(rep_count > 0) System.out.println("Aquesta temperatura ha estat registrada " + rep_count + " vegad" + (rep_count > 1 ? "es" : "a") + " previament (ara " + (rep_count+1) + ")");
            else System.out.println("Temperatura no registrada previament.");
            temp = sc.nextInt();
        }

        int n = 0;
        int max = 0;
        for(int it0 : temps) {
            int count = 0;
            for(int it1 : temps) {
                if(it0 == it1) count ++;
            }
            if(count > max) {
                n = it0;
                max = count;
            }
        }

        System.out.println("La temperatura que mes vegades s'ha repetit es " + n + ", " + max + " vegades.");
    }
}
