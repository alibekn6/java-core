package SuperThis;

public class Main {
    public static void main(String[] args) {
        B b = new B();
    }
}

class A {
    A() {
        System.out.println("Конструктор без аргументов класса A");
    }
    A(String message) {
        System.out.println("Конструктор с одним аргументом класса A");
    }
}

class B extends A {
    B() {
        this("");
        System.out.println("Конструктор без аргументов класса B");
    }

    B(String message) {
        super("");
        System.out.println("Конструктор с одним аргументом класса B");
    }
}