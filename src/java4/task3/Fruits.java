package java4.task3;

public enum Fruits {
    APPLE(25),
    BANANA(27.5),
    LEMON(15.89),
    LIME(45.4),
    KIWI(50.33),
    STARFRUIT(51),
    ORANGE(20),
    PINEAPPLE(74.5);

    private final double cost;

    Fruits(double cost) {
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }

    public static String showFruits() {
        String result =  "Фрукты:\n";
        int i = 1;
        for (Fruits fruits: Fruits.values()) {
            result += String.format("%d - %s - %.2f рублей%n", i, fruits, fruits.cost);
            i++;
        }
        return result;
    }

    public static Fruits selectFruit(int choiceNum) {
        switch (choiceNum) {
            case 2:
                return BANANA;
            case 3:
                return LEMON;
            case 4:
                return LIME;
            case 5:
                return KIWI;
            case 6:
                return STARFRUIT;
            case 7:
                return ORANGE;
            case 8:
                return PINEAPPLE;
            default:
                return APPLE;
        }
    }
}
