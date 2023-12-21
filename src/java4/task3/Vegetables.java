package java4.task3;

public enum Vegetables {
    TOMATO(12),
    CABBAGE(9.3),
    ONION(7.3),
    PICKLES(15.2),
    POTATO(14.1),
    BEET(5.22),
    CARROT(6.31);

    private final double cost;

    Vegetables(double cost) {
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }

    public static String showVegetables() {
        String result =  "Овощи:\n";
        int i = 1;
        for (Vegetables vegetables: Vegetables.values()) {
            result += String.format("%d - %s - %.2f рублей%n", i, vegetables, vegetables.cost);
            i++;
        }
        return result;
    }

    public static Vegetables selectVegetable(int choiceNum) {
        switch (choiceNum) {
            case 2:
                return CABBAGE;
            case 3:
                return ONION;
            case 4:
                return PICKLES;
            case 5:
                return POTATO;
            case 6:
                return BEET;
            case 7:
                return CARROT;
            default:
                return TOMATO;
        }
    }
}
