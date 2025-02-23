package newPackage;

import java.time.LocalDate;
import java.lang.IllegalArgumentException;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {

    }
}


// inter one

enum ItemStatus {
    AVAILABLE,
    BORROWED,
    LOST
}


interface Reservable {
    void reserve(User user);
    void cancelReservation();
    boolean isReserved();
}



interface Borrowable {
    void borrow(User user);
    void returnItem();
    boolean isAvailable();
    double calculateFine();
}



abstract class LibraryItem implements Borrowable, Reservable {
    private final String title;
    private final String id;
    private ItemStatus status;
    private User borrowedBy;
    private User reservedBy;
    private LocalDate borrowDate;
    private final int borrowPeriodDays;
    private static final double DAILY_FINE = 1.0;


    protected LibraryItem (String title, int borrowPeriodDays) {
        this.id = UUID.randomUUID().toString();
        this.title = title;
        this.status = ItemStatus.AVAILABLE;
        this.borrowPeriodDays = borrowPeriodDays;
    }

    @Override
    public void borrow(User user) {
        if (!isAvailable()) {
            throw new IllegalStateException("The item is not available for borrowing");
        }
        if (reservedBy != null && !reservedBy.equals(user)) {
            throw new IllegalStateException("Item is reserved by another user");
        }

        this.borrowedBy = user;
        this.status = ItemStatus.BORROWED;
        this.borrowDate = LocalDate.now();
        this.reservedBy = null;
    }

    @Override
    public void returnItem() {

        if (status != ItemStatus.BORROWED) {
            throw new IllegalStateException("The item is not borrowed");
        }

        this.borrowDate = null;
        this.borrowedBy = null;

        this.status = ItemStatus.AVAILABLE;
    }

    @Override
    public boolean isAvailable() {
        return status == ItemStatus.AVAILABLE;
    }

    @Override
    public void reserve(User user) {
        if (reservedBy != null) {
            throw new IllegalStateException("Item is already reserved");
        }

        this.reservedBy = user;
    }




}


class User {

}






//class Book extends LibraryItem {
//    private String author;
//    private String ISBN;
//}







// easy one
enum AnimalType {
    DOG("Cобака"),
    CAR("КОШКА"),
    BIRD("ПтичКа");

    private final String typeInRussian;

    AnimalType(String typeInRussian) {
        this.typeInRussian = typeInRussian;
    }

    public String getTypeInRussian() {
        return typeInRussian;
    }

}


abstract class Animal {
    private String name;
    private int age;
    private final AnimalType type;


    Animal(String name, int age, AnimalType type) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
        this.name = name;
        this.age = age;
        this.type = type;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        this.name = name;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getType() {
        return type.getTypeInRussian();
    }

    public abstract void makeSound();
}



class Dog extends Animal {
    Dog(String name, int age) {
        super(name, age, AnimalType.DOG);
    }

    @Override
    public void makeSound() {
        System.out.println("Woof wooof!!!!!!");
    }
}



// Create an abstract class Animal with basic properties (name, age)
// Create enum AnimalType (DOG, CAT, BIRD)
// Create concrete classes for different pets
// Demonstrate basic encapsulation and inheritance
