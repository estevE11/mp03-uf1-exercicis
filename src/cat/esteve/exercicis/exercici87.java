package cat.esteve.exercicis;

import java.util.Scanner;

public class exercici87 {
    // 87.Realitzar un algoritme que permeti entrar per teclat (caràcter a caràcter) un text no buit acabat
    // amb punt. Determinar quantes paraules comencen amb la lletra ‘A’ i d’aquestes quantes
    // contenen la seqüencia ‘LA’. Nota: S’entén que una paraula sempre porta un espai davant i
    // darrera, excepte la primera i última paraula. Exemple
    // Frase: A LA CALA DEL ALAN HI HA ARCILLA.
    // Solució: 3 paraules comencen amb ‘A’ de les que 2 tenen ‘LA’

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int swA = 0, cLA = 0;

        String old = "";
        String in = sc.nextLine();
        boolean inWord = in.equals("a") || in.equals("A");
        while(!in.equals(".")) {
            if(inWord) {
                if((in.equals("a") || in.equals("A")) && (old.equals("l") || old.equals("L"))) cLA++;
                inWord = !in.equals(" ");
            } else {
                inWord = (in.equals("a") || in.equals("A")) && old.equals(" ");
                if(inWord) swA++;
            }
            old = in;
            in = sc.nextLine();
        }

        System.out.println(swA + " paralules començen amb 'A' de les que " + cLA + " tenen 'LA'");
    }
}
