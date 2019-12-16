package cat.esteve.exercicis;

import java.util.Random;

public class exercici90 {
    // 90. Donada una taula de dos dimensions de 10 x 10 de reals omplir la taula amb números i
    // posteriorment buscar quin es el valor més gran i el més petit de cada fila, mostrant els 10
    // valors per pantalla.

    private Random r = new Random();

    private final int w = 10, h = 10;

    private int[][] nums = ArrayUtils.genRandomArray(this.w, this.h, 0, 100);

    private void start() {
        int[][] sumR = new int[this.w][2];
        for(int y = 0; y < this.h; y++) {
            for(int x = 0; x < this.w; x++) {
                if(x == 0) {
                    sumR[y][0] = this.nums[x][y];
                    continue;
                }

                if(this.nums[x][y] > sumR[y][1]) {
                    sumR[y][1] = this.nums[x][y];
                }
                if(this.nums[x][y] < sumR[y][0]) {
                    sumR[y][0] = this.nums[x][y];
                }
            }
        }

        ArrayUtils.printArray(this.nums);

        for(int i = 0; i < this.h; i++) {
            System.out.println("Fila " + i + ": " + sumR[i][0] + " - " + sumR[i][1]);
        }
    }


    public static void main(String[] args) {
        new exercici90().start();
    }
}
