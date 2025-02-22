package tasks;

public enum Planet {
    MARS("Марс"),
    VENUS("Венера"),
    EARTH ("Земля"),
    JUPITER ("Юпитер");


    private final String russianType;

    Planet(String russianType) {
        this.russianType = russianType;
    }

    public String getRussianType() {
        return russianType;
    }
}
