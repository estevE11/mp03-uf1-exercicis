package cat.esteve.exercicis;

import java.util.Scanner;

public class exercici39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for(int i  = 0; i < 10; i++) {
            sum += sc.nextInt();
        }
        System.out.println(sum/10);
    }
}
