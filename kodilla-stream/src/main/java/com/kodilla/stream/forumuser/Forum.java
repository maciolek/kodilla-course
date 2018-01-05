package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public class Forum {

    private final List<ForumUser> forumUserList = new ArrayList<>();

    public Forum() {
        forumUserList.add(new ForumUser(110, "Andrzej", 'M', 1998, 12, 30, 10));
        forumUserList.add(new ForumUser(122, "Stefan", 'M', 1983, 9, 15, 21));
        forumUserList.add(new ForumUser(100, "Henryk", 'M', 1981, 4, 20, 33));
        forumUserList.add(new ForumUser(200, "Dariusz", 'M', 1995, 11, 12, 0));
        forumUserList.add(new ForumUser(300, "Adam", 'M', 1988, 5, 21, 5));
        forumUserList.add(new ForumUser(400, "Stefan", 'M', 2000, 10, 04, 1));
        forumUserList.add(new ForumUser(500, "Henryk", 'M', 1995, 6, 30, 0));
        forumUserList.add(new ForumUser(600, "Kamil", 'M', 1994, 8, 23, 3));
        forumUserList.add(new ForumUser(700, "Sylwia", 'F', 1997, 4, 04, 99));
        forumUserList.add(new ForumUser(800, "Jolanta", 'F', 1990, 7, 15, 0));
        forumUserList.add(new ForumUser(221, "Anna", 'F', 1995, 8, 18, 13));
        forumUserList.add(new ForumUser(100, "Katarzyna", 'F', 1989, 1, 01, 0));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(forumUserList);
    }


}
