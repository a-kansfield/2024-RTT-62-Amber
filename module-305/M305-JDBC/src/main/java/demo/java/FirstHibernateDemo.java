package demo.java;

import demo.java.database.dao.EmployeeDAO;
import demo.java.database.entity.Employee;

public class FirstHibernateDemo {

    public static void main(String[] args) {
        EmployeeDAO employeeDAO = new EmployeeDAO();

//        List<Employee> employees = employeeDAO.findByFirstName("Leslie");
//        for (Employee employee : employees) {
//            System.out.println(employee);
//        }
//
//        // Creates a new employee in the database
//        Employee newEmployee = new Employee();
//
//        newEmployee.setFirstname("Karl");
//        newEmployee.setLastname("Marx");
//        newEmployee.setEmail("rtt62@perscholas.org");
//        newEmployee.setOfficeId(3);
//        newEmployee.setExtension("X12345");
//        newEmployee.setJobTitle("Newbie");
//        newEmployee.setVacationHours(0);
//
//        employeeDAO.insert(newEmployee);

        Employee employee = employeeDAO.findById(1056);
        System.out.println(employee);

        employee = employeeDAO.findById(1);
        System.out.println(employee);
    }
}
