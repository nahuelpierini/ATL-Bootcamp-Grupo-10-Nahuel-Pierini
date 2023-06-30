package com.example.demo.busqueda;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class SearchControllerList {

    List<String> something = new ArrayList<>();


    @GetMapping("/search2/{text}")
    public List<String> searchSomething2(@PathVariable String text){

        //Si dejo agregada esta lista y luego agrego palabras por postman como texto plano en body, luego se me repite la lista 3 veces
        /*
        something.add("Java Bootcamp");
        something.add("Java Basic");
        something.add("Java Advanced");
        something.add("Java Intermediate");
        something.add("Java Arrays");
        something.add("Java Stream");
        something.add("Java loops");
        something.add("Java loops");
        something.add("Python Curs");
        something.add("Python Library");
        something.add("Springboot");
        something.add("Spring framework");
        something.add("Spring security");
        something.add("Spring maven");
        something.add("Python Bootcamp");
        something.add("Arrays");
        something.add("loops");
        something.add("Javascipts");
        something.add("Javascript bootcamp");
        */
        List<String> searchResult = new ArrayList<>();

        for(String name : something){
            if(name.toLowerCase().contains(text.toLowerCase()))
                searchResult.add(name);
        }
        return searchResult;
    }

    @PostMapping("/add2")
    public void addSomething(@RequestBody String some){
        something.add(some);
    }

    @DeleteMapping("/delete2/{word}")
    public void deleteSomething(@PathVariable String word){
        something.removeIf(some -> some.contains(word));
    }

}
