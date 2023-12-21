package java4.task2;

public class TShirt extends Clothes implements MenClothing, WomenClothing {
    @Override
    public void dressMan() {
        System.out.printf("Мужская футболка:%n----Размер: %s%n----Цена: $%.2f%n----Цвет: %s%n%n%n",
                this.parlour + "(" + this.parlour.getSize() + ", " + this.parlour.getDescription() + ")",
                this.cost,
                this.color);
    }

    @Override
    public void dressWoman() {
        System.out.printf("Женская футболка:%n----Размер: %s%n----Цена: $%.2f%n----Цвет: %s%n%n%n",
                this.parlour + "(" + this.parlour.getSize() + ", " + this.parlour.getDescription() + ")",
                this.cost,
                this.color);
    }

    public TShirt(Parlour parlour, double cost, String color) {
        this.parlour = parlour;
        this.cost = cost;
        this.color = color;
    }
}
