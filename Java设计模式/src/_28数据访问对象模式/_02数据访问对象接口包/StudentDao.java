package _28数据访问对象模式._02数据访问对象接口包;

import _28数据访问对象模式._01值对象包.Student;

import java.util.List;

public interface StudentDao {
    public List<Student> getAllStudents();
    public Student getStudent(int rollNo);
    public void updateStudent(Student student);
    public void deleteStudent(Student student);
}
