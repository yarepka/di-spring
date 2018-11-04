package guru.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"en", "default"})
@Primary
public class PrimaryGreetingService implements GreetingService {
    public static final String GREETING_MSG = "Hello - Primary Greeting service";

    @Override
    public String sayGreeting() {
        return GREETING_MSG;
    }
}
