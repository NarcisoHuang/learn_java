package _28数据访问对象模式._04Demo包;

import _28数据访问对象模式._01值对象包.Student;
import _28数据访问对象模式._02数据访问对象接口包.StudentDao;
import _28数据访问对象模式._03实现接口的具体类.StudentDaoImpl;

public class DaoPatternDemo {
    public static void main(String[] args) {
        StudentDao studentDao = new StudentDaoImpl();

        for (Student student :
                studentDao.getAllStudents()) {
            System.out.println("Student: [RollNo : " + student.getRollNo() + ", Name : " + student.getName() + "]");
        }

        //update student
        Student student = studentDao.getAllStudents().get(0);
        student.setName("Michael");
        studentDao.updateStudent(student);

        //get the student
        studentDao.getStudent(0);
        System.out.println("Student: [ RollNo : " + student.getRollNo() +", Name : " + student.getName() + " ]");
    }
}
