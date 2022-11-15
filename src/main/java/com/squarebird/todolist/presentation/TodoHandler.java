package com.squarebird.todolist.presentation;

import com.squarebird.todolist.application.TodoService;
import com.squarebird.todolist.domain.TodoRepository;
import com.squarebird.todolist.domain.entity.TodoList;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;
import static org.springframework.web.reactive.function.server.ServerResponse.ok;

//@Component
@RestController
@AllArgsConstructor
public class TodoHandler {

    private final TodoService todoService;

    @GetMapping(value = "/")
    public Flux<TodoList> getAll() {
        return todoService.getAll();
    }

    @ApiImplicitParams({
            @ApiImplicitParam(name = "title", value = "TodoList의 제목", required = true, dataType = "string")
    })
    @GetMapping(value = "/todoList/{title}")
    public Flux<TodoList> getTodoList(@PathVariable String title) {
        return todoService.getTodoList(title);
    }

    @PostMapping(value = "/todoList")
    public Mono<TodoList> createTodoList(@RequestBody TodoList todoList) {
        return todoService.createTodoList(todoList);
    }

}

//    @Bean
//    public RouterFunction<ServerResponse> routes() {
//        return route(GET("/"), this::getTodoList);
//    }
//    public Mono<ServerResponse> createTodoList(ServerRequest serverRequest) {
//        return ok().body(Mono.just("오우 성공"),String.class);
//    }
