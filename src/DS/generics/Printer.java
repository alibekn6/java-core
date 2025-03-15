package DS.generics;

import java.io.Serializable;

public class Printer<T extends Animal & Serializable> {
    T toPrint;
    public Printer(T toPrint) {
        this.toPrint = toPrint;
    }

    public void print() {
        System.out.println(toPrint);
    }
}
