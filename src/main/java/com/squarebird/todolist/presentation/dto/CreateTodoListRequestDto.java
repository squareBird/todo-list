package com.squarebird.todolist.presentation.dto;

import com.squarebird.todolist.domain.entity.TodoList;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CreateTodoListRequestDto {

    private Integer id;
    private String title;

    TodoList dtoToEntity() {
        return new TodoList(id, title);
    }

}
