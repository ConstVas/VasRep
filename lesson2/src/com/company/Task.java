package com.company;

import java.util.HashMap;

/**
 * Created by acer-pc on 29.06.2016.
 */
public abstract class Task implements Comparable<Task>{

    // конструкторы, приоритеты
    private int ID = 0;
    private int minimalStartDate = 0;
    private Task previousTask = null;
    private Task nextTask = null;
    private int timeForEnding = 0;
    private Worker assignedWorker = null;
    private int priority;

    private static final int ultraPriority = 0;
    private static final int highPriority = 1;
    private static final int mediumPriority = 2;
    private static final int lowPriority = 3;

    public Task(int ID, int timeForEnding, Task nextTask) {
        this.ID = ID;
        this.nextTask = nextTask;
        this.timeForEnding = timeForEnding;
        definePriority();
    }

    public Task(int ID, int timeForEnding, Task nextTask, Task previousTask) {
        this.ID = ID;
        this.nextTask = nextTask;
        this.previousTask = previousTask;
        this.timeForEnding = timeForEnding;
        definePriority();
    }

    public Task(int ID, int timeForEnding){
        this.ID = ID;
        this.timeForEnding = timeForEnding;
        definePriority();
    }

    public Task(int ID, int timeForEnding, int minimalStartDate) {
        this.ID = ID;
        this.timeForEnding = timeForEnding;
        this.minimalStartDate = minimalStartDate;
        definePriority();
    }

    public Task(int ID, int timeForEnding, int minimalStartDate, Task previousTask) {
        this.ID = ID;
        this.timeForEnding = timeForEnding;
        this.previousTask = previousTask;
        this.minimalStartDate = minimalStartDate;
        definePriority();
    }

    public Task(int ID, int timeForEnding, Task nextTask, Task previousTask, int minimalStartDate) {
        this.timeForEnding = timeForEnding;
        this.nextTask = nextTask;
        this.previousTask = previousTask;
        this.ID = ID;
        this.minimalStartDate = minimalStartDate;
        definePriority();
    }

    // красиво красиво
    @Override
    public int compareTo(Task o) {
        if (this.priority > o.priority)
            return 1;
        else if (this.priority < o.priority){
            return -1;
        } else if (this.timeForEnding > o.timeForEnding){
            return -1;
        } else if (this.timeForEnding < o.timeForEnding){
            return  1;
        } else return 0;

    }

    //Определение приоритета
    public void definePriority(){
        if(minimalStartDate != 0){
            priority = mediumPriority;
            return;
        }
        if (nextTask != null){
            priority = ultraPriority;
            if (previousTask != null){
                priority = highPriority;
            }
            return;
        } else priority = lowPriority;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public void setPreviousTask(Task previousTask) {
        this.previousTask = previousTask;
    }

    public Worker getAssignedWorker() {
        return assignedWorker;
    }

    public void setAssignedWorker(Worker assignedWorker) {
        this.assignedWorker = assignedWorker;
    }

    public int getID() {
        return ID;
    }

    public int getMinimalStartDate() {
        return minimalStartDate;
    }

    public Task getPreviousTask() {
        return previousTask;
    }

    public int getTimeForEnding() {
        return timeForEnding;
    }

    public Task getNextTask() {
        return nextTask;
    }

    public String toString() {
        return "Номер " + ID + " Приоритет: " + Integer.toString(priority) + " Время работы " + timeForEnding + ".";
    }

}
