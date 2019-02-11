package _01代码实例;

import java.util.Enumeration;
import java.util.Hashtable;

public class _13如何从Hashtable设置Keys的视图 {
    public static void main(String[] args) {
        Hashtable<Integer, String> hashtable = new Hashtable<Integer, String>();
        hashtable.put(1, "one");
        hashtable.put(2, "two");
        hashtable.put(3, "three");
        hashtable.put(4, "four");
        hashtable.put(5, "five");
        Enumeration e = hashtable.keys();

        while (e.hasMoreElements()) {
            System.out.print(e.nextElement() + " ");
        }

    }
}
