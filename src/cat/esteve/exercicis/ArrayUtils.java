package cat.esteve.exercicis;

import java.util.Random;

public class ArrayUtils {
    private static Random r = new Random();

    public static int[] genRandomArray(int w, int min, int max) {
        int[] res = new int[w];
        for(int x = 0; x < w; x++) {
            res[x] = r.nextInt(max - min) + min;
        }
        return res;
    }

    public static int[][] genRandomArray(int w, int h, int min, int max) {
        int[][] res = new int[w][h];
        for(int y = 0; y < h; y++) {
            for(int x = 0; x < w; x++) {
                res[x][y] = r.nextInt(max - min) + min;
            }
        }
        return res;
    }

    public static void printArray(int[] arr) {
        System.out.print("[");
        for(int i = 0; i < arr.length-1; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println(arr[arr.length-1] + "]");
    }

    public static void printArray(int[][] arr) {
        int w = arr[0].length, h = arr.length;
        int highest_digits = 0;
        for(int y = 0; y < h; y++) {
            for(int x = 0; x < w; x++) {
                int digits = String.valueOf(arr[x][y]).length();
                if(digits > highest_digits) highest_digits = digits;
            }
        }

        for(int y = 0; y < h; y++) {
            for(int x = 0; x < w; x++) {
                int n = arr[x][y];
                int digits = String.valueOf(n).length();
                int spaces = highest_digits - digits;
                for(int i = 0; i < spaces; i++) {
                    System.out.print(" ");
                }
                System.out.print(n + " ");
            }
            System.out.println();
        }

    }

}
