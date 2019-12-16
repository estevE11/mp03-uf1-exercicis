package cat.esteve.exercicis;

public class exercici91 {
    // 91. Fer un algoritme per transposar una matriu de 10x10.

    private void start() {
        int[] arr = ArrayUtils.genRandomArray(10, 0, 100);

        int[] res = new int[arr.length];
        for(int i = 0; i < res.length; i++) {
            res[i] = arr[i];
        }

        ArrayUtils.printArray(arr);
        ArrayUtils.printArray(res);
    }

    public static void main(String[] args) {
        new exercici91().start();
    }

}
