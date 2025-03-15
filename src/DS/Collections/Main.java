package DS.Collections;



public class Main {
    public static void main(String[] args) {
        var list = new GenericList<String>();
        list.add("a");
        list.add("b");
        list.add("c");

        for (var item : list) {
            System.out.println(item);
        }
    }
}
