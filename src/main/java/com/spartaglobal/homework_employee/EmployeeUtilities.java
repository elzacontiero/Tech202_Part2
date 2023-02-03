package com.spartaglobal.homework_employee;

import com.spartaglobal.fileIO.TextFileIO;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;
import java.util.regex.Pattern;


public class EmployeeUtilities {

    private static Logger logger = LogManager.getLogger("EmployeeUtilities");
    // dateFormat created once and used as many times needed.
    private static SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

    /**
     * The input is a String line, because we can't receive an Employee
     * object as it would have been already parsed just fine.
     */
    public static boolean validateEmployeeLine(String line) {
        String[] fields = line.split(",");
        if (fields.length != 6) {
            return false;
        }
        // Check if fields[0] is number (employee number)
        if (!Pattern.matches("\\d+", fields[0])) { // Matches if is a digit (\d) and one or more (+)
            return false;
        }

        // Check if fields[1] matches yyyy-mm-dd (date of birth)
        if (!Pattern.matches("\\d\\d\\d\\d-\\d\\d-\\d\\d", fields[1])) {
            return false;
        }

        // Check if fields[2] is word (first name)
        if (!Pattern.matches("\\w+", fields[2])) {
            return false;
        }

        // Check if fields[3] is word (last name)
        if (!Pattern.matches("\\w+", fields[3])) {
            return false;
        }

        // Check if fields[4] matches 'F' or 'M' (gender)
        if (!Pattern.matches("F|M", fields[4])) {
            return false;
        }

        // Check if fields[5] matches yyyy-mm-dd (date of hire)
        if (!Pattern.matches("\\d\\d\\d\\d-\\d\\d-\\d\\d", fields[5])) {
            return false;
        }

        return true;
    }



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
        ArrayList<String> faultyLines = new ArrayList<>();
        String[] lines = TextFileIO.readFile(fileName);
        ArrayList<Employee> result = new ArrayList<>();
        for (String line : lines) {
            if (validateEmployeeLine(line)) {
                // Make use of method createEmployee above and saves to emp.
                Employee emp = createEmployee(line);
                result.add(emp);
            }
            else {
                logger.warn("Invalid input line: " + line);
                faultyLines.add(line);
            }
        }
        return result;
    }
}


