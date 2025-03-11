package Exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            BankAccount myBank = new BankAccount(100.0);
            myBank.withdraw(120);
        } catch (InsufficientFundsException e) {
            System.out.println("-?>>>>>> ?????? " + e.getMessage());
            e.printStackTrace();
        }
    }

    static void error() {
        try {
            int[] arr = {1,2,3,4};
            System.out.println(arr[5]);
        } catch (RuntimeException e) {
            System.out.println("---------->>>>" + e.getMessage());
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


class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

class BankAccount {
    private double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient amount of money for withdrawal");
        }
        balance -= amount;
    }
}



//
//public class InsufficientFundsException extends Exception {
//    public InsufficientFundsException(String message) {
//        super(message);
//    }
//}