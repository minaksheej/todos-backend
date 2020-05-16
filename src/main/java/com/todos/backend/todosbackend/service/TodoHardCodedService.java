package com.todos.backend.todosbackend.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.todos.backend.todosbackend.model.Todo;

@Service
public class TodoHardCodedService {
	private static List<Todo> todos = new ArrayList<>();
	private static int id = 0;

	static {
		todos.add(new Todo(++id, "", "Learn To drive", new Date(), false));
		todos.add(new Todo(++id, " ", "Go For Runing ", new Date(), false));
		todos.add(new Todo(++id, " ", "daily practice alleast Algo question ", new Date(), false));

	}

	public Todo saveTodo(Todo todo) {
		if (todo.getId() == -1 || todo.getId() ==0) {
			todo.setId(++id);
			todos.add(todo);
		} else {
			deleteTodoById(todo.getId());
			todos.add(todo);
		}
		return todo;
	}

	public List<Todo> getTodos(String username) {
		return todos;
	}

	public Todo deleteTodoById(long id) {
		Todo todo = findById(id);
		if (todo != null) {
			todos.remove(todo);
			return todo;
		}
		return todo;
	}

	public Todo findById(long id) {
		for (Todo todo : todos) {
			if (todo.getId() == id) {
				return todo;

			}
		}
		return null;
	}

}
