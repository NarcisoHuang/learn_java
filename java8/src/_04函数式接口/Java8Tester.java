package _04函数式接口;

import java.util.List;
import java.util.Arrays;
import java.util.function.Predicate;

public class Java8Tester {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);

        /**
         * Predicate<Integer> predicate = n -> true
         * n is passed as parameter to the test method of Predicate interface
         * test method will always return true no matter what value n has.
         */
        System.out.println("\n\nPrint all numbers: ");
        eval(list, n->true);
        /**
         * Predicate<Integer> predicate = n -> n%2 == 0
         * n is passed as parameter to test method of Predicate interface
         * test method will return true if n%2 comes to be zero.
         */
        System.out.println("Print even numbers: ");
        eval(list, n -> n%2 ==0);

        /**
         * Predicate<Integer> predicate = n -> n > 3
         * n is passed as parameter to test method of Predicate interface
         * test method will return true if n is greater than 3.
         */
        System.out.println("Print numbers greater than 3: ");
        eval(list, n-> n > 3);
    }

    public static void eval(List<Integer> list, Predicate<Integer> predicate) {
        for (Integer integer :
                list) {
            if (predicate.test(integer)) {
                System.out.print(integer + " ");
            }
        }
    }
}
