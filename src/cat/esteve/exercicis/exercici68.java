package cat.esteve.exercicis;

import java.util.Random;
import java.util.Scanner;

public class exercici68 {
    // Fer un joc en el qual l’ordinador s’inventi un número entre el 1 i el 100. Per cada intent el jugador intentarà
    //encertar el número. En el cas de que l’encerti el joc finalitzarà, en cas contrari se li haurà d’indicar al jugador
    //si el número es més gran o més petit que el que ha d’encertar. Al final, una vegada el jugador hagi encertat el
    //número, se li mostrarà quantes oportunitats ha necessitat per endevinar el número.

    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);

        int guesses = 1;

        System.out.println(". : RANDOM NUMBER GUESSER : .");
        System.out.print("Insereix un numbre: ");

        int num = r.nextInt(100)+1;
        int guess = sc.nextInt();

        while(guess != num) {
            if(guess > num) {
                System.out.println("El nombre que has inserit es mes gran que el nombre que he pensat.");
            }
            if(guess < num) {
                System.out.println("El nombre que has inserit es mes petit que el nombre que he pensat.");
            }
            guess = sc.nextInt();
            guesses++;
        }

        System.out.println("Has adivinat el nombre amb " + guesses);
    }
}
