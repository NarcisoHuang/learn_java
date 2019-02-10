package _25MVC模式._03控制器包;

import _25MVC模式._01模型类包.Student;
import _25MVC模式._02视图包.StudentView;

public class StudentController {
    private Student model;
    private StudentView view;

    public StudentController(Student model, StudentView view) {
        this.model = model;
        this.view = view;
    }


    public void setStudentName(String name) {
        model.setName(name);
    }
    public void setStudentRollNo(String rollNo) {
        model.setRollNo(rollNo);
    }


    public String getStudentName() {
        return model.getName();
    }
    public String getStudentRollNo() {
        return model.getRollNo();
    }

    public void updateView() {
        view.printStudentDetails(model.getName(), model.getRollNo());
    }

}
