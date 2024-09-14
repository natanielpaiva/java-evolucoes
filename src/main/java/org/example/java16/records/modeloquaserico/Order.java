package org.example.java16.records.modeloquaserico;

public record Order(String product, int quantity, double pricePerUnit) {

    // Método para calcular o valor total do pedido
    public double totalPrice() {
        return quantity * pricePerUnit;
    }

    // Método para aplicar um desconto, retornando um novo Order
    public Order applyDiscount(double discountPercentage) {
        if (discountPercentage < 0 || discountPercentage > 100) {
            throw new IllegalArgumentException("Discount must be between 0 and 100");
        }
        double discountedPrice = pricePerUnit * (1 - discountPercentage / 100);
        return new Order(product, quantity, discountedPrice);
    }

    // Método para exibir uma descrição completa do pedido
    public String orderDescription() {
        return String.format("Product: %s, Quantity: %d, Unit Price: %.2f, Total: %.2f",
                product, quantity, pricePerUnit, totalPrice());
    }
}
