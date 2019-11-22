package cat.esteve.exercicis;

import java.util.LinkedList;
import java.util.Scanner;

public class exercici79 {
    // Introduir una frase caràcter a caràcter en una taula. Posteriorment caldrà mostrar-la per
    // pantalla invertida canviant la vocat ‘a’ per la ‘e’, la ‘e’ per la ‘i’, la ‘i’ per la ‘o’, la ‘o’ per la
    // ‘u’ i la ‘u’ per la ‘a’

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedList<String> phrase = new LinkedList<String>();

        String in = sc.nextLine();
        while(!in.equals(".")) {
            phrase.add(in);
            in = sc.nextLine();
        }

        for(String it : phrase) {
            switch(it) {
                case "a":
                    it = "e";
                    break;
                case "e":
                    it = "i";
                    break;
                case "i":
                    it = "o";
                    break;
                case "o":
                    it = "u";
                    break;
                case "u":
                    it = "a";
                    break;
            }
            System.out.print(it);
        }
    }
}
