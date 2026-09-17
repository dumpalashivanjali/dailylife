package com.dailylife.dailylife.controller;

import com.dailylife.dailylife.model.Task;
import com.dailylife.dailylife.service.TaskService;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import java.util.List;
import jakarta.validation.Valid;
import com.dailylife.dailylife.dto.TaskRequest;
import com.dailylife.dailylife.dto.TaskResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;

@RestController
@RequestMapping("/api/tasks")
@Tag(name = "Tasks", description = "Task management APIs")
public class TaskController {

    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }


    @Operation(
        summary = "Get all tasks",
        description = "Returns all tasks from the database"
)
    @GetMapping
public List<TaskResponse> getAllTasks() {
    return taskService.getAllTasks();
}
@Operation(
        summary = "Get task by ID",
        description = "Returns a task using its unique ID"
)
@ApiResponse(
        responseCode = "200",
        description = "Task found successfully"
)
@ApiResponse(
        responseCode = "404",
        description = "Task not found"
)
   @GetMapping("/{id}")
public ResponseEntity<TaskResponse> getTaskById(@PathVariable Long id) {
    return taskService.getTaskById(id)
            .map(ResponseEntity::ok)
            .orElseGet(() -> ResponseEntity.notFound().build());
}
@Operation(
        summary = "Create a new task",
        description = "Creates a new task using the provided task details"
)
@ApiResponse(
        responseCode = "201",
        description = "Task created successfully"
)
@ApiResponse(
        responseCode = "400",
        description = "Invalid task data"
)
   
@PostMapping
public ResponseEntity<TaskResponse> createTask(@Valid @RequestBody TaskRequest request) {
    return ResponseEntity.status(201)
            .body(taskService.createTask(request));
}
@Operation(
        summary = "Update a task",
        description = "Updates an existing task using its ID and the provided task details"
)
@ApiResponse(
        responseCode = "200",
        description = "Task updated successfully"
)
@ApiResponse(
        responseCode = "404",
        description = "Task not found"
)
@ApiResponse(
        responseCode = "400",
        description = "Invalid task data"
)

   @PutMapping("/{id}")
public ResponseEntity<TaskResponse> updateTask(
        @PathVariable Long id,
        @Valid @RequestBody TaskRequest request) {

    return taskService.updateTask(id, request)
            .map(ResponseEntity::ok)
            .orElseGet(() -> ResponseEntity.notFound().build());
}

@Operation(
        summary = "Delete a task",
        description = "Deletes an existing task using its ID"
)
@ApiResponse(
        responseCode = "204",
        description = "Task deleted successfully"
)
@ApiResponse(
        responseCode = "404",
        description = "Task not found"
)

   @DeleteMapping("/{id}")
public ResponseEntity<Void> deleteTask(@PathVariable Long id) {

    if (taskService.deleteTask(id)) {
        return ResponseEntity.noContent().build();
    }

    return ResponseEntity.notFound().build();
}
}