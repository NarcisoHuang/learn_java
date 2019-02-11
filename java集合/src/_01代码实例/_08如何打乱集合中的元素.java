package _01代码实例;

import java.util.ArrayList;
import java.util.Collections;

public class _08如何打乱集合中的元素 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("D");
        arrayList.add("E");
        arrayList.add("F");
        /**
         * 通过Collections.shuffle(e) 方法将容器内的元素顺序打乱
         */
        Collections.shuffle(arrayList);
        System.out.println(arrayList);
    }
}
