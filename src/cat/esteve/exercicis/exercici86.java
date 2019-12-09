package cat.esteve.exercicis;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class exercici86 {
    // 86.Es necessita un aplicatiu on es pugui introduir el codi postal i la quantitat d’habitants de 20
    // poblacions catalanes. Finalment es demana que es digui el nom de la població amb més
    // habitants i el número d’habitants que té, així com la mitja d’habitants de les 20 poblacions.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = 20;

        City[] cities = new City[len];

        for(int i = 0; i < len; i++) {
            System.out.println();
            cities[i] = inputCity(sc);
        }

        City max_pop = cities[0];
        int avg_pop = cities[0].getPopulation();
        for(int i = 1; i < cities.length; i++) {
            City c = cities[i];
            avg_pop += c.getPopulation();
            if(max_pop.getPopulation() < c.getPopulation()) max_pop = c;
        }

        System.out.println();
        System.out.println("Població amb mes habitants: " + max_pop.getName() + " (" + max_pop.getPopulation() + " habitants)");
        System.out.println("Mitjana d'habitants: " + avg_pop/cities.length);
    }

    private static City inputCity(Scanner sc) {
        System.out.println(". : Nova ciutat : .");
        System.out.print("Nom: ");
        String name = sc.nextLine();
        sc = new Scanner(System.in); // El "intro" del nextLine es queda al buffer del scanner, per tant creem un scanner nou, amb un nou buffer.
        System.out.print("Codi postal: ");
        int code = sc.nextInt();
        System.out.print("Poblacio: ");
        int population = sc.nextInt();

        return new City(code, name, population);
    }

    public static class City {
        private int code, population;
        private String name;

        public City(int code, String name, int population) {
            this.code = code;
            this.name = name;
            this.population = population;
        }

        public String getName() {
            return name;
        }

        public int getCode() {
            return this.code;
        }

        public int getPopulation() {
            return this.population;
        }
    }
}
