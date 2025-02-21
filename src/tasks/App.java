package tasks;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class App {
    public static void main(String[] args) {
        FilterChain filterChain = new FilterChain(List.of(new CityFilter("st. Astana")));

        List<String> addresses = List.of(
                "Kz, st. Almaty, street Tolebi",
                "Kz, st. Astana, street Nazar",
                "Ru, st. Moscow, street Nobel",
                "Kz, st. Aktobe, street Aiteke bi",
                "Kz, st. Shymkent, street Abay",
                "Kz, st. Semey, street Dostyk",
                "Ru, st. Saint Petersburg, street Nevsky",
                "Us, st. Washington, street Jefferson"
        );


        filterChain.filter(addresses).forEach(System.out::println);

    }
}



interface AddressFilter {
    Collection<String> filter(Collection<String> collection);
}

class FilterChain {

    private final List<AddressFilter> addressFilters;

    public FilterChain(List<AddressFilter> addressFilters) {
        this.addressFilters = addressFilters;
    }

    public Collection<String> filter(Collection<String> address) {
        Collection<String> filteredAddress = new ArrayList<>(address);

        for (AddressFilter addressFilter : addressFilters) {
            filteredAddress = addressFilter.filter(filteredAddress);
        }
        return filteredAddress;
    }

}


class CityFilter implements AddressFilter {
    private final String city;

    public CityFilter (String city) {
        cityNotNull(city);
        this.city = city;
    }

    public Collection<String> filter(Collection<String> address) {
        return address.stream().filter(it -> city.startsWith(it.split(",")[1].trim())).toList();
    }


    private static void cityNotNull(String city) {
        if (city == null) {
            throw new IllegalArgumentException("City can't be null");
        }
    }

}


class CountryFilter implements AddressFilter {
    @Override
    public Collection<String> filter(Collection<String> address) {
        return address.stream().filter(it -> it.startsWith("Kz")).toList();
    }
}


class AlmatyFilter implements AddressFilter {

    private final String ALMATY = "st. Almaty";

    @Override
    public Collection<String> filter(Collection<String> address) {
        return address.stream().filter(it -> ALMATY.equals(it.split(",")[1].trim())).toList();
    }
}


class AstanaFilter implements AddressFilter {

    private final String ASTANA = "st. Astana";

    @Override
    public Collection<String> filter(Collection<String> address) {
        return address.stream().filter(it -> ASTANA.equals(it.split(",")[1].trim())).toList();
    }
}

