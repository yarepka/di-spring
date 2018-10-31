package guru.springframework.dispring.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("de")
@Primary
public class PrimaryGermanGreetingService implements GreetingService {

    public static final String GREETING_MSG = "Ich grüße sie";

    @Override
    public String sayGreeting() {
        return GREETING_MSG;
    }
}
