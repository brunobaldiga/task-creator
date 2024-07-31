package dev.bruno.task.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.bruno.task.model.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {
    
}
