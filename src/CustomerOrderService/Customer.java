package CustomerOrderService;

import java.util.UUID;

public class Customer {
    private final String name;
    private final String id;
    private final String email;

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
        this.id = UUID.randomUUID().toString();
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
