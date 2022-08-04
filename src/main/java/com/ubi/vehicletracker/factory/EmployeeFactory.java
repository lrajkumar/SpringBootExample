package com.ubi.vehicletracker.factory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EmployeeFactory {

    private static Logger logger = LoggerFactory.getLogger(EmployeeFactory.class);

    public static Employee create(int id, String name) {
        logger.warn("Creating new employee");
        return new Employee(id, name);
    }

}
