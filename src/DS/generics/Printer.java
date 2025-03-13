package DS.generics;

public class Printer<T extends Animal> {
    T toPrint;
    public Printer(T toPrint) {
        this.toPrint = toPrint;
    }

    public void print() {
        System.out.println(toPrint);
    }
}
