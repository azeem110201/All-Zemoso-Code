package streams.operations;

import streams.classestoworkon.Employee;
import streams.classestoworkon.EmployeeUtil;

import java.util.List;
import java.util.Objects;

public class Filtering {
    List<Employee> employees = EmployeeUtil.createEmployees();

    public void testFiltering(){
        employees.stream()
                .filter(Employee::isExecutive)
                .filter(Employee::isSenior)
                .filter(m -> Objects.equals(m.getDepartment(), "Marketing"))
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        new Filtering().testFiltering();
    }
}
