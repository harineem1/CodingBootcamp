package com.trilogyed.tasker.controller;

import com.trilogyed.tasker.model.TaskViewModel;
import com.trilogyed.tasker.service.TaskerServiceLayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.validation.Valid;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
@RefreshScope
@RequestMapping(value = "/tasks")
public class TaskerController {

    @Autowired
    TaskerServiceLayer service;

    public TaskerController(TaskerServiceLayer service) {
        this.service = service;
    }

    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    public List<TaskViewModel> fetchAllTasks() {
        return service.fetchAllTasks();
    }
    @PostMapping//Another way to set the Rest API Post mapping
    @ResponseStatus(HttpStatus.CREATED)
    public TaskViewModel createTask(@RequestBody @Valid TaskViewModel task) {
        return service.newTask(task);
    }
    @GetMapping(value = "/tasks/{id}")//Another way to set the Rest API Get mapping
    @ResponseStatus(HttpStatus.OK)
    public TaskViewModel fetchTask(@PathVariable("id") int Id) {
        TaskViewModel taskViewModel = service.fetchTask(Id);
        if (taskViewModel == null)
            throw new IllegalArgumentException("Tasks could not be retrieved for id " + Id);
        return taskViewModel;
    }

    @RequestMapping(value = "/tasks/{id}", method = RequestMethod.DELETE)
    public void deleteTask(@PathVariable int id) {
        service.deleteTask(id);
    }
    @PutMapping(value = "/tasks/{id}")//Another way to set the Rest API Put mapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateTShirts(@PathVariable("id") int Id, @RequestBody @Valid TaskViewModel taskViewModel) {
        if (taskViewModel.getId() == 0)
            taskViewModel.setId(Id);
        if (Id != taskViewModel.getId()) {
            throw new IllegalArgumentException("Customer ID on path must match the ID in the Customer object");
        }
        service.updateTask(taskViewModel);
    }
    @GetMapping("/category/{category}")
    @ResponseStatus(HttpStatus.OK)
    public List<TaskViewModel> fetchTasksByCategory(@PathVariable("category") String category) {
        List<TaskViewModel> task = service.fetchTasksByCategory(category);
        if ( task != null && task.size() == 0)
            throw new IllegalArgumentException("Tasks could not be retrieved for customer " + category);
        return task;
    }

}
