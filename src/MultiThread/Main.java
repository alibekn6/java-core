package MultiThread;


public class Main {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            Multithreading multi1 = new Multithreading(i);
            multi1.start();
        }

        for (int i = 99; i >= 10; i--) {
            System.out.println("FUCK ME " + i);
        }

    }
}
