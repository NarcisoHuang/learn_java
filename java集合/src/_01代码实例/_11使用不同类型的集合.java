package _01代码实例;

import java.util.*;

public class _11使用不同类型的集合 {
    public static void main(String[] args) {
        List linkedList = new LinkedList();
        linkedList.add("element1");
        linkedList.add("element2");
        linkedList.add("element3");
        linkedList.add("element4");
        displayAll(linkedList);

        List arrayList = new ArrayList();
        arrayList.add("x");
        arrayList.add("y");
        arrayList.add("z");
        arrayList.add("w");
        displayAll(arrayList);

        Set hashSet = new HashSet();
        hashSet.add("set1");
        hashSet.add("set2");
        hashSet.add("set3");
        hashSet.add("set4");
        displayAll(hashSet);

        SortedSet treeSet = new TreeSet();
        treeSet.add("1");
        treeSet.add("2");
        treeSet.add("3");
        treeSet.add("4");
        displayAll(treeSet);

        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add("one");
        linkedHashSet.add("two");
        linkedHashSet.add("three");
        linkedHashSet.add("four");
        displayAll(linkedHashSet);

        Map map = new HashMap();
        map.put("key1", "J");
        map.put("key2", "K");
        map.put("key3", "L");
        map.put("key4", "M");
        displayAll(map.keySet());
        displayAll(map.values());

        SortedMap sortedMap = new TreeMap();
        sortedMap.put("key1", "JJ");
        sortedMap.put("key2", "KK");
        sortedMap.put("key3", "LL");
        sortedMap.put("key4", "MM");
        displayAll(sortedMap.keySet());
        displayAll(sortedMap.values());

        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("key1", "JJJ");
        linkedHashMap.put("key2", "KKK");
        linkedHashMap.put("key3", "LLL");
        linkedHashMap.put("key4", "MMM");
        displayAll(linkedHashMap.keySet());
        displayAll(linkedHashMap.values());

    }

    static void displayAll(Collection collection) {
        /**
         * List和Set都继承了Collection接口, 可以通过collection的方法来遍历容器内的元素
         * Map没有继承collection接口, Map提供Key到Value的映射
         */
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }
}
