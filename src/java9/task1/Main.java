package java9.task1;

public class Main {
    public static void main(String[] args) {

        // создание массива
        Student[] students = {
                new Student(234, "Илья", 67),
                new Student(2, "Денис", 74),
                new Student(100, "Артем", 70),
                new Student(24, "Александр", 54),
                new Student(25, "Влад", 89)
        };

        sort(students);
        printStudents(students);
    }

    // сортировка массива
    private static void sort(Student[] students) {
        Student value;
        for (int left = 0; left < students.length; left++) {
            value = students[left];
            int i = left - 1;
            for (; i >= 0; i--) {
                if (value.id < students[i].id) {
                    students[i + 1] = students[i];
                } else {
                    break;
                }
            }
            students[i + 1] = value;
        }
    }

    // вывод массива
    private static void printStudents(Student[] students) {
        for (Student student : students) System.out.println(student);
    }
}
