package _01代码实例;

import java.util.*;

public class _05如何使一个集合只读 {
    public static void main(String [] args) {
        /**
         * stuff
         */
        List stuff = Arrays.asList(new String[] {"a", "b"});
        List list = new ArrayList(stuff);
        /** 通过Collections对象的unmodifiableList(list)方法返回一个
         * 类型和list一样的不可更改元素的对象
         */
        list = Collections.unmodifiableList(list);
        try {
            list.set(0, "new value");
        } catch (UnsupportedOperationException e) {
        }
        Set set = new HashSet(stuff);
        set = Collections.unmodifiableSet(set);
        Map map = new HashMap();
        map = Collections.unmodifiableMap(map);
        System.out.println("Collection is read-only new.");

        // list.set(1, "second Value"); 会报错

    }
}
