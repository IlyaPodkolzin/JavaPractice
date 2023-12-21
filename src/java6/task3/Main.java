package java6.task3;

public class Main {
    public static void main(String[] args) {

        // создание объектов и вывод их имён
        Animal animal = new Animal("Кот");
        System.out.println(animal.getName());

        Car car = new Car("Москвич");
        System.out.println(car.getName());

        Planet planet = new Planet("Нептун");
        System.out.println(planet.getName());
    }
}
