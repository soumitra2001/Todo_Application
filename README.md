

<h1 align=center>📔📖 Todo_Application 📚📃</h1>

This repository contains the source code for the Todo_Application, a simple application for managing a todo list. The application has been implemented using Java and follows a RESTful architecture.


## Frameworks and Language used

[![JAVA Docs](https://img.shields.io/badge/JAVA-v20.0.1-blue.svg)](https://docs.oracle.com/en/java/)
[![GPLv3 License](https://img.shields.io/badge/Spring_Boot-v3.0.6-yellow.svg)](https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/)


## Required Dependencies

To run this project, you will need to add the following dependencies to your pom.xml file

`Spring Web`, `Spring Boot Dev Tool`, `Lombok`, `Validation`

## Entity
The main entity in this application is the `Todo` object, which represents a single `todo` item. Each Todo object has the following properties:

`id`: The unique identifier of the todo item.

`title`: The title or description of the todo item.

`status`: The status of the todo item (e.g., completed, pending, in progress).


## Controller
The `TodoController` class, located in the controller package, provides various methods to perform CRUD (Create, Read, Update, Delete) operations on the todo list.

### Methods
`getAllTodos`: This method retrieves all the todos in the list.

`getTodosByStatus`: This method retrieves todos based on their status.

`getTodoById`: This method retrieves a todo item by its unique identifier.

`addTodo`: This method adds a new todo item to the list.

`deleteTodoById`: This method deletes a todo item from the list based on its identifier.

`updateTodoStatusById`: This method updates the status of a todo item based on its identifier.


Please note that the application assumes the usage of appropriate HTTP methods (GET, POST, DELETE, PUT/PATCH) to interact with the RESTful endpoints provided by the TodoController.

## Data Structure used in project :
- List

## Contribution
Contributions to the Todo-application are welcome. If you find any issues or have suggestions for improvements, please open an issue or submit a pull request.

## Project Summary :

````
 The Todo_Application is a simple Java-based application designed to manage a todo list. It provides a set of RESTful endpoints for performing CRUD operations on the todo items. The main entity in the application is the Todo object, which represents a single `todo` item with properties like `id`, `title`, and `status`.
 
````


