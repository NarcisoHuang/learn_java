数据访问对象模式或DAO模式用于将低级数据访问API或操作与高级业务服务分离。
以下是数据访问对象模式的参与者。

数据访问对象接口 - 此接口定义要对模型对象执行的标准操作。

数据访问对象具体类 - 此类实现上述接口。
这个类负责从数据源获取数据，数据源可以是数据库/xml或任何其他存储机制。

模型对象或值对象 - 此对象是简单的POJO，包含用于存储使用DAO类检索的数据的get/set方法。

在这个将创建一个作为Model或Value对象的Student对象。
StudentDao是数据访问对象接口。
StudentDaoImpl是实现数据访问对象接口的具体类。
DaoPatternDemo这是一个演示类，将使用StudentDao演示使用数据访问对象模式。

代码源自网络
https://www.yiibai.com/design_pattern/data_access_object_pattern.html#article-start
