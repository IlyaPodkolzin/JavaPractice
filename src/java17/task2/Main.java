package java17.task2;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("Илья");
        employee.setIncome(12900.112);

        EmployeeController controller = new EmployeeController(employee, new EmployeeView());

        controller.updateView();
        System.out.println();

        controller.setCalculateIncome(1000000.80, 12);

        controller.updateView();
    }
}
