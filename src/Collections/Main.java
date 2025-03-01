package Collections;


import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        HashSet<Integer> set2 = new HashSet<>();

        for (int i = 0; i < 100; i++) {
            set2.add(i);
        }

        System.out.println(set2);
    }

    public static void print(String[] array) {
        for (String element : array) {
            if (element != null) {
                System.out.println(element);
            }
        }
    }

    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();

        for (int num : nums) {
            if (seen.contains(num)) {
                return true;
            }
            seen.add(num);
        }

        return false;
    }


}


interface Animal {
    void eat();
}

class shit {
    public static void main(String[] args) {
        long startTime = System.nanoTime();

        //code

        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
            char c = (char) i;
            list.add(c);
        }


        long endTime = System.nanoTime();

        long elapsedTime = endTime - startTime;
        double elapsedTimeInMillis = elapsedTime / 1_000_000.0;
        System.out.println(elapsedTimeInMillis);

        long startTime2 = System.nanoTime();

        // code

        LinkedList<Character> list2 = new LinkedList<>();
        for (int i = 0; i < 100000; i++) {
            char c = (char) i;
            list2.add(c);
        }

        long endTime2 = System.nanoTime();

        long elapsedTime2 = endTime2 - startTime2;
        double elapsedTimeInMillis2 = elapsedTime2 / 1_000_000.0;
        System.out.println(elapsedTimeInMillis2);

        Vector<Integer> vector = new Vector<>();
        vector.add(121);
        System.out.println(vector.elementAt(0));


    }
}

abstract class MainAnimal {
    void eat() {

    }
}

class Dog implements Animal {
    public void eat() {
        System.out.println("Dog eat");
    }
}

class Cat implements Animal {
    public void eat() {
        System.out.println("Cat eat");
    }
}


