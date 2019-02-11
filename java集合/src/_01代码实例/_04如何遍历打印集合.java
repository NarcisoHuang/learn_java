package _01代码实例;

import java.util.TreeMap;

public class _04如何遍历打印集合 {
    public static void main(String[] args) {
        System.out.println("Tree Map Example!\n");
        TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
        treeMap.put(1,"Sunday");
        treeMap.put(2,"Monday");
        treeMap.put(3,"Tuesday");
        treeMap.put(4,"Wednesday");
        treeMap.put(5,"Thursday");
        treeMap.put(6,"Friday");
        treeMap.put(7,"Saturday");
        /** treeMap.keySet() 输出集合内所有的元素的key值 */
        System.out.println("Keys of tree map: " + treeMap.keySet());
        /** treeMap.values() 输出集合内所有的元素的value值 */
        System.out.println("Values of tree map: " + treeMap.values());
        /** treeMap.get(int index) 通过key值获取对应的元素的value值 */
        System.out.println("Key: 5 value: " + treeMap.get(5) + "\n");
        /** treeMap.firstKey() 获取Key最小的元素的Key值 treeMap.get(int index) 通过Key值获取元素的value值 */
        System.out.println("First key: " + treeMap.firstKey() + " Value: " + treeMap.get(treeMap.firstKey()));
        /** treeMap.lastKey() 获取Key最大的元素的value值 treeMap.get(int index) 通过Key值获取元素的value值 */
        System.out.println("Last key: " + treeMap.lastKey() + " Value: " + treeMap.get(treeMap.lastKey()));
        /** treeMap.remove(int index) 通过Key值来删除对应的元素 */
        System.out.println("Removing first data: " + treeMap.remove(treeMap.firstKey()));
        /** 显示删除元素后的容器内的剩余的元素的key值 */
        System.out.println("Now the tree map keys: " + treeMap.keySet());
        /** 显示删除元素后的容器内的剩余的元素的Value值 */
        System.out.println("Now the tree map contain: " + treeMap.values() + "\n");
        System.out.println("Removing last data: " + treeMap.remove(treeMap.lastKey()));
        System.out.println("Now the tree map keys: " + treeMap.keySet());
        System.out.println("Now the tree map contain: " + treeMap.values());
    }
}
