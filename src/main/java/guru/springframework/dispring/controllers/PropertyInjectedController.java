package guru.springframework.dispring.controllers;

import guru.springframework.dispring.services.GreetingServiceImpl;

/**
 * The way you shouldn't do Injection
 * */
public class PropertyInjectedController {

    public GreetingServiceImpl greetingService;

    String sayHello() {
        return greetingService.sayGreeting();
    }
}
