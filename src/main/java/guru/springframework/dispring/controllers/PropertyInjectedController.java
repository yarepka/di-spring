package guru.springframework.dispring.controllers;

import guru.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * The way you shouldn't do Injection anymore
 * */
@Controller
public class PropertyInjectedController {

    @Autowired
    @Qualifier("propertyGreetingService") /* Field injection is not recommended anymore */
    public GreetingService greetingService;

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
