package tasks;


import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Sn {

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Hero el = new Elf("El", 10_000, 800, 3000, 999);
        Orc or = new Orc("ORCCCC", 10_000, 800, 3000, 999);
        Hero dw = new Dwarf("Dw", 10_000, 800, 3000, 999, 0.8);



        Hero hero = new Hero("Kuzya", 10_000, 800, 3000, 999) {
            @Override
            public void attack(Hero enemy) {
                enemy.takeDamage(getPower() * 2);
            }
            @Override
            public void speak() {
                System.out.println("Im a hero HAHAHAHA LOL");
            }
        };

//
//        el.attack(or);
//        or.attack(el);
//        dw.attack(or);
//        el.attack(dw);
//
//        or.useDefence();
//
//
//
//        System.out.println(el.getHealth());
//        System.out.println(or.getHealth());
//        System.out.println(dw.getHealth());

    }
}


abstract class Hero {
    private String name;
    private int health;
    private int power;
    private int armor;
    private int level;

    public Hero(String name, int health, int power, int armor, int level) {
        this.name = name;
        this.health = health;
        this.power = power;
        this.armor = armor;
        this.level = level;
    }

    public abstract void speak();

    public void takeDamage(int damage) {
        health -= damage;
    }

    public void attack(Hero enemy) {
        enemy.takeDamage(getPower());
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return this.health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getPower() {
        return this.power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getArmor() {
        return this.armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public int getLevel() {
        return this.level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}


class Dwarf extends Hero {
    private final double blockChance;

    public Dwarf(String name, int health, int power, int armor, int level, double blockChance) {
        super(name, health, power, armor, level);
        between0and100(blockChance);
        this.blockChance = blockChance;
    }

    @Override
    public void takeDamage(int damage) {
        double blockAttempt = (System.currentTimeMillis() % 100) + 1; // 30

        if (blockChance >= blockAttempt) {
            System.out.println("NE POPAL");
        } else {
            super.takeDamage(damage);
        }
    }

    @Override
    public void speak() {
        System.out.println("Nil om di popa Dwarfi di sena miagritus ji hanukoiw");
    }


    private static void between0and100(double blockChance) {
        if (blockChance < 0 || blockChance > 100) {
            throw new IllegalArgumentException("Only between 0 and 100");
        }
    }


}

class Elf extends Hero {
    public Elf(String name, int health, int power, int armor, int level) {
        super(name, health, power, armor, level);
    }

    @Override
    public void speak() {
        System.out.println("Elfo merio hajo miagritus ji eduno siakma");
    }
}

class Orc extends Hero {
    private boolean defenceActive;
    public Orc(String name, int health, int power, int armor, int level) {
        super(name, health, power, armor, level);
        defenceActive = false;
    }

    @Override
    public void speak() {
        System.out.println("Ajomitu de Orc motiso hajo di refejio he");
    }

    public void useDefence() {
        defenceActive = true;
    }

    @Override
    public void takeDamage(int damage) {
        if (defenceActive) {
            super.takeDamage(damage / getArmor());
        } else {
            super.takeDamage(damage);
        }
        defenceActive = false;
    }

}
