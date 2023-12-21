package java7.task7_8;

// журнал
public class Magazine implements Printable {
    private String name;

    public Magazine(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("Журнал " + name);
    }
}
