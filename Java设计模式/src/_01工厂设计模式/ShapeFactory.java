package _01工厂设计模式;

/**
 * 形状工厂的类
 * 通过传入的参数来新建一个对应形状的类
 * shapeType.equalsIgnoreCase("CIRCLE"), 如果传入的参数忽略大小写符合"CIRCLE",
 * 那么式子返回True, 否则返回False. 在该else if() 判断语句中, 如果为True. 那么就创建一个Circle对象
 * 其他的语句也是同理
 */
public class ShapeFactory {
    public Shape getShape(String shapeType){
        if (shapeType == null){
            return null;
        } else if (shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        //如果都不是, 返回null
        return null;
    }
}
