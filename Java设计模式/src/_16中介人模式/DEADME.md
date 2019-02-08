中介者模式(Mediator Pattern）用于减少多个对象或类之间的通信复杂性。
此模式提供了一个中介类，它通常处理不同类之间的所有通信，并支持通过松散耦合来维护代码。
中介者模式属于行为模式类别。

在这里通过一个聊天室的示例来演示中介者模式的使用，在聊天室中，多个用户可以向聊天室发送消息，并且聊天室的责任是向所有用户显示消息。
在示例中创建了两个类ChatRoom和User。
用户对象将使用ChatRoom方法来共享他们的消息。

MediatorPatternDemo这是一个演示类，它使用User对象来显示它们之间的通信。
中介者模式(Mediator Pattern）示例的结构如下图所示

代码源自网络
https://www.yiibai.com/design_pattern/mediator_pattern.html
