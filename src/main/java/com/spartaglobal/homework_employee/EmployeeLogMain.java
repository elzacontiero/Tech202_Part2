package com.spartaglobal.homework_employee;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class EmployeeLogMain {
    private static Logger logger = LogManager.getLogger("EmployeeLogMain");
    public static void main(String[] args) {
        logger.info("Starting application EmployeeLogMain");
        var employees = EmployeeUtilities.readEmployees("employees_with_invalids.csv");
    }
}
