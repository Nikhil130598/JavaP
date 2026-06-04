package work.Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeData {

    public static void main(String[] args){

        List<Employee> empData = Arrays.asList(new Employee(101, "Microsoft", 32450.50),
                new Employee(201, "Google", 45675.86),
                new Employee(301, "TCS", 35000)
        );

        empData.stream()
                .filter(e -> e.getEmpId()==201)
                .forEach(System.out :: println);

        empData.stream()
                .map(Employee::getCompanyName)
                .forEach(System.out :: println);

        empData.stream()
                .sorted(Comparator.comparing(Employee :: getEmpSalary))
                .forEach(System.out :: println);

        Employee highnet = empData.stream()
                .max(Comparator.comparing(Employee :: getEmpSalary))
                .get();
        System.out.println("Highest Paid employee details " +  " = " + highnet);

        double avg = empData.stream()
                .collect(Collectors.averagingDouble(Employee::getEmpSalary));
        System.out.println("Avg Salary " + avg);

    }
}
