package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyGreetingServiceImpl implements GreetingsService{
    @Override
    public String sayGreeting() {
        return "Hello from greeting service! - Property";
    }
}
