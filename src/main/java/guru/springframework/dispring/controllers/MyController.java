package guru.springframework.dispring.controllers;

import guru.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller; // mark class as a spring component

@Controller
public class MyController {

    private GreetingService greetingService;

    @Autowired
    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}

