package com.todoThyme.TodoThyme;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import ch.qos.logback.core.model.Model;



@Controller
public class TodoController {

private static final List<Todo> todoItems = new ArrayList<>();
static {
    todoItems.add(new Todo("Skriv ut listan", 1));
    todoItems.add(new Todo("Lägga till nytt", 2));
    todoItems.add(new Todo("Ta bort från listan", 3));
    todoItems.add(new Todo("Stäng ner och gå hem", 4));
}


    @GetMapping("/todo")
        String getTodo(Model model) {
             model.addAttribute("todoItems",todoItems);
         return  "todo";
        }

    }