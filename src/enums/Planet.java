package enums;


public enum Planet implements Measurable{
    MARS("Марс", 192.4),
    VENUS("Венера", 9213.12),
    EARTH ("Земля", 2316.21),
    JUPITER ("Юпитер", 4915.32);


    private final String russianType;
    private final double diameter;

    Planet(String russianType, double diameter) {
        this.russianType = russianType;
        this.diameter = diameter;
    }


    public String getRussianType() {
        return russianType + " " + diameter;
    }

    @Override
    public double diameter() {
        return diameter;
    }
}
