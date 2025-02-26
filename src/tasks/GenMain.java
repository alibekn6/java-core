package tasks;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.IntStream;

// M6 -> fields x = 2;
// which have method doIt which takes object of itself and increment +2
//
public class GenMain {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);

        m1(list);
        Byte b = Byte.valueOf((byte)1);
        System.out.println(b.floatValue());

        int res = IntStream.of(1,2,3).reduce(0, (num1, num2) -> (num1 + num2) * 2);
        System.out.println(res);

        IntStream stream = IntStream.of(-6, - 5, -4);
        System.out.println(stream);


    }

    public static void m1(List<?> list) {
        m0(list);
    }

    private static <T> void m0(List<T> list) {
        list.set(1, list.get(0));
        System.out.println(list);
    }

    // get -> index arguemnts


}


