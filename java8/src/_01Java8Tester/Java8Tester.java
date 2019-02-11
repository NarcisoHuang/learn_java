package _01Java8Tester;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Java8Tester {
    public static void main(String[] args) {
        List<String> name1 = new ArrayList<String>();
        name1.add("Mahesh ");
        name1.add("Suresh ");
        name1.add("Ramesh ");

        List<String> name2 = new ArrayList<String>();
        name2.add("Mahesh ");
        name2.add("Suresh ");
        name2.add("Ramesh ");

        Java8Tester tester = new Java8Tester();

        System.out.println("Sort using Java 7 syntax: ");
        tester.sortUsingJava7(name1);
        System.out.println(name1);

        System.out.println("Sort using Java 8 syntax: ");
        tester.sortUsingJava8(name2);
        System.out.println(name2);

    }

    private void sortUsingJava7(List<String> names) {
        // sort using java 7
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
    }

    private void sortUsingJava8(List<String> names) {
        // sort using java 8
        // 使用Lambda表达式
        Collections.sort(names, (s1, s2) -> s1.compareTo(s2));
    }

}
