package tasks;

import java.lang.reflect.Field;
import java.util.Arrays;
import tasks.Planet;

public class Xa {
    public static void main(String[] args) throws IllegalAccessException {

        System.out.println(Planet.EARTH);


//        for (Field field : Planets.class.getDeclaredFields()) {
//            System.out.println(field.get(0));
//        }
    }

}

class Planets {
    static final String MARS = "Mars";
    static final String VENUS = "Venus";
    static final String EARTH = "Earth";
    static final String JUPITER = "Jupiter";
}



