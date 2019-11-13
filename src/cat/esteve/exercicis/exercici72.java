package cat.esteve.exercicis;

import java.util.Scanner;

public class exercici72 {
    // Donada una taula de n elements enters, introduïts per l’usuari, fer un algoritme que ens indiqui
    // quants d’aquests són negatius i quants no. El zero es considera neutre.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String _in = sc.nextLine();
        String[] in = _in.split(" ");
        int pos = 0;
        int neg = 0;
        for(String _it : in) {
            int it = Integer.parseInt(_it);
            if(it > 0) {
                pos++;
            } else if(it < 0) {
                neg++;
            }
        }
        System.out.println("Positius: " + pos + ", Negatius: " + neg);
    }
}
