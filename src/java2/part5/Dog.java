package java2.part5;

public class Dog {
    private String name;
    private int dogAge;

    public Dog(String name, int dogAge) {
        this.name = name;
        this.dogAge = dogAge;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDogAge() {
        return dogAge;
    }

    public void setDogAge(int dogAge) {
        this.dogAge = dogAge;
    }

    public int toHumanAge() {
        return dogAge * 7;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", dogAge=" + dogAge +
                '}';
    }
}
