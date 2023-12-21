package java19.task2;

// студент
public class Student {
    private int id;
    private String name;
    private String surname;
    private int course;
    private String group;
    private int gpa;

    public Student() {}

    public Student(int id, String name, String surname, int course, String group, int gpa) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.course = course;
        this.group = group;
        this.gpa = gpa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getGpa() {
        return gpa;
    }

    public void setGpa(int gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", course=" + course +
                ", group='" + group + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}
