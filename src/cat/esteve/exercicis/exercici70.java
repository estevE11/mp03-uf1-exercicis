package cat.esteve.exercicis;

import java.util.Random;
import java.util.Scanner;

public class exercici70 {
    // Fer un joc en el qual l’ordinador s’inventarà dos número (entre el 1 i el 100) i l’usuari haurà de dir quin és el
    // resultat de la seva multiplicació. Si l’usuari l’encerta guanya i se li mostrà un missatge de guanyador. Si l’usuari
    // no indica correctament el resultat de la multiplicació anirà introduint valors fins que l’encerti. Al finalitzar se li
    // preguntarà si vol fer un altre partida, en cas afirmatiu el procés torna a començar.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        String retry = "y";
        while(retry.equals("y")) {
            int n0 = r.nextInt(100)+1;
            int n1 = r.nextInt(100)+1;
            int in = -1;
            while(in != n0*n1) {
                System.out.print("Quin es el resultat de " + n0 + "x" + n1 + "? ");
                in = sc.nextInt();
            }
            System.out.println("CORRECTE");

            sc.nextLine(); // Aquesta linia es per solucionar un bug que feia que el nextLine de la linia 29 no esperes el input i es sortis del programa.
            System.out.print("Vols tornar a jugar? (y/n): ");
            retry = sc.nextLine();
        }
    }
}
