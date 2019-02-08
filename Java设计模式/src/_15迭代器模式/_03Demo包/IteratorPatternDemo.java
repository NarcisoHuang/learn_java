package _15迭代器模式._03Demo包;

import _15迭代器模式._01接口包.Iterator;
import _15迭代器模式._02实现Container接口的具体类.NameRepository;

public class IteratorPatternDemo {
    public static void main(String[] args) {
        NameRepository namesRepository = new NameRepository();

        for(Iterator iter = namesRepository.getIterator(); iter.hasNext();){
            String name = (String)iter.next();
            System.out.println("Name : " + name);
        }
    }
}
