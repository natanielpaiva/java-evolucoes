package org.example.java8;

import java.util.function.Predicate;

public class PredicateJava8 {
    public static void main(String[] args) {
        // Predicate que testa se um número é positivo
        Predicate<Integer> isPositive = number -> number > 0;

        System.out.println("É positivo? " + isPositive.test(10));  // true
        System.out.println("É positivo? " + isPositive.test(-10)); // false
    }
}

