package entities;

import java.util.ArrayList;
import java.util.List;

import entities.enums.WorkerLevel;

public class Worker {

    private String name;
    private WorkerLevel level;
    private Double baseSalary;
    
    private Department department;
    private List<HourContract> contracts = new ArrayList<>(); //por Worker ter vários contratos, cria-se uma Lista.

    public Worker(){

    }

    public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }
    
}
