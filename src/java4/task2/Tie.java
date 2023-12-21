package java4.task2;

public class Tie extends Clothes implements MenClothing {
    @Override
    public void dressMan() {
        System.out.printf("Галстук:%n----Размер: %s%n----Цена: $%.2f%n----Цвет: %s%n%n%n",
                this.parlour + "(" + this.parlour.getSize() + ", " + this.parlour.getDescription() + ")",
                this.cost,
                this.color);
    }

    public Tie(Parlour parlour, double cost, String color) {
        this.parlour = parlour;
        this.cost = cost;
        this.color = color;
    }
}
