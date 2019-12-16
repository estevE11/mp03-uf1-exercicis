package cat.esteve.exemples.clases;

public class Person {
    private int x, y;

    public Person(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void sumar(int n) {
        this.x+=n;
        this.y+=n;
    }
}
