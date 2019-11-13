package cat.esteve.exemples;

public class aaaaa {
    public static void main(String[] args) {
        for(int y = 0; y < 5; y++) {
            for(int x = 0; x < 5; x++) {
                if(y == 2 && (x == 1 || x == 2 || x == 3)) System.out.print(" B");
                else System.out.print(" A");
            }
            System.out.println();
        }
    }
}
