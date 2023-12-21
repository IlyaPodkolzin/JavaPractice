package java9.task3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // массив 1
        List<Student> students = new ArrayList<>(List.of(new Student[]{
                new Student(234, "Илья", 67),
                new Student(2, "Денис", 74),
                new Student(100, "Артем", 70),
                new Student(24, "Александр", 54),
                new Student(25, "Влад", 89)
        }));

        // массив 2
        List<Student> students1 = new ArrayList<>(List.of(new Student[]{
                new Student(234, "НЕИлья", 2),
                new Student(2, "НЕДенис", 14),
                new Student(100, "НЕАртем", 7),
                new Student(24, "НЕАлександр", 33),
                new Student(25, "НЕВлад", 890)
        }));
        // сортировка массивов
        Comparator<Student> sortingStudentsByGPA = new SortingStudentsByGPA();
        students.sort(sortingStudentsByGPA);
        students1.sort(sortingStudentsByGPA);


        System.out.println("До слияния:");
        for (Student student : students) System.out.println(student);
        System.out.println();
        for (Student student : students1) System.out.println(student);
        System.out.println();

        Student[] a = new Student[0];
        Student[] b = new Student[0];

        Student[] students2 = mergeArray(students.toArray(a), students1.toArray(b));
        System.out.println("После слияния:");
        for (Student student : students2) System.out.println(student);
    }

    // слияние
    private static Student[] mergeArray(Student[] arrayA, Student[] arrayB) {

       Student[] arrayC = new Student[arrayA.length + arrayB.length];
        int positionA = 0, positionB = 0;

        for (int i = 0; i < arrayC.length; i++) {
            if (positionA == arrayA.length) {
                arrayC[i] = arrayA[i - positionA];
                positionB++;
            } else if (positionB == arrayB.length) {
                arrayC[i] = arrayB[i - positionB];
                positionA++;
            } else if (arrayA[i - positionA].gpa < arrayB[i - positionB].gpa) {
                arrayC[i] = arrayA[i - positionA];
                positionB++;
            } else {
                arrayC[i] = arrayB[i - positionB];
                positionA++;
            }
        }
        return arrayC;
    }
}
