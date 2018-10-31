package guru.springframework.dispring.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyGreetingService implements GreetingService {

    public static final String GREETING_MSG = "Hello - I was injected via the property!!!";

    @Override
    public String sayGreeting() {
        return GREETING_MSG;
    }
}
