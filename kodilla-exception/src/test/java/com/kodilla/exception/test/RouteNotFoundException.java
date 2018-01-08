package com.kodilla.exception.test;

import com.kodilla.exception.nullpointer.MessageNotSentException;

public class RouteNotFoundException extends Exception {

    RouteNotFoundException(final String airport) {
        super("Route to " + airport + " cannot be found.");
    }
}
