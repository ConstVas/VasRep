package com.company;

/**
 * S.O.L.I.D. - почитать дома
 * DRY KISS YAGNI - тоже почитать дома
 *
 * */
public class Main {

    public static void main(String[] args) {
        Employees employees = new Employees();
        TasksForEmployees tasksForEmployees = new TasksForEmployees();
	    Plan.startPlane(tasksForEmployees.getTasks(), employees.getWorkers(), 8);
    }
}
