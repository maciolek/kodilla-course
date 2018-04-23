package com.kodilla.patterns2.facade;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class Authenticator {

    public boolean isAuthenticated(Long userID) {
        Random random = new Random();
        return random.nextBoolean();
    }
}
