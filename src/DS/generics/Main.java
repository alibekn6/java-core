package DS.generics;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Printer<Cat> printer = new Printer<>(new Cat());
        Printer<Dog> intPrinter = new Printer<>(new Dog());
        printer.print();
        intPrinter.print();


        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);


        printlist(intList);


    }

    private static void printlist(List<?> list) {
        System.out.println(list);
    }


    private static <T, V> void shout(T thingToShout, V anotherShout) {
        System.out.println(thingToShout + " + " + anotherShout);
    }

    private static <T, V> T say(T thingToShout, V anotherShout) {
        System.out.println(thingToShout + " + " + anotherShout);
        return thingToShout;
        // returns that T type
    }





}


class Animal { }

class Cat extends Animal implements Serializable { }

class Dog extends Animal implements Serializable { }

