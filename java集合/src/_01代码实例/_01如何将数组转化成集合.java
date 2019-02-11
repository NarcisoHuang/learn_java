package _01代码实例;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class _01如何将数组转化成集合 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("How many elements you want to add to the array: ");

        /**
         * 输入要输入的元素的数量
         */
        int n = Integer.parseInt(in.readLine());
        String[] name = new String[n];

        System.out.println("Enter your elements: ");
        for (int i = 0; i < n; i++) {
            /**
             * 将键盘输入的值保存到数组中, 注意readLine()方法得到的是String类型的值
             */
            name[i] = in.readLine();
        }
        /**
         * 创建容器, 将数组转换成List容器
         */
        List<String> stringList = Arrays.asList(name);

        System.out.println();  // 输出空行

        /**
         * 遍历容器输出容器的每一个元素
         */
        for (String string :
                stringList) {
            String str = string;
            System.out.print(str + " ");
        }

    }

}
