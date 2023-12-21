package java4.task2;

public class Pants extends Clothes implements MenClothing, WomenClothing{
    @Override
    public void dressMan() {
        System.out.printf("������� �����:%n----������: %s%n----����: $%.2f%n----����: %s%n%n%n",
                this.parlour + "(" + this.parlour.getSize() + ", " + this.parlour.getDescription() + ")",
                this.cost,
                this.color);
    }

    @Override
    public void dressWoman() {
        System.out.printf("������� �����:%n----������: %s%n----����: $%.2f%n----����: %s%n%n%n",
                this.parlour + "(" + this.parlour.getSize() + ", " + this.parlour.getDescription() + ")",
                this.cost,
                this.color);
    }

    public Pants(Parlour parlour, double cost, String color) {
        this.parlour = parlour;
        this.cost = cost;
        this.color = color;
    }
}
