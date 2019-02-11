package _01代码实例;

import java.util.*;

public class _07如何反转集合 {
    public static void main(String[] args) {
        String[] coins = {"A", "B", "C", "D", "E"};
        List<String> list = new ArrayList<String>();
        for (int i = 0; i < coins.length; i++) {
            list.add(coins[i]);
        }
        Iterator<String> listIterator =  list.iterator();
        System.out.println("Before reversal");
        while (listIterator.hasNext()) {
            System.out.print(listIterator.next() + " ");
        }
        /**
         * 通过Collections.reverse(e) 方法实现容器内元素翻转
         */
        Collections.reverse(list);
        listIterator = list.iterator();
        System.out.println("\nAfter reversal");
        while (listIterator.hasNext()) {
            System.out.print(listIterator.next() + " ");
        }
    }
}
