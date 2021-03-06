package com.nemeantalestudios.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @author kevin
 */

//@Service
//@Primary
//@Profile("fr")
public class PrimaryFrenchGreetingService implements GreetingService {


    private GreetingRepository greetingRepository;

    public PrimaryFrenchGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return "Bonjour - From the French greeting service";
    }
}
