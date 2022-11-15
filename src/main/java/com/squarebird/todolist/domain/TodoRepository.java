package com.squarebird.todolist.domain;

import com.squarebird.todolist.domain.entity.TodoList;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public interface TodoRepository extends ReactiveCrudRepository<TodoList, Long> {

    Flux<TodoList> findByTitle(String title);

}
