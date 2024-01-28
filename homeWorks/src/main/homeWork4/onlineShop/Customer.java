package homeWorks.src.main.homeWork4.onlineShop;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;


@AllArgsConstructor
@Data
public class Customer {
    private String FIO;
    private LocalDate dateOfBirth;
    private String phone;
    private Gender gender;

}
