package java4_1.task37;

public class Manager extends Employer{
    private final double averageSum;

    public Manager(String firstName, String lastName,
                   double income, double averageSum) {
        super(firstName, lastName, income);
        this.averageSum = averageSum;
    }

    public double getIncome(int workDays) {
        if (workDays > 360) return income * 12 + averageSum;
        return income + averageSum;
    }
}
