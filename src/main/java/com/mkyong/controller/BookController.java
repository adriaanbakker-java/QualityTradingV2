package com.mkyong.controller;

import com.mkyong.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/frontendservice")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/geefdatabasenaam")
    public String geefDatabaseName() {
        return "databasenaam is " + bookService.geefDatabasenaam();
    }


}
