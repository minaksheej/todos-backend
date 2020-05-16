package com.todos.backend.todosbackend.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded =true)
@NoArgsConstructor
public class Todo {

	@EqualsAndHashCode.Include private long id;
	private String username;
	private String description;
	private Date targetDate;
	private boolean isDone;
	
	
}
