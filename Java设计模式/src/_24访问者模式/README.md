在访问者模式中，使用访问者类来改变元素类的执行算法。
通过这种方式，元素的执行算法可以随访问者变化而变化。
此模式属于行为模式类别。
根据每个模式，元素对象必须接受访问者对象，以便访问者对象处理对元素对象的操作。

在这个实现的示例中，将创建一个叫作ComputerPart的接口，并定义接受操作。
Keyboard, Mouse, Monitor 和 Computer 是实现ComputerPart接口的具体类。
还将定义另一个接口ComputerPartVisitor，它将定义一个访问类操作。
Computer 使用具体的访客做相应的动作。VisitorPatternDem这是一个演示类，
将使用Computer和ComputerPartVisitor类来演示访问者模式的使用。

代码来自网络
https://www.yiibai.com/design_pattern/visitor_pattern.html