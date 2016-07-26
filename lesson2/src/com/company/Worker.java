package com.company;

/**
 * Created by acer-pc on 29.06.2016.
 */
abstract public class Worker {
    private String name;
    private int rate = 8;
    private int planTime = 5;

    Task[] arrayOfTime = new Task[planTime*rate];

    public Worker(String name, int rate) {
        this.name = name;
        this.rate = rate;
    }

    public void assignTask(Task task){
        int hoursLeft = task.getTimeForEnding();
        for (int i = 0; i < arrayOfTime.length; i++){
            if (arrayOfTime[i] == null && hoursLeft != 0){
                arrayOfTime[i] = task;
                hoursLeft--;
            }
        }
        task.setAssignedWorker(this);
    }

    public int getNumberOfPlanedHours(){
        int sum = 0;
        for(Task a : arrayOfTime){
            if (a != null){
                sum++;
            }
        }
        return sum;
    }
    public int getPlaneTime() {
        return planTime;
    }

    public void setPlaneTime(int planeTime) {
        this.planTime = planeTime;
    }

    public String getName() {
        return name;
    }

    public int getRate() {
        return rate;
    }

    public Task[] getArrayOfTime() {
        return arrayOfTime;
    }

    public void setArrayOfTime(Task[] arrayOfTime) {
        this.arrayOfTime = arrayOfTime;
    }

    public void printTimeTable(){
        System.out.println("Расписание работника " + this.name);
        for (Task task : arrayOfTime){
            System.out.print((task != null ? task.getID() : "-") + ", " );
        }
        System.out.println();
    }
}
