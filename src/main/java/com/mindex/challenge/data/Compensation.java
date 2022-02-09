package com.mindex.challenge.data;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
*
* String compensationId: it is taken as string because ids can be varchar
*
* Employee employee
*
* double Salary: Salary is taken as double instead of integers just in case if someone has a fractional salary
*
* Date effDate: I have used @JsonFormat which is really helpful to maintain a particular format for the effective date
*
* */

public class Compensation {

    public String compensationId;

    public Employee employee;

    public double salary;

    @JsonFormat(pattern="MM-dd-yyyy")
    private Date effdate;

    public String getCompensationId() {
        return compensationId;
    }

    public void setCompensationId(String compensationId) {
        this.compensationId = compensationId;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Date getEffdate() {
        return effdate;
    }

    public void setEffdate(Date effdate) {
        this.effdate = effdate;
    }
}
