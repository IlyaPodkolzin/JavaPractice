package java19.task2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws StudentNotFoundException {

        Scanner scanner = new Scanner(System.in);
        Comparator<Student> sortingStudentsByGpa = new SortingStudentsByGPA();

        List<Student> students = setArray();
        System.out.println("""
                �������� ��������:
                0 - �����;
                1 - �������� ������ ������;
                2 - �������� ������� ������;
                3 - ��������;
                4 - ������������� �� �������� �����;
                5 - ����� �������� �� ��.
                """);

        int enter;
        String name;
        boolean find;
        while (true) {
            System.out.print("������� ����� �������: ");
            enter = scanner.nextInt();

            switch (enter) {
                case 0:
                    return;
                case 1:
                    System.out.println("""
                            �������� ��������:
                            0 - �����;
                            1 - �������� ������ ������;
                            2 - �������� ������� ������;
                            3 - ��������;
                            4 - ������������� �� �������� �����;
                            5 - ����� �������� �� ��.""");
                    break;
                case 2:
                    outArray(students);
                    break;
                case 3:
                    Student student = new Student();
                    System.out.print("id: ");
                    student.setId(scanner.nextInt());
                    System.out.print("name: ");
                    student.setName(scanner.next());
                    System.out.print("surname: ");
                    student.setSurname(scanner.next());
                    System.out.print("course: ");
                    student.setCourse(scanner.nextInt());
                    System.out.print("group: ");
                    student.setGroup(scanner.next());
                    System.out.print("GPA: ");
                    student.setGpa(scanner.nextInt());
                    students.add(student);
                    break;
                case 4:
                    students.sort(sortingStudentsByGpa);
                    outArray(students);
                    break;
                case 5:
                    System.out.print("������� ���:");
                    name = scanner.next();
                    find = false;
                    for (Student student1 : students) {
                        if (student1.getName().equals(name)) {
                            System.out.println(student1);
                            find = true;
                        }
                    }
                    if (!find) throw new StudentNotFoundException("������� � ������ '" + name + "' �� ������");
                    break;
                default:
                    System.out.println("���������� �����");
            }
            System.out.println();
        }
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

