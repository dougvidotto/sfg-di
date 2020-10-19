package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryGreetingService implements GreetingsService {
    @Override
    public String sayGreeting() {
        return "Hello from greeting service - Primary";
    }
}
