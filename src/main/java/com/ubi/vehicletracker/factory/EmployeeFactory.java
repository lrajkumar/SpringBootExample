package com.ubi.vehicletracker.factory;

public class EmployeeFactory {

    public static Employee create(int id, String name) {
        return new Employee(id, name);
    }

}
