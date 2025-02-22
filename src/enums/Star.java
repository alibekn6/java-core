package enums;

public enum Star implements Measurable {
    SOLAR("Солнце", 3412.53);
    private final double diameter;
    private final String russianType;


    Star(String russianType, double diameter) {
        this.russianType = russianType;
        this.diameter = diameter;
    }


    @Override
    public double diameter() {
        return diameter;
    }

    public String getRussianType() {
        return russianType;
    }


}
