package com.supriya.Todo_Application.model;

import lombok.*;

@Data
@AllArgsConstructor
public class Todo {

    private String id;

    private String todoName;

    private boolean todoStatus;

}

