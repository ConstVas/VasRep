package com.company;

import java.util.*;

/**
 * Created by acer-pc on 30.06.2016.
 */
public class Plan {
    //составление плана
    public static void startPlane(ArrayList<Task> tasks, ArrayList<Worker> workers, int time) {
        Collections.sort(tasks);
        Worker worker;
        int minimalLoad ;

        printF(tasks);

        for (Task task : tasks){
            worker = workers.get(0);
            minimalLoad = worker.getNumberOfPlanedHours();
            for(int i = 1; i < workers.size(); i++){
                if (minimalLoad > workers.get(i).getNumberOfPlanedHours()){
                    worker = workers.get(i);
                }
            }
            worker.assignTask(task);
        }

        for (Worker worker1 : workers){
            worker1.printTimeTable();
        }

    }

    // тестовый вывод отсортированного массива методом compareTo

    public static void printF(ArrayList<Task> tasks){
        for(Task task : tasks){
            System.out.println(task.toString());
        }
    }
}

