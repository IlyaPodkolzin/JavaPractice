package java9.task4;

public class Main {
    public static void main(String[] args) {

        Student student = new Student(22, "Илья", 66);
        Student student1 = new Student(22, "Артем", 67);

        // сравнение двух студентов
        if (student.compareTo(student1) > 0)
            System.out.println(student + " лучше");
        else if (student.compareTo(student1) < 0)
            System.out.println(student1 + " лучше");
        else
            System.out.println(student + " = " + student1);

    }
}
