package _08过滤器模式_或条件模式._04Demo类;

import _08过滤器模式_或条件模式._01创建应用标准的类.Person;
import _08过滤器模式_或条件模式._02创建Criteria接口.Criteria;
import _08过滤器模式_或条件模式._03创建实现Criteria接口的具体类.*;

import java.util.ArrayList;
import java.util.List;

public class CriteriaPatternDemo {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<Person>();

        personList.add(new Person("Robert", "Male","Single"));
        personList.add(new Person("John", "Male","Married"));
        personList.add(new Person("Laura", "Female","Married"));
        personList.add(new Person("Diana", "Female","Single"));
        personList.add(new Person("Mike", "Male","Single"));
        personList.add(new Person("Bobby", "Male","Single"));

        Criteria male = new CriteriaMale();
        Criteria female = new CriteriaFemale();
        Criteria single = new CriteriaSingle();
        Criteria singleMale = new AndCriteria(single, male);
        Criteria singleOrFemale = new OrCriteria(single, female);

        System.out.println("Males: ");
        printPersons(male.meetCriteria(personList));
        System.out.println("\nFemales: ");
        printPersons(female.meetCriteria(personList));
        System.out.println("\nSingle Males: ");
        printPersons(singleMale.meetCriteria(personList));
    }

    public static void printPersons(List<Person> personList) {
        for (Person person :
                personList) {
            System.out.println("Person: [ name: " + person.getName() + ", Marital Status: " + person.getMaritalStatus() + " ]");
        }
    }
}
