package cat.esteve.exercicis;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class exercici93 {
    // 93. Fer un algoritme on l'usuari haurà d'anar introduint de manera aleatòria, indicant fila i
    // columna, de números enters. S'haurà de validar que estigui dins dels marges de la columna i
    // que no es pot introduir un valor en la casella on ja s'havia introduït un valor prèviament.
    // Finalment s'haurà de dir quantes caselles per cada fila tenen valors introduïts

    private Scanner sc = new Scanner(System.in);

    int[][] board;

    public void start() {
        System.out.print("Introdueix l'amplada de la taula: ");
        int w = sc.nextInt();
        System.out.print("Introdueix l'alçada de la taula: ");
        int h = sc.nextInt();
        System.out.println("La manera d'introduir un valor es posant primer el nombre seguit de les coordenades x y.");
        System.out.println("Els tres valors han d'estar separats per comes.");
        System.out.println("Per acabar, introdueix un input erroni");
        sc.nextLine();
        this.board = new int[w][h]; // Aixo inicialitzara una array 2D plena de 0

        boolean run = true;
        while(run) {
            run = askForNum();
        }
        printResult();
    }

    public void printResult() {
        System.out.println();
        for(int y = 0; y < this.board[0].length; y++) {
            int r = 0;
            for(int x = 0; x < this.board.length; x++) {
                if(this.board[x][y] != 0) r++;
            }
            System.out.println("A la fila nº " + (y+1) + " s'han introduit " + r + " nombres.");
        }
    }

    public boolean askForNum() {
        System.out.print("Introdueix el nombre i les coordenades (n, x, y): ");
        // Obtenim l'input per consola, eliminem els espais, i separem l'string resultant per comes per obtenir un array amb els tres valors.
        String[] in = sc.nextLine().replace(" ", "").split(",");

        // En cas de que l'input no compleixi les normes retornem fals.
        if(in.length != 3) return false;
        int[] vals = new int[in.length];
        // Els valors es converteixen en int, pero en cas de no ser nombres, ens encarreguem de l'error i returnem fals.
        try {
            for(int i = 0; i < in.length; i++) {
                vals[i] = Integer.parseInt(in[i]);
            }
        } catch(Exception e) {
            return false;
        }

        // Finalment ja que hem comprovat que l'input de l'usuari compleix les normes podem inserir el nombre.
        setNum(vals[0], vals[1], vals[2]);
        return true;
    }

    public void setNum(int n, int x, int y) {
        if(n == 0) {
            System.out.println("El nombre introduit no pot ser 0");
            return;
        }
        if(this.board[x][y] != 0) {
            System.out.println("Aquesta casella ja ha estat iniciada.");
            return;
        }
        if(x < 0 || x > this.board[0].length || y < 0 || y > this.board.length) {
            System.out.println("Les coordenades introduides estan fora del tauler.");
            return;
        }
        this.board[x][y] = n;
    }

    public static void main(String[] args) {
        new exercici93().start();
    }
}
