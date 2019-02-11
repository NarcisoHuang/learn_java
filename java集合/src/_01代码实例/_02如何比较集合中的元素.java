package _01代码实例;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

/**
 * 通过Collection类中的Collection.min()和Collection.max()方法将字符串转换成树形集合
 * 从而来计较集合中的元素
 */
public class _02如何比较集合中的元素 {
    public static void main(String[] args) {
        String[] conis = {"Penny", "nickel", "dime", "Quarter", "dollar"};
        Set set = new TreeSet();

        for (int i = 0; i < conis.length; i++) {
            set.add(conis[i]);
        }
        System.out.println(Collections.min(set));
        System.out.println(Collections.min(set, String.CASE_INSENSITIVE_ORDER));

        for (int i = 0; i <= 10; i++) {
            System.out.print('-');
        }

        System.out.println();
        System.out.println(Collections.max(set));
        System.out.println(Collections.max(set, String.CASE_INSENSITIVE_ORDER));

    }
}
