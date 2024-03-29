package com.supriya.Todo_Application.repository;
import com.supriya.Todo_Application.model.Todo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository
public class TodoDao {

    private List<Todo> todoList;//data source for all our todos

    public TodoDao()
    {
        todoList = new ArrayList<>() ;
        //not needed ...done for testing
        todoList.add(new Todo("0","Dummy Todo for Testing",true));

    }

    public List<Todo> getTodosFromDataSource()
    {
        return todoList;
    }

    public boolean save(Todo todo)
    {
        todoList.add(todo);//mock Database call
        return true;
    }

    public boolean remove(Todo todo)
    {
        todoList.remove(todo);
        return true;
    }

    public boolean update(String id, boolean status)
    {
        boolean updateStatus = false;
        for(Todo todo : todoList)
        {
            if(todo.getId().equals(id))
            {

                remove(todo);

                //change this todo now
                todo.setTodoStatus(status);

                //add this new todo :
                save(todo);

                //todo.setTodoStatus(status);

                return true;

            }

        }
        return false;
    }
}



