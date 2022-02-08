package streams.operations;

import streams.classestoworkon.Employee;
import streams.classestoworkon.EmployeeUtil;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Partitioning {
    List<Employee> employees = EmployeeUtil.createEmployees();

    public void partitionByExecutives() {
        Map<Boolean, List<Employee>> empPartition =
                employees.stream().collect(Collectors.partitioningBy(Employee::isExecutive));

        System.out.println(empPartition);
    }

    public void partitioningAndGrouping() {
        Map<Boolean, Map<String, List<Employee>>> execEmployees =
                employees.stream()
                        .collect(Collectors.partitioningBy((Employee::isExecutive), Collectors.groupingBy(Employee::getDepartment)));

        for(Boolean b: execEmployees.keySet()){
            System.out.println(b+" --> "+execEmployees.get(b));
        }

    }

    public void partitioningMultiLevel() {
        Map<Boolean, Map<Boolean, List<Employee>>> execEmployees =
                employees.stream()
                        .collect(Collectors.partitioningBy((Employee::isExecutive), Collectors.partitioningBy(Employee::isSenior)));

        for(Boolean b: execEmployees.keySet()){
            System.out.println(b+" ==> "+execEmployees.get(b));
        }
    }

    public static void main(String[] args) {
        new Partitioning().partitionByExecutives();
        new Partitioning().partitioningAndGrouping();
        new Partitioning().partitioningMultiLevel();
    }
}
