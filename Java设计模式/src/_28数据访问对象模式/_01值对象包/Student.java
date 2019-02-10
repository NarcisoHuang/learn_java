package _28数据访问对象模式._01值对象包;

public class Student {
    private String name;
    private int rollNo;

    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    //set
    public void setName(String name) {
        this.name = name;
    }
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }


    //get
    public String getName() {
        return name;
    }
    public int getRollNo() {
        return rollNo;
    }


}
