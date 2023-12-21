package java3.task6;

import java.text.NumberFormat;
import java.util.Formatter;
import java.util.Locale;
import java.util.Random;

public class Report {
    private static Employee[] employees;

    public static void setEmployees(int amount) {
        employees = new Employee[amount];
        Random random = new Random();
        for (int i = 0; i < amount; i++) {
            employees[i] = new Employee("Employee" + i, Math.random() * (1000 + random.nextInt(5000)));
        }
    }

    public static String generateReport() {
        Formatter formatter = new Formatter();
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(Locale.US);
        String result = "Отчёт о сотрудниках:\n";
        for (Employee employee: employees) {
            result += employee.getFullname() + "\n";
            result += String.format("-----%15s%n%n", numberFormat.format(employee.getSalary()));
        }
        formatter.close();
        return result;
    }
}
