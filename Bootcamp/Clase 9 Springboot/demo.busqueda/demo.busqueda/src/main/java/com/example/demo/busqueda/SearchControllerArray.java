package com.example.demo.busqueda;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class SearchControllerArray {



    @GetMapping("/search1/{text}")
    public String[] searchSomething(@PathVariable String text){

        String[] searchResult = new String[19];
        int i = 0;

        String[] names = {
                "Java Bootcamp",
                "Java Basic",
                "Java Advanced",
                "Java Intermediate",
                "Java Arrays",
                "Java Stream",
                "Java loops",
                "Python Curs",
                "Python Library",
                "Springboot",
                "Spring framework",
                "Spring security",
                "Spring maven",
                "Python Bootcamp",
                "Arrays",
                "loops",
                "Javascipts",
                "Javascript bootcamp"
        };

        for(String name : names){
            if(name.toLowerCase().contains(text.toLowerCase()))
                searchResult[i] = name;
            i++;
        }
        return searchResult;
    }

}
