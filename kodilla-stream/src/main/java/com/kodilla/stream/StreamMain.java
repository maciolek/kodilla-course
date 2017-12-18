package com.kodilla.stream;

import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {

        Forum forumUserList = new Forum();

        Map<Integer,ForumUser> listOfForumUser = forumUserList.getUserList().stream()
                .filter(user -> user.getMale()=='M')
                .filter(user ->user.getNumberOfPosts()>1)
                .collect(Collectors.toMap(ForumUser::getUserID, user -> user));

        System.out.println("Ilość elementów: "+listOfForumUser.size());
        String showMap = listOfForumUser.entrySet().stream()
                .map(entry -> entry.getKey().toString() + entry.getValue().toString())
                .collect(Collectors.joining(",\n","#","#" ));
        System.out.println(showMap);

    }
}

 /*       BookDirectory theBookDirectory = new BookDirectory();
        String theResultStringOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .map(Book::toString)
                .collect(Collectors.joining(",\n","<<",">>"));
        System.out.println(theResultStringOfBooks);
    }
    }*/
      /*  BookDirectory theBookDirectory = new BookDirectory();
        Map<String, Book> theResultMapOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .collect(Collectors.toMap(Book::getSignature, book -> book));

        System.out.println("# elements: " + theResultMapOfBooks.size());
        theResultMapOfBooks.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);

    }
}
*/
 /*       BookDirectory theBookDirectory = new BookDirectory();
        List<Book> theResultListOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .collect(Collectors.toList());

        System.out.println("# elements: " + theResultListOfBooks.size());
        theResultListOfBooks.stream()
                .forEach(System.out::println);*/

/*

        BookDirectory theBookDirectory = new BookDirectory();
        theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .forEach(System.out::println);
*/




 /*       People.getList().stream()
              // .map(s -> s.toUpperCase())
                .map(String::toUpperCase)
                .filter(s -> s.length() > 11)
              //.forEach(System.out::println);
                .forEach(s -> System.out.println(s));
*/
/*        People.getList().stream()
                .map(String::toUpperCase)
                .filter(s -> s.length() > 11)
                .map(s -> s.substring(0, s.indexOf(' ') + 2) + ".")
                .filter(s -> s.substring(0, 1).equals("M"))
                .forEach(System.out::println);*/

        /*        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("\nNauka JAVA to sama przyjemność! :-D",String::toUpperCase);
        poemBeautifier.beautify("Nauka JAVY zajmuje mnóstwo czasu!", MyBeautyfier::beautifierAddLineInHash);
        poemBeautifier.beautify("Umiem coraz wiecej", (text) -> MyBeautyfier.beautifierOneLineOneChar(text));
        */
/*// mod 7.1
        Processor processor = new Processor();
        ExecuteSaySomething executeSaySomething = new ExecuteSaySomething();
        processor.execute(executeSaySomething);
// lambda 1 bez objektu klasy pośredniczącej!
//        Executor executor = () -> System.out.println("0This is an example text - lambda 1");
//        processor.executor(executor);
//lambda 2 bez tworzenia zmiennej :-)
//        processor.execute (()-> System.out.println("This is an example text - lambda 2"));
//lambda z argumentami 3
//        ExpressionExecutor expressionExecutor = new ExpressionExecutor();
//        expressionExecutor.executeExpression(5,5,  (a, b) -> a + b);
//        expressionExecutor.executeExpression(10,8, (a, b) -> a - b);
//        expressionExecutor.executeExpression(20,5, (a, b) -> a / b);
//        expressionExecutor.executeExpression(3,3,(a, b) -> a * b);
//lambda z referencjami 4
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();
        expressionExecutor.executeExpression(5,5, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(10,8, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(20,5, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3,3,FunctionalCalculator::divideAByB);*/
