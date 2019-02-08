package _08过滤器模式_或条件模式._03创建实现Criteria接口的具体类;

import _08过滤器模式_或条件模式._01创建应用标准的类.Person;
import _08过滤器模式_或条件模式._02创建Criteria接口.Criteria;

import java.util.ArrayList;
import java.util.List;

public class CriteriaFemale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> femalePersons = new ArrayList<Person>();

        for (Person person :
                persons) {
            if (person.getGender().equalsIgnoreCase("FEMALE")) {
                femalePersons.add(person);
            }
        }
        return femalePersons;
    }
}
