package java13.task4;

public class Shirt {
    public String id;
    public String name;
    public String color;
    public String size;

    public Shirt(String string) {
        String[] parts = string.split(",");

        id = parts[0];
        name = parts[1];
        color = parts[2];
        size = parts[3];
    }

    @Override
    public String toString() {
        return "Shirt{" + '\n' +
                "id = " + id + '\n' +
                "name = " + name + '\n' +
                "color = " + color + '\n' +
                "size = " + size + '\n' +
                '}';
    }
}
