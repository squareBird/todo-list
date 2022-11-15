package com.squarebird.todolist.application;

import com.squarebird.todolist.domain.TodoRepository;
import com.squarebird.todolist.domain.entity.TodoList;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@AllArgsConstructor
public class TodoService {

    private final TodoRepository todoRepository;

    public Flux<TodoList> getAll() {
        return todoRepository.findAll();
    }

    public Flux<TodoList> getTodoList(String title) {
        return todoRepository.findByTitle(title);
    }

    public Mono<TodoList> createTodoList(TodoList todoList) {
        return todoRepository.save(todoList);
    }

}
