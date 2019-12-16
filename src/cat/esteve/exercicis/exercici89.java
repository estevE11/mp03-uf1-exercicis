package cat.esteve.exercicis;

import java.util.Random;

public class exercici89 {
    // 89. Donada una taula de dos dimensions de 10 x 10 de reals omplir la taula amb números i
    // posteriorment calcular la suma de cada fila i la suma de cada columna mostrant els 20
    // resultats per pantalla.

    private Random r = new Random();

    private final int w = 10, h = 10;

    private int[][] nums = ArrayUtils.genRandomArray(this.w, this.h, 0, 100);

    private void start() {
        int[] sumR = new int[this.w];
        int[] sumC = new int[this.h];
        for(int y = 0; y < this.h; y++) {
            for(int x = 0; x < this.w; x++) {
                sumR[y] += this.nums[x][y];
                sumC[x] += this.nums[x][y];
            }
        }

        // Imprimint per consola
        for(int y = 0; y < this.h; y++) {
            for(int x = 0; x < this.w; x++) {
                int n = this.nums[x][y];
                System.out.print(" " + (n < 10 ? " " : "") + n + " ");
            }
            System.out.println("| " + sumR[y]);
        }
        for(int x = 0; x < this.w; x++) {
            System.out.print("----");
        }
        System.out.println("");
        for(int x = 0; x < this.w; x++) {
            int n = sumC[x];
            System.out.print((n < 10 ? " " : "")  + (n < 100 ? " " : "") + n + " ");
        }
    }

    public static void main(String[] args) {
        new exercici89().start();
    }
}
