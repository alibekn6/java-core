import Service.*;
import tasks.*;
import MathUtils.*;
import java.util.ArrayList;



class Ara {
    private String[] arr;
    private int size;

    public Ara(String... elements) {
        this.arr = elements;
        this.size = elements.length;
    }

    public void add(String elem) {
        String[] newArr = new String[size+1];
        for (int i = 0; i < size; i++) {
            newArr[i] = arr[i];
        }
        newArr[size] = elem;
        arr = newArr;
        size++;
    }

    public void print() {
        for (String elem : arr) {
            System.out.println(elem);
        }
    }


}


public class Main {
    public static void main(String[] myArgs) {
        String[] cars = {"as","wkmf", "jenkins", "Docker", "Container"};
        cars = add(cars, "Mashina");

        Ara cars2 = new Ara("as", "mwawd", "aswrf");
        cars2.add("Hellcat");
        cars2.print();
    }

    public static void runFizzBuzz (int limit) {
        for (int i = 1; i <= limit; i++) {
            System.out.println(getFizzBuzzValue(i));
        }
    }
    
    public static String[] add(String[] arr, String elem) {
        String[] newArr = new String[arr.length + 1];

        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }

        newArr[arr.length] = elem;
        return newArr;
    }




    public static String getFizzBuzzValue(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        } else if (number % 3 == 0) {
            return "Fizz";
        } else if (number % 5 == 0) {
            return "Buzz";
        } else {
            return String.valueOf(number);
        }
    }
}