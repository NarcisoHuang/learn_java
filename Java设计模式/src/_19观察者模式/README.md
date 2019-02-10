观察者模式在对象之间存在一对多关系时使用.
例如，如果一个对象被修改，它的依赖对象将被自动通知.
观察者模式属于行为模式类别.

观察者模式使用三个操作类 -- Subject, Observer 和 Client。
Subject是具有将观察者附加和分离到Client对象的方法的对象。
创建了一个抽象类Observer和一个具体类Subject，它们都是扩展了 Observer 类。

ObserverPatternDemo这是一个演示类，将使用 Subject 和具体类对象在操作中显示观察者模式。

代码源自网络
https://www.yiibai.com/design_pattern/observer_pattern.html#article-start