package _01工厂设计模式;

/**
 * 工厂设计模式中的测试类
 * 生成ShapeFactory对象, 通过传入参数, 来确定要生成的类的形状.
 */
public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        // 通过传入参数来确定对象的形状, 创建需要的形状的对象
        Shape circle = shapeFactory.getShape("CIRCLE");
        // 调用显示特定形状的方法
        circle.draw();
    }
}
