在状态模式中，类行为根据其状态而改变。 这种设计模式属于行为模式。
在状态模式中，我们创建表示各种状态的对象，以及随状态对象变化而行为变化的上下文对象。

我们将创建一个State接口来定义一个动作并实现State接口的具体状态类。
Context是一个载有一个状态的类。
演示类StatePatternDemo将使用Context和状态对象来演示上下文行为基于它所处的状态类型的变化。

代码源自网络
https://www.yiibai.com/design_pattern/state_pattern.html#article-start
