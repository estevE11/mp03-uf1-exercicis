package cat.esteve.exercicis;

public class exercici73 {
    // Escriure un algoritme que permeti calcular el quadrat dels 100 primer números enters i a
    // continuació els vagi guardant en una taula.

    public static void main(String[] args) {
        int[] res = new int[100];
        for(int i = 0; i < 100; i++) {
            int r = i*i;
            res[i] = r;
            System.out.println(i + " ^ 2 = " + r);
        }
    }
}
