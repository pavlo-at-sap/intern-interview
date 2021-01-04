package com.sap.interview;

import java.util.List;
import java.util.Objects;

import static com.sap.interview.CustomerService.getCustomers;

public class Application {

    public static void main(String[] args) {
        List<Customer> customers = getCustomers();

        customers.forEach(customer -> System.out.printf("%s: %.2f%n", customer.getName(), getTotal(customer)));
    }

    /*
     * Premium membership gives customer 5% total discount, Diamond - 10%.
     * Ordering more than 3 items of same product gives additional 10% of discount for that product.
     */
    public static double getTotal(Customer customer) {
        throw new RuntimeException();
    }

    enum Membership {
        REGULAR,
        PREMIUM,
        DIAMOND
    }

    static class Customer {
        private final String name;
        private final Membership membership;
        private final List<Order> orders;

        public Customer(String name, Membership membership, List<Order> orders) {
            this.name = name;
            this.membership = membership;
            this.orders = orders;
        }

        public String getName() {
            return name;
        }

        public Membership getMembership() {
            return membership;
        }

        public List<Order> getOrders() {
            return orders;
        }
    }

    static class Order {
        private final List<OrderItem> items;

        public Order(List<OrderItem> items) {
            this.items = items;
        }

        public List<OrderItem> getItems() {
            return items;
        }
    }

    static class OrderItem {
        private final Product product;
        private final int amount;

        public OrderItem(Product product, int amount) {
            this.product = product;
            this.amount = amount;
        }

        public Product getProduct() {
            return product;
        }

        public int getAmount() {
            return amount;
        }
    }

    static class Product {
        private final String title;
        private final double price;

        public Product(String title, double price) {
            this.title = title;
            this.price = price;
        }

        public String getTitle() {
            return title;
        }

        public double getPrice() {
            return price;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Product product = (Product) o;
            return Objects.equals(title, product.title);
        }
    }

}
