package streams.operations;

import streams.classestoworkon.Employee;
import streams.classestoworkon.EmployeeUtil;

import java.util.List;

public class DistictAndLimit {
    List<Employee> employees = EmployeeUtil.createEmployees();

    public void testDistinct(){
        employees.stream()
                .map(Employee::getName)
                .distinct()
                .forEach(System.out::println);
    }

    public void testLimit(){
        employees.stream()
                .map(Employee::getName)
                .limit(3)
                .distinct()
                .forEach(System.out::println);
    }
    public static void main(String[] args) {
        new DistictAndLimit().testDistinct();
        new DistictAndLimit().testLimit();
    }
}
