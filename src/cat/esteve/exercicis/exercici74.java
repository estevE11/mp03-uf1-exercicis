package cat.esteve.exercicis;

import java.util.Scanner;

public class exercici74 {
    // Realitzar un algoritme que ens permeti entra n nombres enters en una taula i a continuació que
    // inverteixi la taula (el primer element passa a l’últim introduït, el segon al penúltim,...). Una
    // vegada invertida la taula mostrar-la per pantalla.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String _in = sc.nextLine();
        String[] in = _in.split(" ");
        int[] res = new int[in.length];
        for(int i = in.length-1; i >= 0; i--) {
            int it = Integer.parseInt(in[i]);
            res[(i-in.length+1)*-1] = it;
        }

        for(int it : res) {
            System.out.println(it);
        }
    }
}
