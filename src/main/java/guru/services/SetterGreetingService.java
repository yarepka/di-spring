package guru.services;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingService implements GreetingService {

    public static final String GREETING_MSG = "Hello - I was injected via the setter method!!!";

    @Override
    public String sayGreeting() {
        return GREETING_MSG;
    }
}
