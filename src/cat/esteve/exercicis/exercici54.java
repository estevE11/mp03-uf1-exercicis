package cat.esteve.exercicis;

import java.util.Scanner;

public class exercici54 {
    // Fer un programa de validació d’una data. Heu de tenir en compte els anys de traspàs. Aquesta data la llegireu
    // com tres números enters (dia, mes i any). En cas que la data sigui correcta s’ escriurà data correcta i en cas
    // contrari data incorrecta (per simplificar es considerarà que a excepció del Febrer tots els mesos tenen 30 dies)

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Day: ");
        int day = sc.nextInt();
        System.out.print("Month: ");
        int month = sc.nextInt();
        System.out.print("Year: ");
        int year = sc.nextInt();
        System.out.println(valdateDate(day, month, year) ? "Data correcta" : "Data incorreta");
    }

    private static boolean valdateDate(int day, int month, int year) {
        if(month < 1 || month > 12) {
            return false;
        }
        if(day < 1 || day > (month == 2 ? 28 : 30)) {
            return false;
        }
        return true;
    }
}
