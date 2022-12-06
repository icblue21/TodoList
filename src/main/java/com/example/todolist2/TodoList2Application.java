package com.example.todolist2;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value={"com.example.todolist2.mapper"})
public class TodoList2Application {

    public static void main(String[] args) {
        SpringApplication.run(TodoList2Application.class, args);
    }

}
