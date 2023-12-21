package java4_1.company;

public class Tester {

    public static void test() {
        Circle circle = new Circle(3.55);
        Rectangle rectangle = new Rectangle(3, 7);
        Square square = new Square(12);

        System.out.println(((Shape)circle).toString());
        System.out.println(((Shape)rectangle).toString());
        System.out.println(((Shape)square).toString());

        System.out.println(((Shape)circle).getArea());
        System.out.println(((Shape)rectangle).getArea());
        System.out.println(((Shape)square).getArea());

        System.out.println(((Shape)circle).getPerimeter());
        System.out.println(((Shape)rectangle).getPerimeter());
        System.out.println(((Shape)square).getPerimeter());

        System.out.println(((Shape)circle).getType());
        System.out.println(((Shape)rectangle).getType());
        System.out.println(((Shape)square).getType());
    };
}
