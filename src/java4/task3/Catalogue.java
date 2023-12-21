package java4.task3;

public enum Catalogue {
    FRUITS("������"),
    VEGETABLES("�����"),
    BERRY("�����");

    private final String name;


    Catalogue(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
