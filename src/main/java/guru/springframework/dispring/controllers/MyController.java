package guru.springframework.dispring.controllers;

import guru.springframework.dispring.services.GreetingService;
import org.springframework.stereotype.Controller; // mark class as a spring component

@Controller
public class MyController {

    private GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}

