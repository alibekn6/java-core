package CustomerOrderService;

import CustomerOrderService.Enums.DeliveryZone;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Address {
    private final String street;
    private final String city;
    private final String region;
    private final String zipCode;
    private final DeliveryZone zone;


    Address(String street, String city, String region, String zipCode, DeliveryZone zone) {
        if (!isValidZipCode(zipCode)) {
            throw new IllegalArgumentException("Invalid zip code");
        }

        this.street = street;
        this.city = city;
        this.region = region;
        this.zipCode = zipCode;
        this.zone = zone;
    }

    public DeliveryZone getZone() {
        return zone;
    }

    private boolean isValidZipCode(String zipCode) {
        String regex = "^[A-Z]{1,2}[0-9R][0-9A-Z]? [0-9][ABD-HJLNP-UW-Z]{2}$";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(zipCode);
        return matcher.matches();
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %s %s (%s)", street, city, region, zipCode, zone);
    }


}

