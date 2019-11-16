package com.tk.code.smartfiredetect.Model;

import java.util.PriorityQueue;

public class Employee {
    Company company;
     String employeeName;
     String employeePhone;
     String employeeEmail;
     String contactName;
     String contactPhone;
     String contactEmail;
     boolean isSafe;
     boolean isSOS;

    public Employee() {
    }

    public Employee(Company company, String employeeName, String employeePhone, String employeeEmail, String contactName, String contactPhone, String contactEmail, boolean isSafe, boolean isSOS) {
        this.company = company;
        this.employeeName = employeeName;
        this.employeePhone = employeePhone;
        this.employeeEmail = employeeEmail;
        this.contactName = contactName;
        this.contactPhone = contactPhone;
        this.contactEmail = contactEmail;
        this.isSafe = isSafe;
        this.isSOS = isSOS;
    }
}
