package dev.bruno.task.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import dev.bruno.task.model.Task;
import dev.bruno.task.repository.TaskRepository;

@Service
public class TaskService {
    @Autowired
    TaskRepository taskRepository;

    public List<Task> list() {
        Sort sort = Sort.by(Sort.Order.desc("priority"));

        return taskRepository.findAll(sort);
    }

    public List<Task> save(Task task) {
        taskRepository.save(task);

        return list();
    }


    public List<Task> delete(Long taskId) {
        taskRepository.deleteById(taskId);

        return list();
    }


}
