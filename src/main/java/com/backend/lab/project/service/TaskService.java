package com.backend.lab.project.service;

import com.backend.lab.project.entity.Task;
import com.backend.lab.project.repository.TaskRepository;
import com.backend.lab.project.specification.TaskSpecification;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.*;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TaskService {

    private final TaskRepository taskRepository;

    // Create
    public Task createTask(Task task) {
        return taskRepository.save(task);
    }

    // Read (with Pagination + Filtering)
    public Page<Task> getTasks(String status, String keyword, int page, int size) {
        Specification<Task> spec = TaskSpecification.hasStatus(status)
                .and(TaskSpecification.titleContains(keyword));


        Pageable pageable = PageRequest.of(page, size, Sort.by("id").descending());

        return taskRepository.findAll(spec, pageable);
    }

    // Read by ID
    public Optional<Task> getTaskById(Long id) {
        return taskRepository.findById(id);
    }

    // Update
    public Optional<Task> updateTask(Long id, Task updatedTask) {
        return taskRepository.findById(id).map(task -> {
            task.setTitle(updatedTask.getTitle());
            task.setStatus(updatedTask.getStatus());
            return taskRepository.save(task);
        });
    }

    // Delete
    public boolean deleteTask(Long id) {
        if (taskRepository.existsById(id)) {
            taskRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
