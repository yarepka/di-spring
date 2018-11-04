package guru.springframework.dispring.controllers;

import guru.services.ConstructorGreetingService;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConstructorInjectedControllerTest {

    private ConstructorInjectedController constructorInjectedController;

    @Before
    public void setUp() throws Exception {
        constructorInjectedController = new ConstructorInjectedController(new ConstructorGreetingService());
    }

    @Test
    public void testGreeting() {
        assertEquals(ConstructorGreetingService.GREETING_MSG, constructorInjectedController.sayHello());
    }
}