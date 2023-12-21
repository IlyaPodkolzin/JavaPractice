package java17.task2;

public class EmployeeController {
    private Employee model;
    private EmployeeView view;

    public EmployeeController(Employee model, EmployeeView view) {
        this.model = model;
        this.view = view;
    }

    public void setEmployeeIncome(double income) {
        model.setIncome(income);
    }

    public double getEmployeeIncome() {
        return model.getIncome();
    }

    public void setEmployeeName(String name) {
        model.setName(name);
    }

    public String getEmployeeName() {
        return model.getName();
    }

    public void setCalculateIncome(double money, int monthCount) {
        model.setIncome(money / monthCount);
    }

    public void updateView() {
        view.printEmployeeDetails(model.getName(), model.getIncome());
    }
}
