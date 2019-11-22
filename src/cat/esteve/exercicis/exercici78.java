package cat.esteve.exercicis;

import java.util.Scanner;

public class exercici78 {
    // Anar introduint caràcters pel teclat una frase finalitzada amb punt. Després caldrà dir quantes
    // lletres de tot l'abecedari s'han introduït. (‘a’-‘z’)

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] letters = new int[26];
        char in = sc.nextLine().charAt(0);
        while(!String.valueOf(in).equals(".")) {
            int code = (int)in;
            if((code >= 65 && code <= 90) || (code >= 97 && code <= 122)) {
                letters[code-(code >= 97 ? 97 : 65)]++;
            }
            in = sc.nextLine().charAt(0);
        }

        for(int i = 0; i < letters.length; i++) {
            System.out.print(((char) (i+65)) + ": " + letters[i] + ", ");
        }
    }
}
