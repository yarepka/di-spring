package guru.springframework.dispring.controllers;

import guru.springframework.dispring.services.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * The way you shouldn't do Injection anymore
 * */
@Controller
public class PropertyInjectedController {

    @Autowired /* Field injection is not recommended anymore */
    public GreetingServiceImpl greetingService;

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
