package mvc;

import mvc.controller.StudentController;
import mvc.model.Student;
import mvc.view.StudentView;

/**
 * Created by Kajo on 7/2/2016.
 */
public class MVCPatternTest {

    public static void main(String[] args) {

        // fetch student from the DB
        Student model = retriveStudent();

        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);

        controller.updateView();

        // fill with some data
        controller.setStudentName("Ugorcak");
        controller.updateView();
    }

    // help class
    private static Student retriveStudent() {
        Student student = new Student();
        student.setName("Karol");
        student.setRollNo("22");
        return student;
    }
}
