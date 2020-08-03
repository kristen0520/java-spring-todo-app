package academy.learnprogramming.controller;

import academy.learnprogramming.model.TodoData;
import academy.learnprogramming.model.TodoItem;
import academy.learnprogramming.service.TodoItemService;
import academy.learnprogramming.service.TodoItemServiceImpl;
import academy.learnprogramming.util.Mappings;
import academy.learnprogramming.util.ViewNames;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class TodoItemController {

    //== fields ==
    private final TodoItemService todoItemService;

    //== constructors ==
    @Autowired
    public TodoItemController(TodoItemService todoItemService) {
        this.todoItemService = todoItemService;
    }

    // == model attributes ==
    @ModelAttribute
    public TodoData todoData(){
        return new TodoData();
    }

    // == handler methods ==
    //http://localhost:8080/todo-list/items
    @GetMapping(Mappings.ITEMS)
    public String items(){
        return ViewNames.ITEMS_LIST;
    }
}
