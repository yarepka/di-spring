# Dependency Injection using Spring Framework and @Primary annotation

If there is more than one bean of the same type(and no @Qualifier), the bean with the <b>@Primary</b> annotation will be injected.

<b>DI with @Primary has higher priority than DI with property name which is matches the bean name</b>

