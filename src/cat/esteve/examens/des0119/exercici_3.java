package cat.esteve.examens.des0119;

import com.sun.security.jgss.GSSUtil;
import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;

public class exercici_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int up_count = 0;
        int low_count = 0;

        System.out.println("Introdueix la frase caracter per caracter: ");
        String in = sc.nextLine();

        while(!(in.equals(""))) {
            if(in.equals("A") || in.equals("E") || in.equals("I") || in.equals("O") || in.equals("U")) up_count++;
            else if(in.equals("a") || in.equals("e") || in.equals("i") || in.equals("o") || in.equals("u")) low_count++;
            in = sc.nextLine();
        }

        // Si la conta dona 1, diu VOCAL i si dona mes de 1 diu VOCALS
        System.out.println(low_count + " vocal" + (low_count > 1 ? "s" : "") + " en minuscula i " + up_count + " vocal" + (up_count > 1 ? "s" : "") + " en majuscula.");
    }
}
