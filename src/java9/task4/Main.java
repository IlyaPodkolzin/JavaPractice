package java9.task4;

public class Main {
    public static void main(String[] args) {

        Student student = new Student(22, "����", 66);
        Student student1 = new Student(22, "�����", 67);

        // ��������� ���� ���������
        if (student.compareTo(student1) > 0)
            System.out.println(student + " �����");
        else if (student.compareTo(student1) < 0)
            System.out.println(student1 + " �����");
        else
            System.out.println(student + " = " + student1);

    }
}
