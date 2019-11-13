package cat.esteve.exercicis;

import java.util.Scanner;

public class exercici69 {
    // Fer un programa per entrar (caràcter a caràcter) un text (no buit) acabat pel caràcter ‘/’. El caràcter ‘*’
    //significa final de línia. Entre les diferents paraules podrà haver-hi més d’ una espai en blanc o bé un asterisc. El
    //programa haurà d’ escriure el número de línies, el número de paraules i el de caràcters diferents de ‘ ‘, ‘*’, ‘/’
    //que hi ha en el text.
    //Exemple: LA CASA ESTAVA* MOLT MACA* PERÒ AVUI JA*NO TANT */
    //Caràcters 36 Paraules 10 Línies 4


    // No estic seguir si utilitzant la variable "inWord" es la manera mes optima.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char in = readChar(sc);
        int chars = 0;
        int words = 0;
        int lines = 0;
        boolean inWord = false;
        while(in != '/') {
            switch(in) {
                case '*':
                    lines++;
                    if(inWord) {
                        words++;
                        inWord = false;
                    }
                    break;
                case ' ':
                    if(inWord) {
                        words++;
                        inWord = false;
                    }
                    break;
                default:
                    chars++;
                    inWord = true;
            }
            in = readChar(sc);
        }
        System.out.println("Caracters " + chars + " Paraules " + words + " Linies " + lines);
    }
        // Metode per llegit nomes un caracter i donar error quan s'introdueixi mes d'un caracter.
    // Ja se que no hem fet metodes, pero no crec que marqui molt la diferencia, i fa el codi mes maco.
    private static char readChar(Scanner sc) {
        String in = sc.nextLine();
        if(in .length() > 1) {
            System.out.println("ERROR: No es pot introduir mes de 1 caracter de cop.");
            System.exit(3);
        }
        return in.charAt(0);
    }
}
