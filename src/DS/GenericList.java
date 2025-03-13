package DS;

public class GenericList<T> {
    public T[] items = (T[]) new Object[10];
    private int count = 0;


    public void add(T item) {
        items[count++] = item;
    }

    public T get(int index) {
        return items[index];
    }


}

