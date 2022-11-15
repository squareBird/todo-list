package com.squarebird.todolist.presentation;

import com.squarebird.todolist.application.TodoService;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;
import static org.springframework.web.reactive.function.server.ServerResponse.ok;

@Component
@AllArgsConstructor
public class TodoHandler {

    private final TodoService todoService;

    @Bean
    public RouterFunction<ServerResponse> routes() {
        return route(GET("/"), this::createTodoList);
    }

    public Mono<ServerResponse> createTodoList(ServerRequest serverRequest) {
        return ok().body(Mono.just("오우 성공"),String.class);
    }
}
