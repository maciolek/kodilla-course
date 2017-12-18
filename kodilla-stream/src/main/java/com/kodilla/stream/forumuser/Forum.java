package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public class Forum {

    private final List<ForumUser> forumUserList = new ArrayList<>();

    public Forum () {
        forumUserList.add(new ForumUser(100, "Andrzej", 'M', 15));
        forumUserList.add(new ForumUser(200, "Dariusz", 'M', 0));
        forumUserList.add(new ForumUser(300, "Adam", 'M', 5));
        forumUserList.add(new ForumUser(400, "Stefan", 'M', 1));
        forumUserList.add(new ForumUser(500, "Henryk", 'M', 0));
        forumUserList.add(new ForumUser(600, "Kamil", 'M', 3));
        forumUserList.add(new ForumUser(700, "Sylwia", 'F', 99));
        forumUserList.add(new ForumUser(800, "Jolanta", 'F', 0));
        forumUserList.add(new ForumUser(100, "Anna", 'F', 13));
        forumUserList.add(new ForumUser(100, "Katarzyna", 'F', 0));
    }

    public List<ForumUser> getUserList(){
        return new ArrayList<>(forumUserList);
    }





}
