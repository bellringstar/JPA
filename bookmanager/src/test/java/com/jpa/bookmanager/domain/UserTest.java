package com.jpa.bookmanager.domain;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UserTest {
    @Test
    void test() {
        User user = new User();
        user.setEmail("test@gmail.com");
        user.setName("tester");

        System.out.println(">>>" + user);
    }
}