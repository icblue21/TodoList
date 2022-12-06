package com.example.todolist2.repository;

import com.example.todolist2.mapper.TodoListMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;

@Repository
public class TodoListRepository {
    
    @Autowired
    TodoListMapper tm;

    public int insertTodo(String todo){
        return tm.insertTodo(todo);
    }

    public ArrayList<HashMap<String,Object>> selectTodo(){
        return tm.selectTodo();
    }

    public int deleteTodo(HashMap<String,Object> params){
        return tm.deleteTodo(params);
    }
}
