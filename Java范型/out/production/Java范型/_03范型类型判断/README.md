类型推断表示Java编译器查看方法调用及其对应的声明，以检查和确定类型参数。 推断算法检查参数的类型，如果可用，则返回分配的类型。 推断算法尝试找到一个可以填满所有类型参数的特定类型。

编译器会生成未经检查的转换警告，而不使用内部类型推断。

**语法**

```java
Box<Integer> integerBox = new Box<>();
```

在上面语法中，

- *Box* − `Box`是一个泛型类。
- `<>` − 尖括号运算符表示类型推断。