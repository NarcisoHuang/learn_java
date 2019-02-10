package _02类型参数命名约定;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TypeParameterNamingConventions {
    public static void main(String[] args) {
        MyBox<Integer, String> myBox = new MyBox<Integer, String>();
        myBox.add(new Integer(199), new String("Hello World!"));
        System.out.printf("Integer Value: %d\n", myBox.getFirst());
        System.out.printf("String Value: %s\n",myBox.getSecond());

//        Pair<Integer, String> pair = new Pair<Integer, String>();
//        pair.addKeyValue(Integer.valueOf(100), new String("My Value"));
//        System.out.println("(Pair)Value :%s\n", pair.getValue(Integer.valueOf(100)));
        Pair<String, Integer> pair = new Pair<String, Integer>();
        pair.addKeyValue("1", Integer.valueOf(100));
        System.out.printf("(pair)Integer value :%d\n", pair.getValue("1"));

        CustomList<MyBox> list = new CustomList<MyBox>();
        list.addItem(myBox);
        System.out.printf("(CustomList)Integer Value :%d\n", list.getItem(0).getFirst());

    }
}

class MyBox<T, S> {
    private T t;
    private S s;

    public void add(T t, S s) {
        this.t = t;
        this.s = s;
    }

    public T getFirst() {
        return t;
    }

    public S getSecond() {
        return s;
    }

}

class Pair<K, V> {
    private Map<K, V> map = new HashMap<K,V>();

    public void addKeyValue(K key, V value) {
        map.put(key, value);
    }

    public V getValue(K key) {
        return map.get(key);
    }
}

class CustomList<E> {
    private List<E> list = new ArrayList<E>();

    public  void addItem(E value) {
        list.add(value);
    }

    public E getItem(int index) {
        return list.get(index);
    }
}
