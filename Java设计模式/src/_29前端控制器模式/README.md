前端控制器设计模式用于提供集中式请求处理机制，以便所有请求将由单个处理程序处理。
此处理程序可以执行请求的身份验证/授权/记录或跟踪，然后将请求传递到相应的处理程序。
以下是这种类型的设计模式的实体。

前端控制器 - 用于处理应用程序（基于Web或基于桌面）的各种请求的单个处理程序。
分发器 - 前端控制器可以使用可以将请求分派到相应的特定处理器的分派器对象。
视图 - 视图是进行请求的对象。

在这个实现实例中，将创建一个FrontController和Dispatcher作为前台控制器和相应的调度程序。
HomeView和StudentView代表各种视图，请求可以到前端的控制器中。
FrontControllerPatternDemo这是一个演示类，将使用FrontController来演示前控制器设计模式。

代码源自网络
https://www.yiibai.com/design_pattern/front_controller_pattern.html#article-start
