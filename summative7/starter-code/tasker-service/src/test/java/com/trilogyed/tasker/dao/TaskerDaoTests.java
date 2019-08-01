package com.trilogyed.tasker.dao;

import com.trilogyed.tasker.model.Task;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.time.LocalDate;
import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class TaskerDaoTests {

    @Autowired
    TaskerDao taskerDao;

    @Before
    public void setUp() throws Exception {
        List<Task> taskList = taskerDao.getAllTasks();
        taskList.stream()
                .forEach(tasks -> {
                    taskerDao.deleteTask(tasks.getId());
                });
    }

    @After
    public void tearDown() throws Exception {
        List<Task> taskList = taskerDao.getAllTasks();
        taskList.stream()
                .forEach(tasks -> {
                    taskerDao.deleteTask(tasks.getId());
                });
    }

    @Test
    public void creategetdeleteTask() {

        Task tasks = new Task();
        //tasks.setSize("medium");

        tasks.setDescription("short note");
        tasks.setCreateDate(LocalDate.of(2010,1,1));
        tasks.setDueDate(LocalDate.of(2017,1,1));
        tasks.setCategory("outside");
        tasks = taskerDao.createTask(tasks);

        Task tasks1 = taskerDao.getTask(tasks.getId());
        assertEquals(tasks1,tasks);

        taskerDao.deleteTask(tasks.getId());
        tasks1 = taskerDao.getTask(tasks.getId());

        assertNull(tasks1);
    }

    @Test
    public void getAllTasks() {
        Task tasks = new Task();
        tasks.setDescription("short note");
        tasks.setCreateDate(LocalDate.of(2010,1,1));
        tasks.setDueDate(LocalDate.of(2017,1,1));
        tasks.setCategory("outside");
        tasks= taskerDao.createTask(tasks);

        List<Task> taskList = taskerDao.getAllTasks();
        assertEquals(taskList.size(),1);
    }

    @Test
    public void getTasksByCategory() {
        Task tasks = new Task();
        tasks.setDescription("short note");
        tasks.setCreateDate(LocalDate.of(2010,1,1));
        tasks.setDueDate(LocalDate.of(2017,1,1));
        tasks.setCategory("outside");
        tasks= taskerDao.createTask(tasks);

        tasks = new Task();
        tasks.setDescription("short note");
        tasks.setCreateDate(LocalDate.of(2010,1,1));
        tasks.setDueDate(LocalDate.of(2017,1,1));
        tasks.setCategory("outside");
        tasks= taskerDao.createTask(tasks);


        List<Task> taskList = taskerDao.getTasksByCategory("outside");
        assertEquals(taskList.size(),2);
    }

    @Test
    public void updateTask() {

        Task tasks = new Task();
        tasks.setDescription("short note");
        tasks.setCreateDate(LocalDate.of(2010,1,1));
        tasks.setDueDate(LocalDate.of(2017,1,1));
        tasks.setCategory("outside");
        tasks= taskerDao.createTask(tasks);

        tasks.setDescription("short note");
        tasks.setCategory("outside");
        taskerDao.updateTask(tasks);

        Task task2 = taskerDao.getTask(tasks.getId());

        assertEquals(task2,tasks);
    }

}