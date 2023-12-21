package java7.task7_8;

public class Main {
    public static void main(String[] args) {

        // массив
        Printable[] printables = {
            new Book("a"),
            new Book("b"),
            new Magazine("c"),
            new Book("d"),
            new Book("e"),
            new Magazine("f"),
            new Magazine("g"),
            new Magazine("h"),
            new Book("i"),
        };

        // вывод массива - книг и журналов по отдельности
        Printable.printMagazines(printables);
        System.out.println();
        Printable.printBooks(printables);
    }
}
