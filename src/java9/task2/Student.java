package java9.task2;

// студент
public class Student {
    public int id;
    public String name;
    public int gpa;

    public Student(int id, String name, int gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}
