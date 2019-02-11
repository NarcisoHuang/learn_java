package _01代码实例;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class _06如何从集合中删除指定的元素 {
    public static void main(String[] args) {
        System.out.println("Collection Example!\n");
        int size;
        HashSet<String> collection = new HashSet<String>();
        String string1 = "Yellow", string2 = "White", string3 = "Green", string4 = "Blue";
        Iterator iterator = collection.iterator();
        collection.add(string1);
        collection.add(string2);
        collection.add(string3);
        collection.add(string4);
        System.out.println("Collection data: ");

        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " ");
        }

        System.out.println();
        collection.remove(string2);
        System.out.println("After removing [ " + string2 + " ]\n");
        System.out.println("Now collection data: ");
        /** 这一步是必须的, 在collection更新之后, iterator必须重新赋值 */
        iterator = collection.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        System.out.println();
        size = collection.size();
        System.out.println("Collection size: " + size + "\n");

    }
}
