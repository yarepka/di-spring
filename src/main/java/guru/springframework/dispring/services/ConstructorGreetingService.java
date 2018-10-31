package guru.springframework.dispring.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingService {

    public static final String GREETING_MSG = "Hello - I was injected via the constructor!!!";

    @Override
    public String sayGreeting() {
        return GREETING_MSG;
    }
}
