package cat.esteve.exercicis;

public class exercici77 {
    // Tenim N temperatures guardades en una taula, Calcular la mitja i obtenir el número de
    // temperatures més grans o iguals a la mitja.

    private static int[] temps = {23, 12, 34, 22, 12, 23, 14, 26, 20, 21, 19, 15};

    public static void main(String[] args) {
        int avg = 0;
        for(int it : temps) {
            avg += it;
        }
        avg /= temps.length;

        int count = 0;
        for(int it : temps) {
            if(it >= avg) count++;
        }
        System.out.println("Hi ha " + count + " valors per sobre o iguals a la mitja (" + avg + ")");
    }
}
