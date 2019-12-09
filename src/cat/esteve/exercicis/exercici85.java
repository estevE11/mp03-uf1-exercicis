package cat.esteve.exercicis;

import java.util.LinkedList;
import java.util.Scanner;

public class exercici85 {
    // Una estació climàtica proporciona un parell de temperatures diàries (màxima i mínima) estan el
    // rang permès d’aquestes temperatures entre -10 i 35. La parella final és 0,0. Determinar el
    // nombre de dies, de les temperatures preses, la mitja màxima, la mitja mínima, el nombre
    // d’errors (aquells dies que la temperatura màxima o mínima no esta dins el rang desitjat) i el
    // percentatge d’errors respecte al total de temperatures que es tenen. Es simularà l’entrada de
    // les temperatures per teclat.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedList<TemperaturePack> temps = new LinkedList<TemperaturePack>();

        System.out.print("> ");
        TemperaturePack in = getTemps(sc);
        temps.add(in);
        while(!in.isNull()) {
            System.out.print("> ");
            in = getTemps(sc);
            temps.add(in);
        }

        int min_avg = 0, max_avg = 0;
        int err = 0;
        for(TemperaturePack tp : temps) {
            min_avg += tp.getMin();
            max_avg += tp.getMax();
            if(tp.getMin() < -10 || tp.getMax() > 35) err++;
        }
        System.out.println();
        System.out.println("Dies: " + temps.size());
        System.out.println("Mitjana maxima: " + max_avg/temps.size());
        System.out.println("Mitjana minima: " + min_avg/temps.size());
        System.out.println("Errors: " + err + " ("+ err * 100 / temps.size() + "%)");
    }

    public static TemperaturePack getTemps(Scanner sc) {
        String[] in = sc.nextLine().split(",");
        if(in.length < 2) {
            System.out.println("Has s'introduir dos nombres separats per una coma. Exemple: -2,5");
            System.exit(2);
        }
        if(Integer.parseInt(in[0]) > Integer.parseInt(in[1])) {
            System.out.println("El minim no pot ser mes gran que el maxim.");
            System.exit(2);
        }
        return new TemperaturePack(Integer.parseInt(in[0]), Integer.parseInt(in[1]));
    }

    public static class TemperaturePack {
        private int min, max;

        public TemperaturePack(int min, int max) {
            this.min = min;
            this.max = max;
        }

        public boolean isNull() {
            return min == 0 && max == 0;
        }

        public int getMin() {
            return min;
        }

        public int getMax() {
            return max;
        }
    }
}
