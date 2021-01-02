package com.sap.interview;

import java.util.Arrays;
import java.util.List;

import static com.sap.interview.Application.*;

public class CustomerService {

    public static List<Customer> getCustomers() {
        Product tomato = new Product("Tomato", 12.0);
        Product carrot = new Product("Carrot", 7.5);
        Product potato = new Product("Potato", 3.25);
        Product cucumber = new Product("Cucumber", 9.75);
        OrderItem item1 = new OrderItem(tomato, 2);
        OrderItem item2 = new OrderItem(carrot, 4);
        OrderItem item3 = new OrderItem(potato, 1);
        OrderItem item4 = new OrderItem(cucumber, 9);
        OrderItem item5 = new OrderItem(tomato, 3);
        OrderItem item6 = new OrderItem(carrot, 5);
        OrderItem item7 = new OrderItem(potato, 7);
        OrderItem item8 = new OrderItem(cucumber, 6);
        Order order1 = new Order(Arrays.asList(item1, item3));
        Order order2 = new Order(Arrays.asList(item2, item8, item6));
        Order order3 = new Order(Arrays.asList(item4, item5, item7));
        return Arrays.asList(new Customer("Jake", Membership.DIAMOND, Arrays.asList(order1, order2, order3)),
                new Customer("John", Membership.PREMIUM, Arrays.asList(order1, order2, order3)),
                new Customer("July", Membership.REGULAR, Arrays.asList(order1, order2, order3)));
    }
}
