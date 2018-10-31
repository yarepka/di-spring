package guru.springframework.dispring.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class PrimaryGreetingService implements GreetingService {
    public static final String GREETING_MSG = "Hello - Primary Greeting service";

    @Override
    public String sayGreeting() {
        return GREETING_MSG;
    }
}
