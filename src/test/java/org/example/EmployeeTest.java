package org.example;

import org.junit.Test;

public class EmployeeTest {

    @Test
    public void testFindEmploye(){
        Employee employee = new Employee();
        employee.findEmployee(null,"123456789");
    }
}
