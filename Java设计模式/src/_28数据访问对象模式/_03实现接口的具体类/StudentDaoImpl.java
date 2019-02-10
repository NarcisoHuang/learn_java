package _28数据访问对象模式._03实现接口的具体类;

import _28数据访问对象模式._01值对象包.Student;
import _28数据访问对象模式._02数据访问对象接口包.StudentDao;

import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudentDao {

    List<Student> studentList;

    public StudentDaoImpl() {
        studentList = new ArrayList<Student>();

        Student student1 = new Student("Rob", 0);
        Student student2 = new Student("John",1);
        studentList.add(student1);
        studentList.add(student2);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentList;
    }

    @Override
    public Student getStudent(int rollNo) {
        return studentList.get(rollNo);
    }

    @Override
    public void updateStudent(Student student) {
        studentList.get(student.getRollNo() ).setName(student.getName());
        System.out.println("Student: Roll No: " + student.getRollNo() + ", updated in the database. ");
    }

    @Override
    public void deleteStudent(Student student) {
        studentList.remove(student.getRollNo());
        System.out.println("Student: Roll No: " + student.getRollNo() + ", deleted from database. ");
    }
}
