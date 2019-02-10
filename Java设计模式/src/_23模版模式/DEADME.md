在模板模式中，抽象类公开了定义的方法/模板来执行它的方法。
它的子类可以根据需要重写方法实现，但调用的方式与抽象类定义的方式相同。
此模式属于行为模式类别。

在这个实现实例中，将创建一个Game抽象类，它定义了一个模板方法设置为final的操作，因此它不能被覆盖。
Cricket 和 Football 是扩展Game并覆盖它的方法的具体类。
TemplatePatternDemo是一个演示类，将使用Game演示使用模板模式。

代码源自网络
https://www.yiibai.com/design_pattern/template_pattern.html
