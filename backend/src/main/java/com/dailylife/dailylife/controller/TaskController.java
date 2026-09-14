package com.dailylife.dailylife.controller;

import com.dailylife.dailylife.model.Task;
import com.dailylife.dailylife.service.TaskService;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import java.util.List;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping
    public List<Task> getAllTasks() {
        return taskService.getAllTasks();
    }

    @GetMapping("/{id}")
public ResponseEntity<Task> getTaskById(@PathVariable Long id) {
    return taskService.getTaskById(id)
            .map(ResponseEntity::ok)
            .orElseGet(() -> ResponseEntity.notFound().build());
}

    @PostMapping
    public Task createTask(@Valid @RequestBody Task task){
        return taskService.createTask(task);
    }

    @PutMapping("/{id}")
public ResponseEntity<Task> updateTask(
        @PathVariable Long id,
        @Valid @RequestBody Task task) {

    return taskService.updateTask(id, task)
            .map(ResponseEntity::ok)
            .orElseGet(() -> ResponseEntity.notFound().build());
}


   @DeleteMapping("/{id}")
public ResponseEntity<Void> deleteTask(@PathVariable Long id) {

    if (taskService.deleteTask(id)) {
        return ResponseEntity.noContent().build();
    }

    return ResponseEntity.notFound().build();
}
}