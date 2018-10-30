package guru.springframework.dispring.controllers;

import org.springframework.stereotype.Controller; // mark class as a spring component

@Controller
public class MyController {
    public void hello() {
        System.out.println("Hello!!!");
    }
}
