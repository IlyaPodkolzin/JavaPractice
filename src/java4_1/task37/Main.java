package java4_1.task37;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Employer employer = new Manager("Petr", "Petrov", 122.11, 122.33);
        System.out.println(employer.getIncome(350));
        System.out.println(employer.getIncome(361));

        Random random = new Random();
        Employer[] employers = new Employer[10];
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) employers[i] = new Employer("first" + i,
                    "last" + i, Math.random() * (1000 + random.nextInt(9000)));

            else employers[i] = new Manager("first" + i,
                    "last" + i, Math.random() * (1000 + random.nextInt(9000)),
                    Math.random() * (100 + random.nextInt(900)));

            int workDays = 340 + random.nextInt(25);
            System.out.println("workdays = " + workDays + ": " + employers[i].getIncome(workDays));
        }
    }
}
