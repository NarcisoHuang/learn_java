package _01代码实例;

import java.util.Enumeration;
import java.util.Hashtable;

public class _12使用枚举显示HashTable的内容 {
    public static void main(String[] args) {
        Hashtable<Integer, String> hashtable = new Hashtable<Integer, String>();
        hashtable.put(1, "one");
        hashtable.put(2, "two");
        hashtable.put(3, "three");
        hashtable.put(4, "four");
        hashtable.put(5, "five");
        Enumeration e = hashtable.elements();

        while (e.hasMoreElements()) {
            System.out.print(e.nextElement() + " ");
        }
    }
}
