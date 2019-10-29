package cat.esteve.exercicis;

public class exercici35 {
    // Visualitzar el 20 primers nombres naturals amb els següents esquemes:
    // 25.a) mentre
    // 25.b) repetir
    // 25.c) per

    public static void main(String[] args) {
        System.out.println("Metode A: mentre");
        int i = 1;
        while(i <= 20) {
            System.out.println(i);
            i++;
        }

        System.out.println("Metode B: repetir");
        i = 1;
        do {
            System.out.println(i);
            i++;
        } while(i <= 20);

        System.out.println("Metode C: per");
        for(i = 1; i <= 20; i++) {
            System.out.println(i);
        }
    }
}
