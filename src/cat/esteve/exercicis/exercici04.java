package cat.esteve.exercicis;

import java.util.Scanner;

public class exercici04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introdueix l'import: ");
        float money = sc.nextFloat();
        System.out.println(DOLtoEUR(money));
    }

    public static float DOLtoEUR(float money) {
        return (float)(money*1.1);
    }
}
