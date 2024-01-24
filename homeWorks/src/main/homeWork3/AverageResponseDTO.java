package homeWorks.src.main.homeWork3;

import lombok.Builder;
import lombok.Data;

@Data
@Builder


public class AverageResponseDTO {
    private double averageSalary;
    private double averageAge;
    private int averageLettersInFIO;

}
