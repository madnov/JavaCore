package homeWorks.src.main.homeWork3;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;
import java.util.Comparator;

//@Getter
//@Setter
@AllArgsConstructor
//@EqualsAndHashCode
//@ToString
@Data
public class Employee {
    private String FIO;
    private String position;
    private String phone;
    private BigDecimal salary;
    private LocalDate birthDate;
    private int[] startDate;

    public Employee(String FIO, BigDecimal salary) {
    }




    public int getAge() {
        LocalDate currentDate = LocalDate.now();
        return Period.between(birthDate, currentDate).getYears();
    }


    public static Comparator<Employee> dateComparator = new Comparator<Employee>() {
        @Override
        public int compare(Employee e1, Employee e2) {
            for (int i = 0; i < 3; i++) {
                if (e1.getStartDate()[i] < e2.getStartDate()[i]) {
                    return -1;
                } else if (e1.getStartDate()[i] > e2.getStartDate()[i]) {
                    return 1;
                }
            }
            return 0;
        }
    };


    public void printInfo() {
        System.out.println(this);
    }

    public void increaseSalary(int value) {
        this.salary = salary.add(BigDecimal.valueOf(value));
    }

}