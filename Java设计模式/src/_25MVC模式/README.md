MVC模式表示：模型 - 视图 - 控制器模式。
此模式用于分离应用程序的问题。

模型（Model） - 模型表示携带数据的对象或JAVA POJO。
如果其数据改变它也可以具有逻辑来更新控制器。

视图（View） - 视图表示模型包含的数据的可视化层。

控制器（Controller） - 控制器对模型和视图都有起作用。
它控制数据流进入模型对象，并在数据更改时更新视图。
它保持视图和模型分开，也是视图和模型的中间层。

在这个实例中，将创建一个作为模式的Student对象.
StudentView将是一个可以在控制台上打印学生详细信息的视图类，
StudentController是负责在Student对象中存储数据并相应地更新 StudentView 视图的控制器类。
MVCPatternDemo这是一个演示类，将使用StudentController来演示MVC模式的使用。

代码源自网络
https://www.yiibai.com/design_pattern/8891.html#article-start