package java7.task7_8;

// книга
public class Book implements Printable {
    private String name;

    public Book(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("Книга " + name);
    }
}
