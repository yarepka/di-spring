# Dependency Injection using Spring Framework.

So.. we basically trying to get the beans from Application Context in DiSpringApplication class, so we can run the sayHello() method of each bean. 

Each of this classes represents the way of Dependency Injection:

- <b>Constructor Dependency Injection</b>
- <b>Setter(or method) Dependency Injection</b>
- <b>Property Dependency Injection (not recommended anymore)</b>

We can mark class as a bean using one of this annotations: 
- <b>@Controller</b>
- <b>@Service </b>
- <b>@Repository</b>
- <b>@Component</b>
- <b>@Bean</b>(for the method which return an instance which will be registered as a bean within a BeanFactory) in class marked as <b>@Configuration</b>

<b>@Autowire</b> is used to wire the bean(usually the interface implementation) with the filed inside of the another bean(marked with one of the annotations which i mentioned above).
You don't need to use <b>@Autowire</b> annotation for the Constructor DI, it do autowiring automatic since around 4.2, but it's a good habit to use it.

What's happening is that Spring comes up. It looks at our annotated classes and determining the dependencies and wiring things together. It's creating beans, objects for us, then we run the program and asking the Spring Context to give us fully configured bean(s), so we can run sayHello() method on it and get that output to the console.    

