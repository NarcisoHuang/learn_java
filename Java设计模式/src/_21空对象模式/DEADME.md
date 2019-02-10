在“空对象”模式中，空对象将替换NULL对象实例的检查。
而不是检查一个空值，Null对象反映一个无关的关系(即什么也不做)。
这种Null对象还可以用于在数据不可用时提供默认行为。
在空对象模式（Null Object模式）中创建一个抽象类，指定要执行的各种操作。
扩展此类的具体类和一个null对象类，不提供此类的任何实现，并且无需检查空值。

在这个实例中，将创建一个AbstractCustomer抽象类来定义一些操作。
这里的客户名称和扩展AbstractCustomer类的具体类。
创建工厂类CustomerFactory用来根据传递给它的客户名称返回RealCustomer或NullCustomer对象。
NullPatternDemo这是一个演示类，将使用CustomerFactory演示使用空对象模式（Null Object）模式。

代码源自网络
https://www.yiibai.com/design_pattern/null_object_pattern.html#article-start

