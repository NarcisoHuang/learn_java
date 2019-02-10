当我们想要使用JNDI查找来定位各种服务时，使用服务定位器设计模式。
考虑到为服务查找JNDI的高成本，所以在服务定位器模式使用缓存技术。
首次需要服务时，服务定位器在JNDI中查找并缓存服务对象。
通过服务定位器进一步查找或相同的服务在其缓存中完成，这在很大程度上提高了应用的性能。
以下是这种类型的设计模式的实体。

服务 - 将处理请求的实际服务。 将在JNDI服务器中查找此类服务的引用。
上下文/初始上下文 - JNDI上下文携带对用于查找目的的服务的引用。
服务定位器 - 服务定位器是通过JNDI查找缓存服务获得服务的单一联系点。
缓存 - 用于存储服务的引用以重用它们的缓存。
客户端 - 客户端是通过ServiceLocator调用服务的对象。

在这个实现的实例中，将创建一个ServiceLocator，InitialContext，Cache，Service作为表示实体的各种对象。
Service1和Service2用来表示具体服务。
ServiceLocatorPatternDemo是一个演示类，在这里充当客户端，将使用ServiceLocator演示服务定位器设计模式。

代码源自网络
https://www.yiibai.com/design_pattern/service_locator_pattern.html#article-start
