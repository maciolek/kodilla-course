package com.kodilla.stream.immutable;

public final class ForumUser {

    private final String name;
    private final String nick;
    private final Integer dateOfBirth;

    public ForumUser(final String name, final String nick, final Integer dateOfBirth) {
        this.name = name;
        this.nick = nick;
        this.dateOfBirth = dateOfBirth;
    }

    public String getNick() {
        return nick;
    }

    public Integer getDateOfBirth() {
        return dateOfBirth;
    }

    public String getName() {

        return name;
    }
}
