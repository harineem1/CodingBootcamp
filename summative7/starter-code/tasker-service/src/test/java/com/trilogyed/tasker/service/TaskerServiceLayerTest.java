package com.trilogyed.tasker.service;

import com.trilogyed.tasker.dao.TaskerDao;
import com.trilogyed.tasker.dao.TaskerDaoJdbcTemplateImpl;
import com.trilogyed.tasker.model.Task;
import com.trilogyed.tasker.model.TaskViewModel;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;

public class TaskerServiceLayerTest {

    TaskerDao taskerDao;
    TaskerServiceLayer serviceLayer;


    @Before
    public void setUp() throws Exception {

        setUpTaskerDaoMock();

        serviceLayer = new TaskerServiceLayer(taskerDao);
    }

    @Test
    public void fetchTask() {

        TaskViewModel taskViewModel = new TaskViewModel();

       // taskViewModel.setId(5);
        taskViewModel.setDescription("needed");
        taskViewModel.setCreateDate(LocalDate.of(2015,11,11));
        taskViewModel.setDueDate(LocalDate.of(2017,11,11));
        taskViewModel.setCategory("notUrgent");

        taskViewModel = serviceLayer.newTask(taskViewModel);
        TaskViewModel fromService = serviceLayer.fetchTask(taskViewModel.getId());
        assertEquals(taskViewModel, fromService);

    }

    @Test
    public void fetchAllTasks() {

        TaskViewModel taskViewModel =new TaskViewModel();

        taskViewModel.setId(5);
        taskViewModel.setDescription("needed");
        taskViewModel.setCreateDate(LocalDate.of(2015,11,11));
        taskViewModel.setDueDate(LocalDate.of(2017,11,11));
        taskViewModel.setCategory("notUrgent");

        List<TaskViewModel> taskViewModels = serviceLayer.fetchAllTasks();
        assertEquals(taskViewModels.size(),1);
    }

    @Test
    public void fetchTasksByCategory() {
        TaskViewModel taskViewModel =new TaskViewModel();

        taskViewModel.setDescription("needed");
        taskViewModel.setCreateDate(LocalDate.of(2015,11,11));
        taskViewModel.setDueDate(LocalDate.of(2017,11,11));
        taskViewModel.setCategory("notUrgent");

        taskViewModel = serviceLayer.newTask(taskViewModel);
        List<TaskViewModel> taskViewModels = serviceLayer.fetchTasksByCategory("notUrgent");
        assertEquals(taskViewModels.size(),1);
        assertEquals(taskViewModels.get(0), taskViewModel);
    }

    @Test
    public void newTask() {


    }

    @Test
    public void deleteTask() {

    }

    @Test
    public void updateTask() {

    }


    private void setUpTaskerDaoMock() {


        taskerDao = mock(TaskerDaoJdbcTemplateImpl.class);

        Task task = new Task();

        task.setId(5);
        task.setDescription("needed");
        task.setCreateDate(LocalDate.of(2015,11,11));
        task.setDueDate(LocalDate.of(2017,11,11));
        task.setCategory("notUrgent");
//        task.setQuantity(22);

        Task task1 = new Task();

    //   task1.setId(5);
        task1.setDescription("needed");
        task1.setCreateDate(LocalDate.of(2015,11,11));
        task1.setDueDate(LocalDate.of(2017,11,11));
        task1.setCategory("notUrgent");
 //       task.setQuantity(22);

        List<Task> taskList = new ArrayList<>();
        taskList.add(task);

        doReturn(task).when(taskerDao).createTask(task1);
        doReturn(task).when(taskerDao).getTask(5);
        doReturn(taskList).when(taskerDao).getAllTasks();
        doReturn(taskList).when(taskerDao).getTasksByCategory(task.getCategory());
    }
}