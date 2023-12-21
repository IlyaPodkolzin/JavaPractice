package java10;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // �� ����������
        System.out.println("��:");
        List<Student> students = setArray();
        outArray(students);
        System.out.println();

        // ���������� �� GPA
        System.out.println("�� GPA:");
        Comparator<Student> sortingStudentsByGPA = new SortingStudentsByGPA();
        students.sort(sortingStudentsByGPA);
        outArray(students);
        System.out.println();

        // ���������� �� ID
        System.out.println("�� ID:");
        students = setArray();
        Comparator<Student> sortingStudentsById = new SortingStudentsByID();
        students.sort(sortingStudentsById);
        outArray(students);
    }

    // �������� �������
    static private List<Student> setArray() {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "�����", "�������", 2, "������-13-666", 150));
        students.add(new Student(6, "����", "�������", 2, "����-16-22", 88));
        students.add(new Student(15, "���������", "�������", 2, "����-16-22", 80));
        students.add(new Student(4, "NoName", "NoSurName", 4, "����-NO-20", 10));
        students.add(new Student(2, "���������", "�������", 2, "����-16-22", 74));
        return students;
    }

    // ����� �������
    static private void outArray(List<Student> students) {
        for (Student student : students) System.out.println(student);
    }
}
