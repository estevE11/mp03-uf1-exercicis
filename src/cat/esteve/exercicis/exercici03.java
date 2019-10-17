package cat.esteve.exercicis;

import java.util.Scanner;

public class exercici03 {
    // Introduir un import i calcular què ha de pagar si li fem 20% de descompte.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introdueix el preu: ");
        float price = sc.nextFloat();
        System.out.println(applyDiscount(price, 20));
    }

    public static float applyDiscount(float price, float dis) {
        return price - (price*(dis/100));
    }
}
