package DS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var list = new GenericList<String>();
        list.add("A");
        list.add("B");
        list.add("C");

        for (var item : list.items) {
            System.out.println(item);
        }
    }
}
