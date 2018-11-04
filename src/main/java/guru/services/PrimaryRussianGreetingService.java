package guru.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("ru")
@Primary
public class PrimaryRussianGreetingService implements GreetingService {

    public static final String GREETING_MSG = "Приветствую тебя, путник.";

    @Override
    public String sayGreeting() {
        return GREETING_MSG;
    }
}
