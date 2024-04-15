package com.apifaker.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.User;
import net.datafaker.Faker;

@RestController
@RequestMapping("/api/v1/user")

public class UserController {
    @GetMapping("/random")
    User getRandomUser(){
        Faker faker = new Faker();

        User user = User.builder()
            .username(faker.name().username())
            .fullName(faker.name().fullName())
            .phone(faker.phoneNumber().phoneNumber())
            .birthday(faker.date().birthday())
            .build();

        
    }
}
