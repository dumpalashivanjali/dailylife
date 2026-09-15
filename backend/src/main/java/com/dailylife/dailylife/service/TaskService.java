package com.dailylife.dailylife.service;

import com.dailylife.dailylife.model.Task;
import com.dailylife.dailylife.repository.TaskRepository;
import org.springframework.stereotype.Service;
import java.util.Optional;
import java.util.List;
import com.dailylife.dailylife.dto.TaskRequest;
import com.dailylife.dailylife.dto.TaskResponse;

@Service
public class TaskService {

    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public List<TaskResponse> getAllTasks() {
    return taskRepository.findAll()
            .stream()
            .map(task -> new TaskResponse(
                    task.getId(),
                    task.getTitle(),
                    task.getDescription(),
                    task.isCompleted()
            ))
            .toList();
}
    public Optional<TaskResponse> getTaskById(Long id) {
    return taskRepository.findById(id)
            .map(task -> new TaskResponse(
                    task.getId(),
                    task.getTitle(),
                    task.getDescription(),
                    task.isCompleted()
            ));
}


   public TaskResponse createTask(TaskRequest request) {

    Task task = new Task();

    task.setTitle(request.getTitle());
    task.setDescription(request.getDescription());
    task.setCompleted(request.isCompleted());

    Task savedTask = taskRepository.save(task);

    return new TaskResponse(
            savedTask.getId(),
            savedTask.getTitle(),
            savedTask.getDescription(),
            savedTask.isCompleted()
    );
}

  public Optional<TaskResponse> updateTask(Long id, TaskRequest request) {
    return taskRepository.findById(id)
            .map(existingTask -> {

                existingTask.setTitle(request.getTitle());
                existingTask.setDescription(request.getDescription());
                existingTask.setCompleted(request.isCompleted());

                Task updatedTask = taskRepository.save(existingTask);

                return new TaskResponse(
                        updatedTask.getId(),
                        updatedTask.getTitle(),
                        updatedTask.getDescription(),
                        updatedTask.isCompleted()
                );
            });

}

    public boolean deleteTask(Long id) {
    if (!taskRepository.existsById(id)) {
        return false;
    }

    taskRepository.deleteById(id);
    return true;
}
}