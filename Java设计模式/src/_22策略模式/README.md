在策略模式中，可以在运行时更改类行为或其算法。
这种类型的设计模式属于行为模式。
在策略模式中，创建表示各种策略对象和其行为根据其策略对象而变化的上下文对象。
策略对象更改上下文对象的执行算法。

在这个示例中，将创建一个 Strategy 接口，定义实现策略接口的操作和具体策略类。
上下文类- Context 是使用策略的类。
StrategyPatternDemo是一个演示类，将使用上下文- Context 和策略对象来演示上下文行为基于其部署或使用的策略的变化。

代码源自网络
https://www.yiibai.com/design_pattern/strategy_pattern.html
