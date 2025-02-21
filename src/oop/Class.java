package oop;



public class Class {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.printStudent();
    }
}


class Student {
    String name;
    int id;
    public void printStudent() {
        System.out.println("Id:" + id);
        System.out.println("Name:" + name);
    }

}

