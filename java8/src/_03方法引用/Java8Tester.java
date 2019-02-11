package _03方法引用;

import java.util.ArrayList;
import java.util.List;

public class Java8Tester {
    public static void main(String[] args) {

        List names = new ArrayList();
        names.add("Mah");
        names.add("Sur");
        names.add("Ram");
        names.add("Nar");
        names.add("Kal");

        names.forEach(System.out::println);
    }
}
