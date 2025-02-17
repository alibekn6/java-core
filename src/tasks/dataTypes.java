package tasks;
import java.util.Scanner;

public class dataTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        int reverse = 0;
        // 123
        while (x != 0) {
            int lastDigit = x % 10;
            x /= 10;

            if (reverse > Integer.MAX_VALUE / 10 || (reverse == Integer.MAX_VALUE / 10 && lastDigit > 7)) {

            }

            reverse = reverse * 10 + lastDigit;
        }


    }
}

