package com.company;

import java.util.ArrayList;

/**
 * Created by acer-pc on 30.06.2016.
 */

// тут у нас просто файл с задачиами
public class TasksForEmployees {

    Task task10;
    Task task9;
    Task task8;
    Task task7;
    Task task6;
    Task task5;
    Task task4;
    Task task3;
    Task task2;
    Task task1;

    ArrayList<Task> tasks = new ArrayList<>();

    public TasksForEmployees(){
        task10 = new TesterTasks(10, 3, 24);
        task9 = new TesterTasks(9, 3, 15);
        task8 = new TesterTasks(8, 7, task9);
        task7 = new TesterTasks(7, 6);
        task6 = new TesterTasks(6, 4, task7);
        task5 = new TesterTasks(5, 9, null, task4);
        task4 = new TesterTasks(4, 2, task5);
        task3 = new TesterTasks(3, 4, task4);
        task2 = new TesterTasks(2, 11);
        task1 = new TesterTasks(1, 3, task2);

        task4.setPreviousTask(task3);
        task4.definePriority();

        createTasks();
    }

    private void createTasks(){
        tasks.add(task1);
        tasks.add(task2);
        tasks.add(task3);
        tasks.add(task4);
        tasks.add(task5);
        tasks.add(task6);
        tasks.add(task7);
        tasks.add(task8);
        tasks.add(task9);
        tasks.add(task10);
    }

    public ArrayList<Task> getTasks() {
        return tasks;
    }
}
