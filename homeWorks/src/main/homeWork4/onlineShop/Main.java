package homeWorks.src.main.homeWork4.onlineShop;

import exceptions.CustomerNotExistException;
import exceptions.ProductNotExistException;
import exceptions.QuantityException;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
public class Main {
    public static void main(String[] args) throws CustomerNotExistException, ProductNotExistException, QuantityException {
        System.out.println("online shop");

        Customer[] customers = {
                new Customer("Ivanova Sveta",
                        LocalDate.of(1989, 10, 8),
                        "+373289234156",
                        Gender.FEMALE),
                new Customer("Sidorov Vitalik",
                        LocalDate.of(1999, 3, 23),
                        "+23451532553",
                        Gender.MALE)
        };

        OnlineShop.getCustomerList().add(new Customer("Ivanov Ivan",
                LocalDate.of(1987, 12, 9),
                "+9867566473",
                Gender.MALE));
        OnlineShop.getCustomerList().add(new Customer("Petrov Petr",
                LocalDate.of(1988, 12, 20),
                "+9867566475",
                Gender.MALE));
        OnlineShop.getProductList().add(new Product("apple", BigDecimal.valueOf(10L)));
        OnlineShop.getProductList().add(new Product("pineapple", BigDecimal.valueOf(50L)));


        try {
            Order order = null;
            order = OnlineShop.buyProduct("Ivanov Ivan", "apple", "20");


            OnlineShop.getOrderList().add(order);
            System.out.println(OnlineShop.getOrderList());

            Order order2 = OnlineShop.buyProduct("Ivanov Ivan", "apple", "20");
            OnlineShop.getOrderList().add(order2);
            System.out.println(OnlineShop.getOrderList());

            Order order3 = OnlineShop.buyProduct("Petrov Petr", "pineapple", "300");
            OnlineShop.getOrderList().add(order3);


        } catch (QuantityException e) {
            OnlineShop.getOrderList().add(OnlineShop.buyProduct(e.getCustomer(), e.getProduct(), "1"));
        } catch (ProductNotExistException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            throw e;
        }

        System.out.println(OnlineShop.getOrderList());
        System.out.println(OnlineShop.getOrderList().size() + " orders received");

    }


}