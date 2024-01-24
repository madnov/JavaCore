package homeWorks.src.main.homeWork3;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Ivan Petrov",
                "devops",
                "+79765463452",
                BigDecimal.valueOf(100000),
                LocalDate.of(1990, 1, 1),
                new int[]{2005, 12, 25});

        Employee employee2 = new Employee("Vasiliy Petrov",
                "programmer",
                "+79765463452",
                BigDecimal.valueOf(200000),
                LocalDate.of(1990, 1, 1),
                new int[]{2012, 2, 15});

        Employee employee3 = new Employee("Ivan Ivanov",
                "engineer",
                "+79765463452",
                BigDecimal.valueOf(60000),
                LocalDate.of(1990, 1, 1),
                new int[]{2020, 10, 30});

        Employee employee4 = new Employee("Ivan Sidorov",
                "analyst",
                "+79765463452",
                BigDecimal.valueOf(50000),
                LocalDate.of(1990, 1, 1),
                new int[]{2017, 5, 20});

        Employee employee5 = new Employee("Petr Petrov",
                "team lead",
                "+79765463452",
                BigDecimal.valueOf(300000),
                LocalDate.of(1975, 1, 1),
                new int[]{2000, 9, 11});

        Manager manager1 = new Manager("Maksim Sidorov",
                "manager",
                "+375322342343",
                BigDecimal.valueOf(500000),
                LocalDate.of(1984, 8, 11),
                new int[]{2010, 6, 14});

        List<Employee> employees = new ArrayList<>(Arrays.asList(employee1, employee2, employee3, employee4, employee5));

        for (Employee employee : employees) {
            employee.printInfo();
        }

        salaryIncreaseForEmployees(employees, 45, 30000);
        System.out.println();

        for (Employee employee : employees) {
            employee.printInfo();
        }

        System.out.println(getAverageSalaryAndAge(employees));

    }

    public static void salaryIncreaseForEmployees(List<Employee> employees, int ageOlder, int bonusValue) {
        for (Employee employee : employees) {
            if (employee.getAge() > ageOlder) {
                employee.increaseSalary(bonusValue);
            }
        }
    }

    public static String getAverageSalaryAndAge(List<Employee> employees) {
        double averageSalaries = employees.stream().mapToDouble(x -> x.getSalary().doubleValue()).average().orElseThrow();
        double averageAge = employees.stream().mapToDouble(x -> (double) x.getAge()).average().orElseThrow();

        return String.format("Average salary - %s, age - %s", averageSalaries, averageAge);

    }

    public static AverageResponseDTO getAverage(List<Employee> employees) {
        return AverageResponseDTO.builder()
                .averageAge(employees.stream().mapToDouble(x -> (double) x.getAge()).average().orElseThrow())
                .averageSalary(employees.stream().mapToDouble(x -> x.getSalary().doubleValue()).average().orElseThrow())
                .averageLettersInFIO((int) employees.stream().mapToInt(x -> x.getFIO().length()).average().orElseThrow())
                .build();
    }

}
