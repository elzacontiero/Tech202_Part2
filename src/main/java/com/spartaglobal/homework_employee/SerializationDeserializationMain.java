package com.spartaglobal.homework_employee;

import java.io.IOException;

public class SerializationDeserializationMain {
    public static void main(String[] args) throws IOException  {
        var employees = EmployeeUtilities.readEmployees("employees_fixed.csv");
        // takes the list of employees and saves to file 'employees.json' and 'employees.xml'
        EmployeeUtilities.saveToJsonFile(employees, "employees.json");
        EmployeeUtilities.saveToXmlFile(employees, "employees.xml");

        // Reads back the contents of files 'employees.json' and save list to variable.
        System.out.println("Reading from JSON ---------- ");
        var employees1 = EmployeeUtilities.loadFromJsonFileToObject("employees.json");
        System.out.println(employees1);
        System.out.println("Reading from XML ---------- ");
        var employees2 = EmployeeUtilities.loadFromXmlFileToObject("employees.xml");
        System.out.println(employees2);
    }
}
