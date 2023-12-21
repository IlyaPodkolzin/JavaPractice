package java17.task1;

public class MVCPatternDemo {
    public static void main(String[] args) {

        StudentController controller = new StudentController(retrieveStudentFromDatabase(), new StudentView());

        controller.updateView();
        System.out.println();

        controller.setStudentName("Илья");
        controller.setStudentRollNo("JNMHKVBUK555");

        controller.updateView();
    }

    private static Student retrieveStudentFromDatabase() {
        Student student = new Student();
        student.setRollNo("HBUJL67");
        student.setName("Артем");
        return student;
    }
}
