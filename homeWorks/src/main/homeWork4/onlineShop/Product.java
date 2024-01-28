package homeWorks.src.main.homeWork4.onlineShop;

import lombok.Data;

import java.math.BigDecimal;
@Data
public class Product {
    private String name;
    private BigDecimal price;

    public Product(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }
}