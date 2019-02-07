package _05原型模式._04创建测试类;

import _05原型模式._01实现Clonable接口的抽象类.Shape;
import _05原型模式._03创建类来获取_02中的具体的类_并保存在Hashtable缓存中.ShapeCache;

/**
 * 测试类
 */
public class PrototypePatternDemo {
    public static void main(String[] args) {

        //手工倒入缓存
        ShapeCache.loadCache();

        //从缓存容器中克隆对象
        Shape cloneShape1 = (Shape) ShapeCache.getShape("1");
        System.out.println("Shape: " + cloneShape1.getType());
        Shape cloneShape2 = (Shape)ShapeCache.getShape("2");
        System.out.println("Shape: " + cloneShape2.getType());
        Shape cloneShape3 = (Shape)ShapeCache.getShape("3");
        System.out.println("Shape: " + cloneShape3.getType());

    }
}
