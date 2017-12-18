package com.kodilla.stream;

import java.time.*;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {

        Forum forumUserList = new Forum();

        Map<Integer, ForumUser> listOfForumUser = forumUserList.getUserList().stream()
                .filter(user -> user.getSex() == 'M')
                .filter(user -> Period.between(user.getDateOfBirth(), LocalDate.now()).getYears() > 19)
                .filter(user -> user.getNumberOfPosts() > 1)
                .collect(Collectors.toMap(ForumUser::getUserID, user -> user));

        System.out.println("Ilość elementów: " + listOfForumUser.size());
        String showMap = listOfForumUser.entrySet().stream()
                .map(entry -> entry.getKey().toString() + entry.getValue().toString())
                .collect(Collectors.joining(",\n", "#", "#"));
        System.out.println(showMap);
    }
}
