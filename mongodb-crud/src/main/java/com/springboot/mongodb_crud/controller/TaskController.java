package com.springboot.mongodb_crud.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.mongodb_crud.entity.Task;
import com.springboot.mongodb_crud.service.TaskService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/tasks")
@AllArgsConstructor
public class TaskController {

	private TaskService taskService;

	@PostMapping("/add")
	public ResponseEntity<Task> addTask(@RequestBody Task task) {
		Task addTask = taskService.addTask(task);
		return new ResponseEntity<>(addTask, HttpStatus.CREATED);
	}

	@GetMapping
	public ResponseEntity<List<Task>> getAllTask() {
		List<Task> tasks = taskService.getAllTask();
		return ResponseEntity.ok(tasks);
	}

	@GetMapping("/get/{id}")
	public ResponseEntity<Task> getTaskById(@PathVariable String id) {
		Task getTask = taskService.getTaskById(id);
		return ResponseEntity.ok(getTask);
	}

	@GetMapping("/severity/{severity}")
	public ResponseEntity<List<Task>> getTaskBySeverity(@PathVariable int severity) {
		List<Task> getSeverity = taskService.getTaskBySeverity(severity);
		return ResponseEntity.ok(getSeverity);
	}

	@GetMapping("/assignee/{assignee}")
	public ResponseEntity<List<Task>> getTaskByAssignee(@PathVariable String assignee) {
		List<Task> getAssignee = taskService.getTaskByAssignee(assignee);
		return ResponseEntity.ok(getAssignee);
	}

	@PutMapping("/update")
	public ResponseEntity<Task> updateTask(@RequestBody Task task) {
		Task update = taskService.updateTask(task);
		return ResponseEntity.ok(update);
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteTask(@PathVariable String id) {
		String delete = taskService.deleteTask(id);
		return ResponseEntity.ok(delete);
	}

}
