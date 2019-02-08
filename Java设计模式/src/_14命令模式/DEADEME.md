命令模式是数据驱动设计模式，属于行为模式类别。
请求作为命令包装在一个对象下，并传递给调用器对象。
调用者对象查找可以处理此命令的适当对象，并将命令传递到执行命令的相应对象。

在这个示例中，创建了一个作为命令的接口- Order，同时也创建了一个Stock类作为请求。
有具体的命令类BuyStock和SellStock实现Order接口将做实际的命令处理。
将创建一个类Broker作为调用器对象。
它可以接收和下订单。
Broker对象使用命令模式来标识哪个对象，并根据命令类型执行哪个命令。
CommandPatternDemo这是一个演示入口类，将使用Broker类演示命令模式。

代码源自网络
https://www.yiibai.com/design_pattern/command_pattern.html