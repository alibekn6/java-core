import java.time.LocalDate;
import java.time.Period;

public class Main {
    public static void main(String[] args) {
        StringBuffer demoString = new StringBuffer("String buffer");
        System.out.println(demoString.append("efef").toString());

    }
}


class User {
    static final int USER_MIN_AGE = 16;
    final LocalDate birthDate;

    User(LocalDate birthDate) {
        assertGreaterOrEqualsToMinAge(birthDate);
        this.birthDate = birthDate;
    }

    private void assertGreaterOrEqualsToMinAge(LocalDate birthDate) {
        if (Period.between(birthDate, LocalDate.now()).getYears() < USER_MIN_AGE) {
            throw new IllegalArgumentException("birthDate must be greater than or equal to " + USER_MIN_AGE);
        }
    }

}


class Seq {
    static {
        System.out.println("Static block here .. . .");
    }

    static void executeStaticMethod() {
        System.out.println("Static method here .. . .");
    }
}