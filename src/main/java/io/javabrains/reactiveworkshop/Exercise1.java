package io.javabrains.reactiveworkshop;

import java.util.List;

public class Exercise1 {

    public static void main(String[] args) {

        // Use StreamSources.intNumbersStream() and StreamSources.userStream()

        // Print all numbers in the intNumbersStream stream
        // TODO: Write code here
        StreamSources.intNumbersStream()
                .forEach(System.out::println);
        // Print numbers from intNumbersStream that are less than 5
        // TODO: Write code here
        StreamSources.intNumbersStream()
                .filter(n -> n < 5)
                .forEach(System.out::println);
        // Print the second and third numbers in intNumbersStream that's greater than 5
        // TODO: Write code here
        StreamSources.intNumbersStream()
                .filter(n -> n > 5)
                .skip(1)
                .limit(2)
                .forEach(System.out::println);
        //  Print the first number in intNumbersStream that's greater than 5.
        //  If nothing is found, print -1
        // TODO: Write code here
        Integer no = StreamSources.intNumbersStream()
                .filter(n -> n > 5)
                .findFirst()
                .orElse(-1);
        System.out.print(no);
        // Print first names of all users in userStream
        // TODO: Write code here
        List<String> userNameList = StreamSources.userStream()
                .map(User::getFirstName)
                .toList();
        System.out.println(userNameList);
        // Print first names in userStream for users that have IDs from number stream
        // TODO: Write code here
        List<String> list = StreamSources.userStream()
                .filter(user -> StreamSources.intNumbersStream().anyMatch(id -> id == user.getId()))
                .map(User::getFirstName)
                .toList();
        System.out.println(list);
    }

}
