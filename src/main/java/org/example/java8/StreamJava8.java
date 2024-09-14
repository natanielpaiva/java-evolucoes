package org.example.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamJava8 {
    public static void main(String[] args) {
        // Lista de números inteiros
        List<Integer> numbers = Arrays.asList(3, 7, 2, 10, 5, 8, 4, 6, 1, 9);

        // Usando Stream para filtrar números pares, ordenar e coletar em uma nova lista
        List<Integer> evenNumbers = numbers.stream()
                .filter(number -> number % 2 == 0)  // Filtra números pares
                .sorted()                           // Ordena os números
                .collect(Collectors.toList());      // Coleta em uma nova lista

        // Imprimindo os números pares ordenados
        System.out.println("Números pares ordenados: " + evenNumbers);

        // Usando Stream para mapear (dobrar os números) e coletar em uma nova lista
        List<Integer> doubledNumbers = numbers.stream()
                .map(number -> number * 2)        // Dobra cada número
                .collect(Collectors.toList());    // Coleta em uma nova lista

        // Imprimindo os números dobrados
        System.out.println("Números dobrados: " + doubledNumbers);

        // Usando Stream para calcular a soma de todos os números
        int sum = numbers.stream()
                .reduce(0, (a, b) -> a + b);  // Reduz a lista somando os números

        // Imprimindo a soma dos números
        System.out.println("Soma dos números: " + sum);

        // Usando Stream para encontrar o maior número
        int max = numbers.stream()
                .max(Integer::compareTo)     // Encontra o maior número
                .orElseThrow();             // Lança exceção se não houver elementos

        // Imprimindo o maior número
        System.out.println("Maior número: " + max);
    }
}

