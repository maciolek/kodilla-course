package com.kodilla.patterns2.adapter.company.newhrsystem;

import java.math.BigDecimal;
import java.util.Objects;

public class Employee {

    private String pesel;
    private String firstName;
    private String lastName;
    private BigDecimal baseSalary;

    public Employee(String pesel, String firstName, String lastName, BigDecimal baseSalary) {
        this.pesel = pesel;
        this.firstName = firstName;
        this.lastName = lastName;
        this.baseSalary = baseSalary;
    }

    public String getPesel() {
        return pesel;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public BigDecimal getBaseSalary() {
        return baseSalary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(pesel, employee.pesel) &&
                Objects.equals(firstName, employee.firstName) &&
                Objects.equals(lastName, employee.lastName) &&
                Objects.equals(baseSalary, employee.baseSalary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pesel, firstName, lastName, baseSalary);
    }

    @Override
    public String toString() {
        return "Employee, firstname: " + firstName
                + " lastname: " + lastName
                + " PESEL: " + pesel
                + " salary: " + baseSalary;
    }
}
