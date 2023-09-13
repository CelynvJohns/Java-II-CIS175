package tests;

import org.junit.Before;
import org.junit.Test;

import model.EmpBusinessLogic;
import model.Employee;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestEmployeeLogic {
    EmpBusinessLogic empBL = new EmpBusinessLogic();
    Employee employee = new Employee("Emily", 0, 0); // I put in zeros as place holders so that there would be no errors and minimal changes

    @Before
    public void setUp() throws Exception {
        // Set up any necessary test fixtures or configurations here
    }

    @Test
    public void testCalculateAppraisal() {
        employee.setMonthlySalary(8000);
        double appraisal = empBL.calculateAppraisal(employee);
        assertEquals(500, appraisal, 0.0);
    }

    @Test
    public void testCalculateYearlySalary() {
        employee.setMonthlySalary(8000);
        double salary = empBL.calculateYearlySalary(employee);
        assertEquals(96000, salary, 0.0);
    }
    
    @Test
    public void testEmployeeIsRetirementAge() {
        employee.setAge(70);
        assertTrue(empBL.isRetirementAge(employee));
    }

    @Test
    public void testEmployeeIsNotRetirementAge() {
        employee.setAge(25);
        assertFalse(empBL.isRetirementAge(employee));
    }
}
