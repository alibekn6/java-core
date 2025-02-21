package tasks;

public class Solve {

    public static void main(String[] args) {
        Person p1 = new Person("Nameme");
        p1.print();
        p1.sex();
    }
}


class Person implements Info {
    private final String name;

    public Person(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println("Hello im person " + name);
    }

    public void sex() {
        System.out.println("I can sex");
    }


}

class Animal implements Info {
    private final int id;

    public Animal(int id) {
        this.id = id;
    }

    public void print() {
        System.out.println("Mu mu i am animal hehe " + id);
    }
}




interface Info {
    public void print();
}

