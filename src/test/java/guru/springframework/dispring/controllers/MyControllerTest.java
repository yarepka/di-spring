package guru.springframework.dispring.controllers;

import guru.springframework.dispring.services.PrimaryGreetingService;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyControllerTest {

    private MyController myController;

    @Before
    public void setUp() throws Exception {
        myController = new MyController(new PrimaryGreetingService());
    }

    @Test
    public void sayHello() {
        assertEquals(PrimaryGreetingService.GREETING_MSG, myController.sayHello());
    }
}