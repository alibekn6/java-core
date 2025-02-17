package MathUtils;


public class MathU {
    public static int plus(int a, int b) {
        return a + b;
    }

    public static int minus(int a, int b) {
        return a - b;
    }

    public static int mult(int a, int b) {
        return a * b;
    }


    public static int div(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed\n");
        }
        return a / b;
    }

    public static int abs(int n ) {
        if (n < 0) {
            return -n;
        }
        return n;
    }


    public static double pow(int a, int b) {
        double res = 1;

        for (int i = 1; i <= abs(b); i++) {
            res = res * a;
        }

        if (b < 0) {
            res = 1 / res;
        }
        return res;
    }

    public static double sqrt(int a) {
        for (int i = 0; i < a; i++) {
            if (i * i == a) {
                return i;
            }
        }
        return 0;
    }




}


