package org.example.java8;

public class FunctionalInterfaceJava8 {
    public static void main(String[] args) {
        // Usando a interface funcional para adição
        Calculator addition = (a, b) -> a + b;
        int result1 = addition.calculate(10, 5);
        System.out.println("Resultado da adição: " + result1);

        // Usando a interface funcional para subtração
        Calculator subtraction = (a, b) -> a - b;
        int result2 = subtraction.calculate(10, 5);
        System.out.println("Resultado da subtração: " + result2);

        // Usando a interface funcional para multiplicação
        Calculator multiplication = (a, b) -> a * b;
        int result3 = multiplication.calculate(10, 5);
        System.out.println("Resultado da multiplicação: " + result3);

        // Usando a interface funcional para divisão
        Calculator division = (a, b) -> a / b;
        int result4 = division.calculate(10, 5);
        System.out.println("Resultado da divisão: " + result4);
    }
}

