package _01代码实例;

import java.util.ArrayList;
import java.util.List;

public class _03如何将集合转为数组 {
    public static void main(String[] args) {
        /** 1. 创建容器对象*/
        List<String> stringList = new ArrayList<String>();
        /** 2. 给容器对象添加元素 */
        stringList.add("This ");
        stringList.add("is ");
        stringList.add("a ");
        stringList.add("IT ");
        stringList.add("tutorials ");
        stringList.add("website.");
        /** 3. 将collection对象转换成数组对象*/
        /**
         * 如果指定的数组能容纳该 collection，则返回包含此 collection 元素的数组。
         * 否则，将根据指定数组的运行时类型和此 collection 的大小分配一个新数组。
         * 这里给的参数的数组长度是0，因此就会返回包含此 collection 中所有元素的数组，
         * 并且返回数组的类型与指定数组的运行时类型相同。
         */
        // String[] strings = stringList.toArray(new String[stringList.size()]);
        String[] strings = stringList.toArray(new String[0]);

        /** 4. 遍历输出数组 */
        for (int i = 0; i < strings.length; ++i) {
            String contents = strings[i];
            System.out.print(contents);
        }
    }
}
