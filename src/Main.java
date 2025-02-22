import java.time.LocalDate;
import java.time.Period;

public class Main {
    public static void main(String[] args) {
        System.out.println(User.USER_MIN_AGE);

        Seq.executeStaticMethod();

        User user = new User(LocalDate.of(2009, 1, 15));
        System.out.println(user.birthDate);

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