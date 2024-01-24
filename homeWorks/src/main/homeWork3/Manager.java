package homeWorks.src.main.homeWork3;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Manager extends Employee {
    public Manager(String FIO,
                   String position,
                   String phone,
                   BigDecimal salary,
                   LocalDate birthdate,
                   int[] startDate) {
        super(FIO,
                position,
                phone,
                salary,
                birthdate,
                startDate);
    }

    public static void increaseSalaryExceptManager(Employee[] employees, BigDecimal bonus) {
        for (Employee employee : employees) {
            if (!(employee instanceof Manager)) {
                BigDecimal newSalary = employee.getSalary().add(bonus);
                employee.setSalary(newSalary);
            }
        }
    }
}
