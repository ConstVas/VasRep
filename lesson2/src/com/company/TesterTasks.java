package com.company;

/**
 * Created by acer-pc on 30.06.2016.
 */
public class TesterTasks extends Task {

    public TesterTasks(int ID, int timeForEnding, Task nextTask) {
        super(ID, timeForEnding, nextTask);
    }

    public TesterTasks(int ID, int timeForEnding, Task previousTask, Task nextTask) {
        super(ID, timeForEnding, previousTask, nextTask);
    }

    public TesterTasks(int ID, int timeForEnding) {
        super(ID, timeForEnding);
    }

    public TesterTasks(int ID, int timeForEnding, int minimalStartDate) {
        super(ID, timeForEnding, minimalStartDate);
    }

    public TesterTasks(int ID, int timeForEnding, int minimalStartDate, Task previousTask) {
        super(ID, timeForEnding, minimalStartDate, previousTask);
    }

}
