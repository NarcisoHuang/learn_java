package _25MVC模式._04Demo包;

import _25MVC模式._01模型类包.Student;
import _25MVC模式._02视图包.StudentView;
import _25MVC模式._03控制器包.StudentController;

public class MVCPatternDemo {
    public static void main(String[] args) {

        // 创建model对象
        Student studentModel = retriveStudentFromDatabase();
        // 创建view对象
        StudentView studentView = new StudentView();
        // 创建controller对象
        StudentController controller = new StudentController(studentModel, studentView);

        controller.updateView();
        System.out.println("=============================");
        // 修改模型的细节
        controller.setStudentName("John");
        controller.updateView();
    }

    public static Student retriveStudentFromDatabase() {
        Student student = new Student();
        student.setName("Rob");
        student.setRollNo("10");
        return student;
    }
}
