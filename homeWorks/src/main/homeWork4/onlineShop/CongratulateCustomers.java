package homeWorks.src.main.homeWork4.onlineShop;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;
import java.time.Month;

@Data
@AllArgsConstructor
public class CongratulateCustomers {

    public static void congratulateCustomers(Customer[] customers) {
        LocalDate today = LocalDate.now();
        Holiday holiday;

        if (today.getMonth() == Month.DECEMBER && today.getDayOfMonth() == 31) {
            holiday = Holiday.NEW_YEAR;
        } else if (today.getMonth() == Month.MARCH && today.getDayOfMonth() == 8) {
            holiday = Holiday.WOMEN_DAY;
        } else if (today.getMonth() == Month.FEBRUARY && today.getDayOfMonth() == 23) {
            holiday = Holiday.MEN_DAY;
        } else {
            holiday = Holiday.NONE;
        }

        for (Customer customer : customers) {

            if (holiday == Holiday.NEW_YEAR) {
                System.out.println("С Новым Годом, " + customer.getFIO() + "!");
            } else if (holiday == Holiday.WOMEN_DAY && customer.getGender() == Gender.FEMALE) {
                System.out.println("С 8 Марта, " + customer.getFIO() + "!");
            } else if (holiday == Holiday.MEN_DAY && customer.getGender() == Gender.MALE) {
                System.out.println("С Днём защитника отечества, " + customer.getFIO() + "!");
            }
        }
    }
}





