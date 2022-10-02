package org.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EmployeeTest {
    Employee employee;  // This is declaration of variable employee; but we are not creating an object here; that comes later within @Before method

    // In this case we are not using Mockito because we do not need to mock the class of Employee;
    // and we do not have other internal classes to mock (as we had when writing tests for the College class and Teacher and Student classes)
    // See Lines 5-13 of the College class. We had to declare teacher and student variables; then write a constructor method
    // No need for those here; because the source code written in Employee.java does not include declarations and constructor
    // We should not create objects for parameters; meaning do not write Mockito lines for employeeId and callerId
    // So just write the @Before method in order to avoid creating new object of class Employee within each @Test
    @Before
    public void setUp() {
        employee = new Employee();  // We are initializing the Employee object. That is the same as creating a new object of Employee class
        // This Before method will be run before each @Test is run
        // to avoid creating new object of class Employee within each @Test
        // But by using @Before, we are still creating for each @Test
    }

    @Test
    public void testFindEmployee() {
        //Employee employee = new Employee(); // create new object of class Employee; where employee is the reference to the Employee class
        // Since we have @Before we do not need to write Line 26 Employee employee = new Employee();
        String res = employee.findEmployee("1234567", "9876");
        Assert.assertEquals("Software Department", res);
    }

    @Test
    public void testFindEmployee2() {
        String res = employee.findEmployee("123456789", "9876");  // Insert the parameters
        // be sure to make the employeeId to satisfy the requirement in the if condition if(employeeId.length() > 8)
        Assert.assertEquals("IT Department", res);
    }

    @Test
    public void testFindEmployeeNull() {
        String res = employee.findEmployee(null, "9876");  // Insert the parameters
        Assert.assertEquals("Azure Department", res);

    }

    @Test
    public void testFindCallerIdGreaterThanTen() {
        String res = employee.findEmployee(null, "98765432109");  // Insert the parameters
        Assert.assertEquals("Aws Department", res);
    }

    @Test
    public void testFindCallerIdNull() {
        String res = employee.findEmployee(null, null);  // Insert the parameters
        Assert.assertEquals("no Department Found", res);
    }
}
