package model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.datafaker.Faker;
import net.datafaker.providers.base.Book;

@RestController
@RequestMapping("/api/v1/book")

public class BookController {
    @GetMapping("/random")
    Book getRandom(){
        Faker faker = new Faker();
        Book book = Book.builder().title(faker.book().title())
            .author(faker.book().author())
            .genre(faker.book().genre())
            .build();
        return book;
    }
}
