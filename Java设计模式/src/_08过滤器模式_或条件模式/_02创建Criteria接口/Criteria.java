package _08过滤器模式_或条件模式._02创建Criteria接口;

import _08过滤器模式_或条件模式._01创建应用标准的类.Person;

import java.util.List;

public interface Criteria {
    public List<Person> meetCriteria(List<Person> persons);
}
