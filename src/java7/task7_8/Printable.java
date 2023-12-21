package java7.task7_8;

// выводимый
public interface Printable {
    void print();

    // методы для вывода
    static void printMagazines(Printable[] printables) {
        for (Printable printable : printables)
            if (printable instanceof Magazine)
                printable.print();
    }

    static void printBooks(Printable[] printables) {
        for (Printable printable : printables)
            if (printable instanceof Book)
                printable.print();
    }
}
