package Collections;

import java.util.Arrays;

public class Setik {
    private int DEFAULT_SIZE = 20;
    private int size = 0;
    private String[] set;

    public Setik(int size) {
        this.DEFAULT_SIZE = size;
        this.set = new String[DEFAULT_SIZE];
    }

    public Setik() {
        this.set = new String[DEFAULT_SIZE];
    }
    // 265


    public boolean add(String element) {

        if (contains(element)) return false;
        if (size >= set.length) resize();
        set[size++] = element;
        return true;

    }

    public boolean remove(String element) {
        for (int i = 0; i < size; i++) {
            if (set[i].equals(element)) {
                for (int j = i; j < size-1; j++) {
                    set[j] = set[j+1];
                }
                set[size - 1] = null;
                size--;

                return true;
            }
        }

        return false;
    }

    public void print() {
        for (String element : set) {
            if (element == null) continue;
            System.out.println(element);
        }
    }

    public int size() {
        return size;
    }


    public boolean contains(String element) {
        for (int i = 0; i < size; i++) {
            if (set[i].equals(element)) {
                return true;
            }
        }
        return false;
    }

    private void resize() {
        int newSize = set.length * 2;
        set = Arrays.copyOf(set, newSize);
    }


    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            set[i] = null;
        }
        size = 0;
    }


    public static void main(String[] args) {
        Setik setik = new Setik(10);
        setik.add("Hello");
        setik.add("World");
        setik.add("Java");
        setik.add("Python");
        setik.add("C++");
        setik.add("asd");
        setik.print();

        System.out.println();

        System.out.println(setik.size());

        setik.remove("Java");
        setik.print();
        System.out.println(setik.size());

        setik.clear();

        setik.print();
        System.out.println(setik.size());


    }



}
