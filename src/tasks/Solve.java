package tasks;

public class Solve {

    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Cat("Baabu");
        animals[1] = new Cat("XATUT");


        Dog[] d = new Dog[2];

        d[0] = new Dog("Hajimiki");
        d[1] = new Dog("alikikasi");

        d[0].jump();

    }
}



abstract class Animal {
    private final String name;

    public abstract void makeSound();

    Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Dog extends Animal {


    Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Dog AUF");
    }

    public void jump() {
        System.out.println("Jump DOGGGIE");
    }
}



class Cat extends Animal {

    Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Cat is myau");
    }

    public void lick() {
        System.out.println("licking my dick");
    }
}


interface Engine {
    void start();
}

class PetrolEngine implements Engine {
    public void start() {
        System.out.println("Petrol engine starting...");
    }
}

class DieselEngine implements Engine {
    public void start() {
        System.out.println("Diesel engine starting...");
    }
}


class Tractor {
    private Engine engine;


    void setEngine(Engine engine) {
        this.engine = engine;
    }

    void startEngine() {
        engine.start();
    }
}


class Car {

    private final Engine engine;

    Car (Engine engine) {
        this.engine = engine;
    }

    void startCar() {
        engine.start();
    }
}













// need to overwrite 2 places
//class Car {
//    private DieselEngine engine;
//
//    Car() {  // ❌ Hardcoded dependency
//        this.engine = new DieselEngine();
//    }
//
//    void startCar() {
//        engine.start();
//    }
//
//}





interface Flyable {
    void fly();
}


interface Swimmable {
    void swim();
}


class Duck implements Flyable, Swimmable {

    @Override
    public void fly () {
        System.out.println("Duck flying");
    }

    @Override
    public void swim() {
        System.out.println("Duck swimming");
    }
}



