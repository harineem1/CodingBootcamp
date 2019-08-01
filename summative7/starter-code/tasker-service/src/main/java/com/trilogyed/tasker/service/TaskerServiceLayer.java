package com.trilogyed.tasker.service;

import com.trilogyed.tasker.dao.TaskerDao;
import com.trilogyed.tasker.model.Task;
import com.trilogyed.tasker.model.TaskViewModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;
import org.springframework.cloud.client.discovery.DiscoveryClient;

import java.util.ArrayList;
import java.util.List;

@Component
public class TaskerServiceLayer {

    TaskerDao taskerDao;

    @Autowired
    public TaskerServiceLayer(TaskerDao taskerDao) {
        this.taskerDao = taskerDao;
    }


    public TaskViewModel fetchTask(int id) {

        Task task = taskerDao.getTask(id);
        TaskViewModel tvm = new TaskViewModel();

        tvm.setId(task.getId());
        tvm.setDescription(task.getDescription());
        tvm.setCreateDate(task.getCreateDate());
        tvm.setDueDate(task.getDueDate());
        tvm.setCategory(task.getCategory());

        // TODO - get ad from Adserver and put in tvm
        tvm.setAdvertisement(getAdServerServiceName());
        return tvm;
    }

    public List<TaskViewModel> fetchAllTasks() {
        List<Task> taskList = taskerDao.getAllTasks();
        List<TaskViewModel> taskViewModelList = new ArrayList<>();

        taskList.stream()
                .forEach(task -> {
                    TaskViewModel cvm = buildTaskViewModel(task);
                    cvm.setAdvertisement(cvm.getAdvertisement());
                    taskViewModelList.add(cvm);
                });

        return taskViewModelList;
    }

    public List<TaskViewModel> fetchTasksByCategory(String category) {
        return null;
    }

    public TaskViewModel newTask(TaskViewModel taskViewModel) {

        Task task = new Task();
        task.setDescription(taskViewModel.getDescription());
        task.setCreateDate(taskViewModel.getCreateDate());
        task.setDueDate(taskViewModel.getDueDate());
        task.setCategory(taskViewModel.getCategory());

        task = taskerDao.createTask(task);
        taskViewModel.setId(task.getId());

        // TODO - get ad from Adserver and put in taskViewModel
        taskViewModel.setAdvertisement(getAdServerServiceName());
        return taskViewModel;
    }

    public void deleteTask(int id) {
        taskerDao.deleteTask(id);

    }

    public void updateTask(TaskViewModel taskViewModel) {

    }

    private TaskViewModel buildTaskViewModel(Task task) {

        TaskViewModel taskViewModel = new TaskViewModel();

        taskViewModel.setId(task.getId());
        taskViewModel.setDescription(task.getDescription());
        taskViewModel.setCreateDate(task.getCreateDate());
        taskViewModel.setDueDate(task.getDueDate());
        taskViewModel.setCategory(task.getCategory());
        // taskViewModel.setPrice(consoles.getPrice());

        return taskViewModel;
    }

    @Autowired
    private DiscoveryClient discoveryClient;

    private RestTemplate restTemplate = new RestTemplate();

    @Value("${adServiceName}")
    private String adServiceName;

    @Value("${serviceProtocol}")
    private String serviceProtocol;

    @Value("${servicePath}")
    private String servicePath;

    public String getAdServerServiceName() {

        try {
            List<ServiceInstance> instances = discoveryClient.getInstances(adServiceName);

            String adServerServiceUri = serviceProtocol + instances.get(0).getHost() + ":" + instances.get(0).getPort() + servicePath;

//            adServerServiceUri = "http://localhost:6107/ad";
            String ads = restTemplate.getForObject(adServerServiceUri, String.class);
            return ads;

        } catch (NullPointerException e) {
            return "Advertisement";
        }
    }
}