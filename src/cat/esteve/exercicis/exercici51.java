package cat.esteve.exercicis;

import java.util.Scanner;

public class exercici51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        printTree(sc.nextInt());
    }

    private static void printTree(int n) {
        int maxWidth = n*2 - 1;
        int lineWidth = 1;
        for(int i = 0; i < n; i++) {
            int start = (maxWidth - lineWidth) / 2;
            for(int j = 0; j < start + lineWidth; j++) {
                System.out.print(j < start ? " " : "*");
            }
            System.out.println();
            lineWidth += 2;
        }
    }
}
