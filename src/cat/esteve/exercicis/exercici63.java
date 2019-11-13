package cat.esteve.exercicis;

import java.util.Scanner;

public class exercici63 {
    // Compteu el número de vegades que surten els dos primers caràcters consecutivament, la introducció de lletra
    // finalitza amb el punt ‘.’, per exemple, si la frase comença amb HOLA QUE ASE, caldrà comptar HO

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        String fst = sc.nextLine();
        String scnd = sc.nextLine();
        String old = "";
        String in = sc.nextLine();
        while(!in.equals(".")) {
            if(old.equals(fst) && in.equals(scnd)) count++;
            old = in;
            in = sc.nextLine();
        }
        System.out.println("La combinació '" + fst + scnd + "' s'ah repetit " + count + " vegades.");
    }
}
