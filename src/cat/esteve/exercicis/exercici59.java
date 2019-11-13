package cat.esteve.exercicis;

import java.util.Scanner;

public class exercici59 {
    // Ídem anterior però ara heu de calcular el % de lletres A amb relació als caràcters dels espais en blanc ‘ ‘ (caldrà
    //saber el número de A i d'espais en blanc) . Si s’entran 10 ‘ ‘ i 5 ‘A’ hi ha un 50% de A respecte als ‘ ‘

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n_a = 0;
        int n_b = 0;
        String in = sc.nextLine();
        while(!in.equals("")) {
            if(in.equals("a")) n_a++;
            else if(in.equals(" ")) n_b++;
            System.out.println("a: " + n_a);
            System.out.println("b: " + n_b);
            in = sc.nextLine();
        }
        int res = 100 * n_a / n_b;
        System.out.println(res + "%");
    }
}
