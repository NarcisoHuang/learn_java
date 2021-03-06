桥接模式将定义与其实现分离。 它是一种结构模式。
桥接（Bridge）模式涉及充当桥接的接口。桥接使得具体类与接口实现者类无关。
这两种类型的类可以改变但不会影响对方。
当需要将抽象与其实现去耦合时使用桥接解耦（分离），使得两者可以独立地变化。
这种类型的设计模式属于结构模式，
因为此模式通过在它们之间提供桥接结构来将实现类和抽象类解耦（分离）。
这种模式涉及一个接口，作为一个桥梁，使得具体类的功能独立于接口实现类。
两种类型的类可以在结构上改变而不彼此影响。
通过以下示例展示了桥接（Bridge）模式的使用，实现使用相同的抽象类方法但不同的网桥实现器类来绘制不同颜色的圆形。

代码源自网络
https://www.yiibai.com/design_pattern/bridge_pattern.html