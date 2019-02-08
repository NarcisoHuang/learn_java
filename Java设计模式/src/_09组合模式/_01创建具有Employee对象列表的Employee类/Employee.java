package _09组合模式._01创建具有Employee对象列表的Employee类;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    private String dept;
    private int salsry;
    private List<Employee> subordinates;

    public Employee(String name, String dept, int salsry) {
        this.name = name;
        this.dept = dept;
        this.salsry = salsry;
        subordinates = new ArrayList<Employee>();
    }

    public void add(Employee e) {
        subordinates.add(e);
    }

    public void remove(Employee e) {
        subordinates.remove(e);
    }

    public List<Employee> getSubordinates() {
        return subordinates;
    }


    @Override
    public String toString() {
        return ("Employee :[ Name: " + name + ", dept : " + dept + ", salary : " + " ]");
    }
}
