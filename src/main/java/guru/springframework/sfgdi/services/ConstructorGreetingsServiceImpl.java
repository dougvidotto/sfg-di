package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingsServiceImpl implements GreetingsService {

    @Override
    public String sayGreeting() {
        return "Hello from Greeting Service! - Constructor";
    }
}
