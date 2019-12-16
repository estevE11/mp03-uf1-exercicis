package cat.esteve.exercicis;

import java.util.Random;

public class exercici88 {
    // 88.Donada una taula de dos dimensions de 10 x 10 de reals omplir la taula amb números i
    // posteriorment calcular la suma dels seus elements.

    private Random r = new Random();

    private final int w = 10, h = 10;

    private int[][] nums = ArrayUtils.genRandomArray(this.w, this.h, 0, 100);

    private void start() {
        int suma = 0;
        for(int y = 0; y < h; y++) {
            for(int x = 0; x < w; x++) {
                suma += nums[x][y];
            }
        }
        System.out.println("La suma es " + suma);
    }

    public static void main(String[] args) {
        new exercici88().start();
    }
}
