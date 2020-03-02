package cat.esteve.exercicis;

import java.util.Scanner;

public class exercici94 {
    private Scanner sc = new Scanner(System.in);

    int[][] board;

    public void start() {
        System.out.println("La manera d'introduir un valor es posant les coordenades x y.");
        System.out.println("Els dos valors han d'estar separats per comes.");
        System.out.println("Per acabar, introdueix les coordenades (0, 0)");

        this.board = ArrayUtils.genRandomArray(10, 10, 0, 100); // Aixo inicialitzara una array 2D amb nombres aleatoris
        ArrayUtils.printArray(this.board);

        boolean run = true;
        while(run) {
            run = askForNum();
            ArrayUtils.printArray(this.board);
        }
    }

    public boolean askForNum() {
        System.out.print("Introdueix el nombre i les coordenades (x, y): ");
        // Obtenim l'input per consola, eliminem els espais, i separem l'string resultant per comes per obtenir un array amb els tres valors.
        String[] in = sc.nextLine().replace(" ", "").split(",");

        // En cas de que l'input no compleixi les normes retornem fals.
        if(in.length != 2) return false;
        int[] vals = new int[in.length];
        // Els valors es converteixen en int, pero en cas de no ser nombres, ens encarreguem de l'error i returnem fals.
        try {
            for(int i = 0; i < in.length; i++) {
                vals[i] = Integer.parseInt(in[i]);
            }
        } catch(Exception e) {
            return false;
        }

        if(vals[0] == 0 && vals[1] == 0) return false;

        // Finalment ja que hem comprovat que l'input de l'usuari compleix les normes podem inserir el nombre.
        setNum(vals[0], vals[1]);
        return true;
    }

    public void setNum(int x, int y) {
        if(x < 0 || x > this.board[0].length || y < 0 || y > this.board.length) {
            System.out.println("Les coordenades introduides estan fora del tauler.");
            return;
        }

        //Board action
        for(int xx = x; xx < this.board[0].length; xx++) {
            System.out.println("Buenas");
            this.board[xx][y] = xx == this.board[0].length-1 ? 0 : this.board[xx+1][y];
        }
    }

    public static void main(String[] args) {
        new exercici94().start();
    }
}
