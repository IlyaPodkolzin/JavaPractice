package java4_1.task37;

public class Employer {
    protected final String firstName;
    protected final String lastName;
    protected final double income;

    public Employer(String firstName, String lastName, double income) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.income = income;
    }

    public double getIncome(int workDays) {
        if (workDays > 360) return income + 12;
        return income;
    }
}
