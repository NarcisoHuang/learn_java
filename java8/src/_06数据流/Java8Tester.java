package _06数据流;

import java.util.*;
import java.util.stream.Collectors;

public class Java8Tester {
    public static void main(String[] args) {
        System.out.println("Using Java 7: ");

        List<String> stringList = Arrays.asList("abc","","bc","efg","abcd","","jkl");

        System.out.println("List: " + stringList);

        long count = getEmptyStringUsingJava7(stringList);
        System.out.println("Empty Strings: " + count);

        count = getCountLengthEqual3usingJava7(stringList);
        System.out.println("Filtered List of length 3: " + count);

        List<String> filteredList = deletelEmptyStringUsingJava7(stringList);
        System.out.println("Filtered List: " + filteredList);

        String mergedString = getMergedStringUsingJava7(stringList, " ,");
        System.out.println("Merged List: " + mergedString);

        List<Integer> numbers = Arrays.asList(3,2,2,3,7,3,5);

        List<Integer> squareList = getSquares(numbers);
        System.out.println("Squares List: " + squareList);

        List<Integer> integerList = Arrays.asList(1,2,13,4,15,6,17,8,19);
        System.out.println("List: " + integerList);
        System.out.println("Heighest number in List: " + getMax(integerList));
        System.out.println("Lowest number in List: " + getMin(integerList));
        System.out.println("Sum of all numbers: " + getSum(integerList));
        System.out.println("Average of all numbers: " + getAverage(integerList));
        System.out.println("Random numbers: ");
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            System.out.println(random.nextInt());
        }
        System.out.println("Using Java 8: ");
        System.out.println("List: " + stringList);

        count = stringList.stream().filter(string -> string.isEmpty()).count();
        System.out.println("Empty Strings: " + count);

        count = stringList.stream().filter(string -> string.length() == 3).count();
        System.out.println("Strings of length 3: " + count);

        filteredList = stringList.stream().filter(string -> !string.isEmpty() ).collect(Collectors.toList());
        System.out.println("Filtered List: " + filteredList);

        mergedString = stringList.stream().filter(string -> !string.isEmpty() ).collect(Collectors.joining(", "));
        System.out.println("Merged String: " + mergedString);

        squareList = numbers.stream().map(i -> i*i).collect(Collectors.toList());
        System.out.println("Squared List: " + squareList);

        System.out.println("List: " + integerList);

        IntSummaryStatistics statistics = integerList.stream().mapToInt((x) -> x).summaryStatistics();
        System.out.println("Highest number in List: " + statistics.getMax());
        System.out.println("Lowest number in List: " + statistics.getMin());
        System.out.println("Sum of all numbers: " + statistics.getSum());
        System.out.println("Average of all numbers: " + statistics.getAverage());
        System.out.println("Random Numbers: ");
        random.ints().limit(10).sorted().forEach(System.out::println);

        count = stringList.parallelStream().filter(string -> string.isEmpty() ).count();
        System.out.println("Empty Strings: " + count);
    }

    /**
     * 定义方法
     */

    /**
     * 通过遍历容器来判断容器中有多少个空元素
     * @param stringList 容器对象
     * @return count 空对象的数量
     */
    private static int getEmptyStringUsingJava7(List<String> stringList) {
        int count = 0;
        for (String string :
                stringList) {
            if (string.isEmpty()) {
                count++;
            }
        }
        return count;

    }

    /**
     * 返回容器中长度等于3的元素
     * @param stringList 容器对象
     * @return 元素的数量
     */
    private static int getCountLengthEqual3usingJava7(List<String> stringList) {
        int count = 0;
        for (String string :
                stringList) {
            if (string.length() == 3) {
                count++;
            }
        }
        return count;
    }

    /**
     * 删除空元素的方法就是新建一个容器, 遍历原来的容器内的元素
     * 如果元素为非空, 那么就将元素添加到新的容器中
     * 最终返回新的容器
     * @param stringList 需要删除空元素的容器对象
     * @return fileteredList 不带有空元素的容器对象
     */
    private static List<String> deletelEmptyStringUsingJava7(List<String> stringList) {
        List<String> fileteredList = new ArrayList<String>();
        for (String string :
                stringList) {
            if (!string.isEmpty()) {
                fileteredList.add(string);
            }
        }
        return fileteredList;
    }

    /**
     * 遍历容器内的所有元素, 将非空元素都与传入的一个字符串变量合并
     * 没有弄明白
     * @param stringList 容器
     * @param seperator 合并的字符串
     * @return
     */
    private static String getMergedStringUsingJava7(List<String> stringList, String seperator) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String string :
                stringList) {
            if (!string.isEmpty()) {
                stringBuilder.append(string);
                stringBuilder.append(seperator);
            }
        }
        String mergedString = stringBuilder.toString();
        return mergedString.substring(0, mergedString.length() - 2);
    }

    /**
     * 遍历容器内的所有元素, 计算元素的平方的值
     * 在将所得的值不重复的保存在新的容器里面
     * @param numbers
     * @return
     */
    private static List<Integer> getSquares(List<Integer> numbers) {
        List<Integer> squaresList = new ArrayList<Integer>();

        for (Integer number :
                numbers) {
            Integer square = new Integer(number.intValue() * number.intValue());
            if (!squaresList.contains(square)) {
                squaresList.add(square);
            }
        }
        return squaresList;
    }

    /**
     * 遍历容器内的所有的元素, 得到最大的元素, 返回元素的值
     * @param numbers 容器
     * @return 返回最大的元素的值
     */
    private static int getMax(List<Integer> numbers) {
        int max = numbers.get(0);
        for (Integer num :
                numbers) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    /**
     * 遍历容器内的所有的元素, 得到最小的元素, 返回元素的值
     * @param numbers 容器
     * @return 返回最小元素的值
     */
    private static int getMin(List<Integer> numbers) {
        int min = numbers.get(0);
        for (Integer num :
                numbers) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    /**
     * 遍历容器内的所有的元素, 得到容器所有元素的和, 返回和的值
     * @param numbers 容器
     * @return sum 所有元素的值的和
     */
    private static int getSum(List<Integer> numbers) {
        int sum = 0;
        for (Integer num :
                numbers) {
            sum += num;
        }
        return sum;
    }

    /**
     * 调用getSum(List<Integer> numbers)方法得到容器内所有元素的值的总和
     * 通过调用numbers.size()方法来获取容器内元素的数量
     * 元素的值的总和 / 元素的数量 -> 容器内
     * @param numbers
     * @return
     */
    private static int getAverage(List<Integer> numbers) {
        return getSum(numbers) / numbers.size();
    }



}
