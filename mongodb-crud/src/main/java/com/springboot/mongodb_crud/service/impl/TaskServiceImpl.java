package com.springboot.mongodb_crud.service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.springboot.mongodb_crud.entity.Task;
import com.springboot.mongodb_crud.repository.TaskRepository;
import com.springboot.mongodb_crud.service.TaskService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class TaskServiceImpl implements TaskService {

	private TaskRepository taskRepository;

	@Override
	public Task addTask(Task task) {
		task.setTaskId(UUID.randomUUID().toString().split("-")[0]);
		return taskRepository.save(task);
	}

	@Override
	public List<Task> getAllTask() {
		return taskRepository.findAll();
	}

	@Override
	public Task getTaskById(String id) {
		return taskRepository.findById(id).get();
	}

	@Override
	public List<Task> getTaskBySeverity(int severity) {
		return taskRepository.findBySeverity(severity);
	}

	@Override
	public List<Task> getTaskByAssignee(String assignee) {
		return taskRepository.getTaskByAssignee(assignee);
	}

	@Override
	public Task updateTask(Task task) {

		Task existingTask = taskRepository.findById(task.getTaskId()).get();

		existingTask.setDescription(task.getDescription());
		existingTask.setSeverity(task.getSeverity());
		existingTask.setAssignee(task.getAssignee());
		existingTask.setStoryPoint(task.getStoryPoint());

		return taskRepository.save(existingTask);
	}

	@Override
	public String deleteTask(String id) {
		taskRepository.deleteById(id);
		return "Task deleted";
	}
}
