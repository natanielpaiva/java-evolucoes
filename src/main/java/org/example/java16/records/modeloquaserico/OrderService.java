package org.example.java16.records.modeloquaserico;

public class OrderService {
    public static void main(String[] args) {
        Order order = new Order("Laptop", 2, 1200.00);

        // Calcula o valor total do pedido
        System.out.println("Total Price: " + order.totalPrice());

        // Aplica um desconto de 10%
        Order discountedOrder = order.applyDiscount(10);
        System.out.println("Discounted Order: " + discountedOrder.orderDescription());
    }
}