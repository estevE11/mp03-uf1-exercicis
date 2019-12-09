package cat.esteve.examens.des0119;

import java.util.Scanner;

public class exercici_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int op = 0;
        boolean keepAsking = true;

        String in = "";
        while(keepAsking) {
            System.out.println(""); // sout buit perque quedi mes maco
            System.out.println("A) Fer suma");
            System.out.println("B) Fer resta");
            System.out.println("C) Sortir");
            System.out.print("> ");
            in = sc.nextLine();

            char ch = in.charAt(0);
            switch(ch) {
                case 'A':
                case 'a':
                    System.out.println(". : SUMA : .");
                    System.out.print("Introdueix el primer nombre: ");
                    int s_n0 = Integer.parseInt(sc.nextLine());
                    System.out.print("Introdueix el segon nombre: ");
                    int s_n1 = Integer.parseInt(sc.nextLine());
                    System.out.println("Resultat: " + (s_n0+s_n1));
                    op++;
                    break;
                case 'B':
                case 'b':
                    System.out.println(". : RESTA : .");
                    System.out.print("Introdueix el primer nombre: ");
                    int r_n0 = Integer.parseInt(sc.nextLine());
                    System.out.print("Introdueix el segon nombre: ");
                    int r_n1 = Integer.parseInt(sc.nextLine());
                    System.out.println("Resultat: " + (r_n0-r_n1));
                    op++;
                    break;
                case 'C':
                case 'c':
                    System.out.println("Nombre d'operacions: " + op);
                    keepAsking = false;
            }
        }
    }
}
