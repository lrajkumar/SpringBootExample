package com.ubi.vehicletracker.factory;

public class UseEmployee {

    public static void main(String[] args) {
        //Employee employee = new Employee(1, "Raj");

        Employee employee = EmployeeFactory.create(1, "Raj");

        /*employee.setId(1);
        employee.setName("Raj");
*/
        System.out.println(employee);
    }

}
