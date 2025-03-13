package DS.generics;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Printer<Cat> printer = new Printer<>(new Cat());
        Printer<Dog> intPrinter = new Printer<>(new Dog());
        printer.print();
        intPrinter.print();




        ArrayList<String> maldar = new ArrayList<>();
        maldar.add("Cat");
        maldar.add("Cow");
        maldar.add("Horse");
        maldar.add("Pig");
        maldar.add("Sheep");


        ArrayList<Object> obj = new ArrayList<>();
        obj.add(new Dog());

        Cat myCat = (Cat) obj.get(0);




    }
}


class Animal { }

class Cat extends Animal { }

class Dog extends Animal { }

