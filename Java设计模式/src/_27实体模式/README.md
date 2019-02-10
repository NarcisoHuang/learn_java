组合实体模式用于EJB持久化机制。
组合实体是表示对象图的EJB实体bean。
当组合实体更新时，内部依赖对象bean将自动更新为由EJB实体bean管理。
以下是组合实体Bean的参与者。

组合实体 - 它是主要的实体bean。
它可以是粗粒度的或可以包含用于持久性目的的粗粒度对象。

粗粒对象 - 此对象包含依赖对象。
它有自己的生命周期，并且管理依赖对象的生命周期。

依赖对象 - 依赖对象是一个对象，这取决于它的持久性生命周期粗粒对象。
策略 - 策略表示如何实现复组合实体。

在这个实现的示例中，将创建CompositeEntity对象作为CompositeEntity。
CoarseGrainedObject是一个包含依赖对象的类。
CompositeEntityPatternDemo是一个演示类，它使用Client类来演示使用组合实体模式。

代码源自网络
https://www.yiibai.com/design_pattern/composite_entity_pattern.html#article-start