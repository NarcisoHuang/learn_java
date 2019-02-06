package _03单例模式;

/**
 * 从单例类中获取唯一的对象。
 */
public class SingletonPatternDemo {
    public static void main(String[] args) {

        // 创建一个单例对象
        SingleObject object = SingleObject.getInstance();

        // 调用单例对象显示语句
        object.showMessage();
    }
}
