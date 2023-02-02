package com.spartaglobal.homework_employee;

import com.spartaglobal.fileIO.TextFileIO;
import java.util.List;
import java.util.ArrayList;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;


public class EmployeeUtilities {

    // dateFormat created once and used as many times needed.
    private static SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

    public static Employee createEmployee(String line) {

        String[] fields = line.split(",");
        Employee emp = null;
        try {
            int empNo = Integer.parseInt(fields[0]);
            Date birthDate = dateFormat.parse(fields[1]);
            String firstName = fields[2];
            String lastName = fields[3];
            char gender = fields[4].charAt(0);
            Date hireDate = dateFormat.parse(fields[5]);

            emp = new Employee(empNo, birthDate, firstName, lastName, gender, hireDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return emp;
    }

    public static ArrayList<Employee> readEmployees(String fileName) {
        String[] lines = TextFileIO.readFile(fileName);
        ArrayList<Employee> result = new ArrayList<>();
        for (String line : lines) {
            // Make use of method createEmployee above and saves to emp.
            Employee emp = createEmployee(line);
            result.add(emp);
        }
        return result;
    }
}


