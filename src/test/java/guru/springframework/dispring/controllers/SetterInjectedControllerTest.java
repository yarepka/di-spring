package guru.springframework.dispring.controllers;

import guru.services.SetterGreetingService;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SetterInjectedControllerTest {

    private SetterInjectedController setterInjectedController;

    @Before
    public void setUp() throws Exception {
        setterInjectedController = new SetterInjectedController();
        setterInjectedController.setGreetingService(new SetterGreetingService());
    }

    @Test
    public void testGreeting() {
        assertEquals(SetterGreetingService.GREETING_MSG, setterInjectedController.sayHello());
    }
}