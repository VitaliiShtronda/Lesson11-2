package org.example.user;

import java.util.Optional;

public class UserServiceTest {

    public static void main(String[] args) {

        UserService userService = new UserService();

        User john = userService.search("john");

        User java = userService.search("java");

        Optional<User> john1 = userService.searchOpt("john");
        Optional<User> java1 = userService.searchOpt("java");

        User abcUser = java1.orElseGet(() -> {
            //requsting data from other app
            return new User("abc User", "abc.user@domail.com");
        });

        java1.ifPresentOrElse((u) ->{
            System.out.println("user founded" + u);
                },
                () -> {
                    System.out.println("user not founded");

                });
        System.out.println();

    }
}
