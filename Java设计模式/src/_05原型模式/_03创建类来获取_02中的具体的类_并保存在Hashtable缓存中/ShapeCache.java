package _05原型模式._03创建类来获取_02中的具体的类_并保存在Hashtable缓存中;

import _05原型模式._01实现Clonable接口的抽象类.Shape;
import _05原型模式._02创建_1内的抽象类的具体实现类.Circle;
import _05原型模式._02创建_1内的抽象类的具体实现类.Rectangle;
import _05原型模式._02创建_1内的抽象类的具体实现类.Square;

import java.util.Hashtable;

public class ShapeCache {

    /**
     * 创建Hashtable容器对象shapeMap. K为形状类的对象的id值, V为形状对象
     */
    private static Hashtable<String, Shape> shapeMap = new Hashtable<String, Shape>();

    /**
     * 通过shapeID在存储容器shapeMap中克隆一个对应的对象
     * @param shapeId
     * @return cachedShape.clone() 克隆的对象
     */
    public static Shape getShape(String shapeId) {
        Shape cachedShape = shapeMap.get(shapeId);
        return (Shape)cachedShape.clone();
    }

    /**
     * 手动添加三种类的对象到创建的缓存容器shapeMap中
     * 静态方法, 不用创建对象, 直接就可以调用.
     */
    public static void loadCache() {
        //添加Circle对象到缓存容器中
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(), circle);

        // 添加Square对象到缓存容器中
        Square square = new Square();
        square.setId("2");
        shapeMap.put(square.getId(), square);

        //添加Rectangle对象到缓存容器中
        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(), rectangle);
    }
}
