package com.spartaglobal.homework_employee;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.List;
import java.text.SimpleDateFormat;


public class TestEmployeeUtilities {

    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

    @Test
    @DisplayName("Test creation of employee")
    public void testCreateEmployee() throws Exception {
        String input = "37682,1962-01-28,Sigeru,Akiyama,F,1990-09-17";

        Employee emp = EmployeeUtilities.createEmployee(input);

        Assertions.assertEquals(37682, emp.getEmpNo());
        Assertions.assertEquals(formatter.parse("1962-01-28"), emp.getBirthDate());
        Assertions.assertEquals("Sigeru", emp.getFirstName());
        Assertions.assertEquals("Akiyama", emp.getLastName());
        Assertions.assertEquals('F', emp.getGender());
        Assertions.assertEquals(formatter.parse("1990-09-17"), emp.getHireDate());
    }

    @Test
    @DisplayName("Test read employees")
    public void testReadEmployees() throws Exception {
        List<Employee> employees = EmployeeUtilities.readEmployees("employees_fixed.csv");
        Assertions.assertEquals(9, employees.size());

        Employee emp = employees.get(0);

        Assertions.assertEquals(37682, emp.getEmpNo());
        Assertions.assertEquals(formatter.parse("1962-01-28"), emp.getBirthDate());
        Assertions.assertEquals("Sigeru", emp.getFirstName());
        Assertions.assertEquals("Akiyama", emp.getLastName());
        Assertions.assertEquals('F', emp.getGender());
        Assertions.assertEquals(formatter.parse("1990-09-17"), emp.getHireDate());
    }

    @Test
    @DisplayName("Test the validation method passes good line")
    public void testValidateMethodPassesGoodLine() {
        String line = "22288,1962-05-19,Boriana,Vuskovic,F,1987-12-20";
        Assertions.assertTrue(EmployeeUtilities.validateEmployeeLine(line));
    }

    @Test
    @DisplayName("Test the validation method reject bad line")
    public void testValidateMethodRejectBadLine() {
        String line = "14042,1959-03-15,Valdiodio,Kleiser,X,1990-02-23";
        Assertions.assertFalse(EmployeeUtilities.validateEmployeeLine(line));
    }

}

