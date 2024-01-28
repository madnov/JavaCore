package homeWorks.src.main.homeWork4.onlineShop;

import lombok.Data;

@Data
public class Order {
    private Customer customer;
    private Product product;
    private int quantity;

    public Order(Customer customer, Product product, int quantity) {
        this.customer = customer;
        this.product = product;
        this.quantity = quantity;
    }
}
