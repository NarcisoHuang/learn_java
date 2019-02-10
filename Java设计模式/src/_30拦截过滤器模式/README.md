当我们想要对应用程序的请求或响应进行一些预处理/后处理时，使用截取过滤器设计模式。
在将请求传递到实际目标应用程序之前，在请求上定义和应用过滤器。
过滤器可以进行请求的认证/授权/日志记录或跟踪，然后将请求传递给相应的处理程序。
以下是这种类型的设计模式的实体。

过滤器 - 在请求处理程序执行请求之前或之后执行某些任务的过滤器。
过滤器链 - 过滤器链携带多个过滤器，并帮助在目标上以定义的顺序执行它们。
目标 - 目标对象是请求处理程序。
过滤器管理器 - 过滤器管理器管理过滤器和过滤器链。
客户端 - 客户端是向目标（Target）对象发送请求的对象。

在这个实现示例中，将创建一个FilterChain，FilterManager，Target，Client作为表示实体的各种对象。
AuthenticationFilter和DebugFilter表示具体的过滤器。
InterceptingFilterDemo是一个演示类，将使用客户端来演示拦截过滤器设计模式。

代码源自网络
https://www.yiibai.com/design_pattern/intercepting_filter_pattern.html#article-start
