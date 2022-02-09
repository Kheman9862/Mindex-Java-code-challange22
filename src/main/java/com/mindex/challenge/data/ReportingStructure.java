package com.mindex.challenge.data;

/**
*
* Employee employee
*
* int numberOfReports : Calculating number of reports so integer.
*
* */

public class ReportingStructure {

    public Employee employee;

    public int numberOfReports;

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public int getNumberOfReports() {
        return numberOfReports;
    }

    public void setNumberOfReports(int numberOfReports) {
        this.numberOfReports = numberOfReports;
    }
}
