package java4.task3;

public enum Berry {
    STRAWBERRY(31.11),
    CRANBERRY(42.11),
    BLACKBERRY(35.12),
    BLUEBERRY(66.4),
    GOOSEBERRY(76);

    private final double cost;

    Berry(double cost) {
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }

    public static String showBerry() {
        String result =  "ягоды:\n";
        int i = 1;
        for (Berry berry: Berry.values()) {
            result += String.format("%d - %s - %.2f рублей%n", i, berry, berry.cost);
            i++;
        }
        return result;
    }

    public static Berry selectBerry(int choiceNum) {
        switch (choiceNum) {
            case 2:
                return CRANBERRY;
            case 3:
                return BLACKBERRY;
            case 4:
                return BLUEBERRY;
            case 5:
                return GOOSEBERRY;
            default:
                return STRAWBERRY;
        }
    }
}
