package com.isaac.springbootreact;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
	
	@CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/books")
    public List < Book > getBooks() {
        return Arrays.asList(new Book(1, "Core Java"), new Book(2, "Effective Java"), new Book(3, "Head First Java"));
    }
	

}
