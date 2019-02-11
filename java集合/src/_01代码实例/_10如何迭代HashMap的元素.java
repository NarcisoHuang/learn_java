package _01代码实例;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class _10如何迭代HashMap的元素 {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("1", "one");
        hashMap.put("2", "two");
        hashMap.put("3", "third");
        hashMap.put("4", "four");
        /** 通过hashMap.keySet()方法可以迭代出容器中所有元素的Key值, 即: 1, 2, 3, 4 */
        Collection collection = hashMap.keySet();
        /** 通过hashMap.value()方法可以迭代出容器中所有元素的value值, 即: one, two third, four */
        Collection collection1 = hashMap.values();
        Iterator iterator = collection.iterator();
        Iterator iterator1 = collection1.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next()+" ");
        }
        System.out.println();
        while (iterator1.hasNext()) {
            System.out.print(iterator1.next() + " ");
        }
    }
}
