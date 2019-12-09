package cat.esteve.examens.des0119;

import java.util.Scanner;

public class exercici_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("> ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            for(int j = n-i; j < n+1; j++) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }
}
