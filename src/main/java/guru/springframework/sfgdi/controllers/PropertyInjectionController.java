package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectionController {

    @Autowired
    @Qualifier("propertyGreetingServiceImpl")
    public GreetingsService greetingsService;

    public String getGreeting() {
        return greetingsService.sayGreeting();
    }
}
