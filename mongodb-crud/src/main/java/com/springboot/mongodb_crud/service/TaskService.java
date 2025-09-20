package com.springboot.mongodb_crud.service;

import java.util.List;

import com.springboot.mongodb_crud.entity.Task;

public interface TaskService {
	Task addTask(Task task);

	List<Task> getAllTask();

	Task getTaskById(String id);

	List<Task> getTaskBySeverity(int severity);

	List<Task> getTaskByAssignee(String assignee);

	Task updateTask(Task task);

	String deleteTask(String id);

}
