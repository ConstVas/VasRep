package com.company;

import java.util.ArrayList;

/**
 * Created by acer-pc on 30.06.2016.
 */
//а тут у нас инициализируются работники
public class Employees {
    Worker Ivan = new Tester("Ivan", 8);
    Worker Nikita = new Tester("Nikita", 8);
    Worker Vasya = new Tester("Vasya", 8);
    Worker Anton = new Tester("Anton", 8);
    Worker Igor = new Tester("Igor", 8);

    ArrayList<Worker> workers = new ArrayList<>();

    public Employees(){
        workers.add(Ivan);
        workers.add(Nikita);
        workers.add(Vasya);
        workers.add(Anton);
        workers.add(Igor);
    }

    public ArrayList<Worker> getWorkers() {
        return workers;
    }
}
