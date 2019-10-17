package cat.esteve.exercicis;

import java.util.Scanner;

public class exercici05 {
    // Introduir un import i un descompte en tant per cent. Calcular l’import net.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introdueix el preu: ");
        float price = sc.nextFloat();
        System.out.print("Introdueix el descompte(%): ");
        float dis = sc.nextFloat();
        System.out.println(applyDiscount(price, dis));
    }

    public static float applyDiscount(float price, float dis) {
        return price - (price*(dis/100));
    }
}
