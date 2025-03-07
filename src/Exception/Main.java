package Exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        error();
    }


    static void error() {
        try {
            int[] arr = {1,2,3,4};
            System.out.println(arr[5]);
        } catch (Error e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("This block is always executed.");
        }
    }


    public static long recursiveMethod(int x) {
        if (x == 0 || x == 1) {
            return 1;
        }

        return x * recursiveMethod(x - 1);
    }
// 109 641 728 * 20
    static void runTimeError() {
        int a = 3;
        int b = 0;
        int result = a / b;
        System.out.println(result);
    }





    static void compileTimeError() {
        try {
            FileReader file = new FileReader("filee.txt");
            BufferedReader reader = new BufferedReader(file);
            System.out.println(reader.readLine());
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("finally");
        }
    }
}