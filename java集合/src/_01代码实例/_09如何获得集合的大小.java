package _01代码实例;

import java.util.HashSet;
import java.util.Iterator;

public class _09如何获得集合的大小 {
    public static void main(String[] args) {
        System.out.println("Collection Example!\n");
        int size = 0;
        HashSet<String> collection = new HashSet<String>();

        Iterator iterator;
        collection.add("str1");
        collection.add("str2");
        collection.add("str3");
        collection.add("str4");
        collection.add("100");
        collection.add("200");
        System.out.println("Collection data: ");
        iterator = collection.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        System.out.println();
        /**
         * 通过容器对象.size()方法获得容器元素数量
         */
        size = collection.size();

        if (collection.isEmpty()) {
            System.out.println("Collection is empty");
        } else {
            System.out.println("Collection size: " + size);
        }
        System.out.println();
    }
}
