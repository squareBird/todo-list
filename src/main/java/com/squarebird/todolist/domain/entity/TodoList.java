package com.squarebird.todolist.domain.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table("todo_list")
public class TodoList {

//    @Id
    @Column("id")
    @ApiModelProperty(value="TodoList의 식별자", example = "1", required = true )
    private Integer id;

    @ApiModelProperty(value="TodoList의 제목", example = "Liam", required = true )
    @Column("title")
    private String title;

}
