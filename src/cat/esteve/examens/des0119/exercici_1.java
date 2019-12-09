package cat.esteve.examens.des0119;

import java.util.Scanner;

public class exercici_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n0 = 0;
        int n1 = 0;
        int n2 = 0;

        int max = 0;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        int len = 0;

        System.out.print("Introdueix el primer nombre: ");
        int in = sc.nextInt();
        if(in > -1) {
            n0 = in;
            sum += n0;
            if(n0 > max) max = n0;
            if(n0 < min) min = n0;
            len++;
        } else {
            System.out.println("No s'admeten nombres negatius!");
        }

        System.out.print("Introdueix el segon nombre: ");
        in = sc.nextInt();
        if(in > -1) {
            n1 = in;
            sum += n1;
            if (n1 > max) max = n1;
            if (n1 < min) min = n1;
            len++;
        } else {
            System.out.println("No s'admeten nombres negatius!");
        }

        System.out.print("Introdueix el tercer nombre: ");
        in = sc.nextInt();
        if(in > -1) {
            n2 = in;
            sum += n2;
            if(n2 > max) max = n2;
            if(n2 < min) min = n2;
            len++;
        } else {
            System.out.println("No s'admeten nombres negatius!");
        }

        double avg = (double)sum/len;
        System.out.println("El mes gran es " + max + ", el mes petit es " + min + " i la mitjana es " + avg);
    }
}
