package com.dailylife.dailylife.controller;

import com.dailylife.dailylife.model.Task;
import com.dailylife.dailylife.service.TaskService;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import java.util.List;
import jakarta.validation.Valid;
import com.dailylife.dailylife.dto.TaskRequest;
import com.dailylife.dailylife.dto.TaskResponse;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping
public List<TaskResponse> getAllTasks() {
    return taskService.getAllTasks();
}
   @GetMapping("/{id}")
public ResponseEntity<TaskResponse> getTaskById(@PathVariable Long id) {
    return taskService.getTaskById(id)
            .map(ResponseEntity::ok)
            .orElseGet(() -> ResponseEntity.notFound().build());
}
    @PostMapping
public TaskResponse createTask(@Valid @RequestBody TaskRequest request) {
    return taskService.createTask(request);
}

   @PutMapping("/{id}")
public ResponseEntity<TaskResponse> updateTask(
        @PathVariable Long id,
        @Valid @RequestBody TaskRequest request) {

    return taskService.updateTask(id, request)
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