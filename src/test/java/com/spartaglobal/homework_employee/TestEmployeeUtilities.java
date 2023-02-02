package com.spartaglobal.homework_employee;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import com.spartaglobal.homework_employee.Employee;
import com.spartaglobal.homework_employee.EmployeeUtilities;
import java.util.List;
import java.text.SimpleDateFormat;

public class TestEmployeeUtilities {

    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

    @Test
    @DisplayName("Test creation of employee")
    public void testCreateEmployee() throws Exception {
        String input = "37682,28/01/1962,Sigeru,Akiyama,F,17/09/1990";

        Employee emp = EmployeeUtilities.createEmployee(input);

        Assertions.assertEquals(37682, emp.getEmpNo());
        Assertions.assertEquals(formatter.parse("28/01/1962"), emp.getBirthDate());
        Assertions.assertEquals("Sigeru", emp.getFirstName());
        Assertions.assertEquals("Akiyama", emp.getLastName());
        Assertions.assertEquals('F', emp.getGender());
        Assertions.assertEquals(formatter.parse("17/09/1990"), emp.getHireDate());
    }

    @Test
    @DisplayName("Test read employees")
    public void testReadEmployees() throws Exception {
        List<Employee> employees = EmployeeUtilities.readEmployees("employees.csv");
        Assertions.assertEquals(10, employees.size());

        Employee emp = employees.get(0);

        Assertions.assertEquals(37682, emp.getEmpNo());
        Assertions.assertEquals(formatter.parse("28/01/1962"), emp.getBirthDate());
        Assertions.assertEquals("Sigeru", emp.getFirstName());
        Assertions.assertEquals("Akiyama", emp.getLastName());
        Assertions.assertEquals('F', emp.getGender());
        Assertions.assertEquals(formatter.parse("17/09/1990"), emp.getHireDate());
    }

}
