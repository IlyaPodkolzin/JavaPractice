package java4.task3;

public enum Catalogue {
    FRUITS("‘рукты"),
    VEGETABLES("ќвощи"),
    BERRY("ягоды");

    private final String name;


    Catalogue(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
