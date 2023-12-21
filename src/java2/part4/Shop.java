package java2.part4;

import java.util.Arrays;

public class Shop {
    private Computer[] computers = new Computer[0];

    public void addComputer(Computer computer) {
        computers = Arrays.copyOf(computers, computers.length + 1);
        computers[computers.length - 1] = computer;
    }

    public void deleteComputer(String company, String model) {
        for (int i = 0; i < computers.length; i++) {
            if (computers[i].getCompany().equals(company) &&
                    computers[i].getModel().equals(model)) {
                computers[i] = new Computer("0", "0");
            }
        }
    }

    public boolean searchComputer(String company, String model) {
        for (Computer computer : computers)
            if (computer.getCompany().equals(company) &&
                    computer.getModel().equals(model))
                return true;
        return false;
    }
}
