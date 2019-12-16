package cat.esteve.exercicis;

public class exercici92 {

    private void start() {
        int[][] mat0 = ArrayUtils.genRandomArray(3, 3, 0,10);
        int[][] mat1 = ArrayUtils.genRandomArray(3, 3, 0,10);

        int[][] sum =  sumMatrix(mat0, mat1);

        ArrayUtils.printArray(mat0);
        System.out.println("+");
        ArrayUtils.printArray(mat1);
        System.out.println("=");
        ArrayUtils.printArray(sum);
    }

    private int[][] sumMatrix(int[][] mat0, int[][] mat1) {
        int[][] res = new int[mat0[0].length][mat0.length];
        for(int y = 0; y < mat0.length; y++) {
            for(int x = 0; x < mat0[0].length; x++) {
                res[x][y] = mat0[x][y] + mat1[x][y];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        new exercici92().start();
    }
}
