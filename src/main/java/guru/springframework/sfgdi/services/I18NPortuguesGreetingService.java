package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"PT", "default"})
@Service("i18NService")
public class I18NPortuguesGreetingService implements GreetingsService {

    @Override
    public String sayGreeting() {
        return "Ola Mundo! - PT";
    }
}
