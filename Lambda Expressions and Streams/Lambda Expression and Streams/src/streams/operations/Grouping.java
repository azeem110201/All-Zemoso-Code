package streams.operations;

import streams.classestoworkon.Employee;
import streams.classestoworkon.EmployeeUtil;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class Grouping {
    List<Employee> employees = EmployeeUtil.createDetailedEmployees();

    public void groupByDepartment(){
        Map<String, List<Employee>> employee =  employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));

        employee.forEach((a, b) -> {
            System.out.println(a + ":" + b);
        });
    }

    public void groupByCity(){
        Map<String, List<Employee>> employee =  employees.stream()
                .collect(Collectors.groupingBy(Employee::getCity));

        employee.forEach((a, b) -> {
            System.out.println(a + ":" + b);
        });
    }

    public void groupByNested(){
        Map<String, Map<String, List<Employee>>>employee = employees.stream()
                .collect(Collectors.groupingBy((Employee::getDepartment), Collectors.groupingBy(Employee::getCity)));

        employee.forEach((a, b) -> {
            System.out.println(a);
            b.forEach((x, y) -> {
                System.out.println(x + ":" + y);
            });
        });

    }

    public static void main(String[] args) {
        new Grouping().groupByDepartment();
        new Grouping().groupByCity();
        new Grouping().groupByNested();
    }
}
