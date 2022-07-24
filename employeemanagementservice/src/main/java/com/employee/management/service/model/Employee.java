package com.employee.management.service.model;

public class Employee {
    

    private long employeeNumber;
    private String employeeName;
    private String employeeEmail;
    private long employeeDeptId;
    private long employeeManagerId;
    private boolean isManager;
    public Employee() {
    }
    public Employee(long employeeNumber, String employeeName, String employeeEmail, long employeeDeptId,
            long employeeManagerId, boolean isManager) {
        this.employeeNumber = employeeNumber;
        this.employeeName = employeeName;
        this.employeeEmail = employeeEmail;
        this.employeeDeptId = employeeDeptId;
        this.employeeManagerId = employeeManagerId;
        this.isManager = isManager;
    }
    public long getEmployeeNumber() {
        return employeeNumber;
    }
    public void setEmployeeNumber(long employeeNumber) {
        this.employeeNumber = employeeNumber;
    }
    public String getEmployeeName() {
        return employeeName;
    }
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
    public String getEmployeeEmail() {
        return employeeEmail;
    }
    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail;
    }
    public long getEmployeeDeptId() {
        return employeeDeptId;
    }
    public void setEmployeeDeptId(long employeeDeptId) {
        this.employeeDeptId = employeeDeptId;
    }
    public long getEmployeeManagerId() {
        return employeeManagerId;
    }
    public void setEmployeeManagerId(long employeeManagerId) {
        this.employeeManagerId = employeeManagerId;
    }
    public boolean isManager() {
        return isManager;
    }
    public void setManager(boolean isManager) {
        this.isManager = isManager;
    }
    @Override
    public String toString() {
        return "Employee [employeeDeptId=" + employeeDeptId + ", employeeEmail=" + employeeEmail
                + ", employeeManagerId=" + employeeManagerId + ", employeeName=" + employeeName + ", employeeNumber="
                + employeeNumber + ", isManager=" + isManager + "]";
    }

    
}
