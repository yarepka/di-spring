# Dependency Injection using Spring Framework and @Qualified annotation.

In our case, using only @Autowired will cause the problem.

Required a single bean, but 3 were found:
- constructorGreetingService
- propertyGreetingService
- setterGreetingService

Use @Qualified to specify which implementation you want to be injected in the bean.

@Qualifier helps to mark which dependency you want to be injected when there are more than one can be injected.

Also, if you use the name of the bean as the name of the property, it will be found. It can be used instead of @Qualifier in some situations, but it's probably better to use @Qualifier.

Example:

<code>
    @Controller
  
    public class PropertyInjectedController {
        @Autowired
        public GreetingService propertyGreetingService;
        
        public String sayHello() {
            return greetingServiceImpl.sayGreeting();
        }
    }
</code>