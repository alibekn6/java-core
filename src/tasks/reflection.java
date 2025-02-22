package tasks;

import java.lang.NoSuchFieldException;
import java.lang.IllegalAccessException;
import java.lang.reflect.Field;

public class reflection {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
//        MyClass myClass = new MyClass();
//        int num = myClass.getNumber();
//        System.out.println(num);
//
//        String name = null;
//
//
//        Field f = myClass.getClass().getDeclaredField("name");
//        f.setAccessible(true);
//        System.out.println(f.get(myClass));

        myClass2 myClass2 = new myClass2();

        Field f2 = myClass2.getClass().getDeclaredField("saz");
        f2.setAccessible(true);

        System.out.println(f2.get(myClass2));

//        try {
//            Field field = myClass.getClass().getDeclaredField("name");
//            field.setAccessible(true);
//            name = (String) field.get(myClass);
//        } catch (NoSuchFieldException | IllegalAccessException e) {
//            e.printStackTrace();
//        }


    }
}


class myClass2 {
    private String saz = "def";


}

class MyClass {
    private int number;
    private String name = "default";
    //    public MyClass(int number, String name) {
//        this.number = number;
//        this.name = name;
//    }
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }

    private void printData(){
        System.out.println(number + name);
    }
}