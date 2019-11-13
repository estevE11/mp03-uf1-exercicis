package cat.esteve.exercicis;

import java.util.Scanner;

public class exercici71 {
    // Donada una taula de n elements de enters, introduïts per l’usuari, fer un algoritme que ens digui
    // la suma total dels elements de la taula.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String _in = sc.nextLine();
        String[] in = _in.split(" ");
        int sum = 0;
        for(String _it : in) {
            int it = Integer.parseInt(_it);
            sum += it;
        }
        System.out.println("La suma suma: " + sum);
    }
}
