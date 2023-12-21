package java13.task2;

public class Student {
    private String name;
    private String surname;
    private String fatherName;

    public Student(String surname, String name, String fatherName) {
        this.name = name;
        this.surname = surname;
        this.fatherName = fatherName;
    }

    public Student(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Студент: " + surname + " " + getStringName() + getStringFatherName();
    }

    private String getStringName() {
        if (name == null) return "";
        else return name.charAt(0) + ".";
    }

    private String getStringFatherName() {
        if (fatherName == null) return "";
        else return fatherName.charAt(0) + ".";
    }
}
