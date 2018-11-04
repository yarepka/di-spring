package guru.springframework.dispring.controllers;

import guru.services.PropertyGreetingService;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PropertyInjectedControllerTest {

    private PropertyInjectedController propertyInjectedController;

    @Before
    public void setUp() throws Exception {
        this.propertyInjectedController = new PropertyInjectedController();
        this.propertyInjectedController.greetingService = new PropertyGreetingService();
    }

    @Test
    public void testGreeting() {
        assertEquals(PropertyGreetingService.GREETING_MSG, propertyInjectedController.sayHello());
    }
}