package tasks;

public class App {
    public static void main(dataTypes[] args) {
        one();
    }

    public static void one() {
        int a = 12;
        int b = 51;
        System.out.printf("one: a-%s b-%s%n", a,b);

        two();

        b = 95;
        System.out.println("one : a + b " + (a + b));
    }

    public static void two() {
        int c = 30;
        int d = 80;
        System.out.printf("two: a-%s b-%s%n", c, d);

        three();

        c = 100;
        System.out.println("two : c + d " + (c + d));


    }


    public static void three() {
        int e = 10;
        int f = 90;
        System.out.printf("three: a-%s b-%s%n", e, f);
    }
}
