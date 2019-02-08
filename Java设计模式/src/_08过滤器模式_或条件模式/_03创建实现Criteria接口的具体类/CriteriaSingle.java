package _08过滤器模式_或条件模式._03创建实现Criteria接口的具体类;

import _08过滤器模式_或条件模式._01创建应用标准的类.Person;
import _08过滤器模式_或条件模式._02创建Criteria接口.Criteria;

import java.util.ArrayList;
import java.util.List;

public class CriteriaSingle implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> singlePersons = new ArrayList<Person>();

        for (Person person :
                persons) {
            if (person.getMaritalStatus().equalsIgnoreCase("SINGLE")) {
                singlePersons.add(person);
            }
        }

        return singlePersons;
    }
}
