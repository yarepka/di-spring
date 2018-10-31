package guru.springframework.dispring.services;


import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

    public static final String HELLO_PEOPLE = "Hello People!! ;)";

    @Override
    public String sayGreeting() {
        return HELLO_PEOPLE;
    }
}
