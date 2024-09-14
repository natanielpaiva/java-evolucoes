package org.example.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaJava8 {
    public static void main(String[] args) {
        // Lista de nomes
        List<String> names = new ArrayList<>();
        names.add("Nataniel");
        names.add("Carlos");
        names.add("Ana");
        names.add("Beatriz");
        names.add("Pedro");

        // Usando lambda para filtrar nomes que começam com 'A'
        List<String> filteredNames = names.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());

        // Imprimindo os nomes filtrados
        System.out.println("Nomes que começam com 'A': " + filteredNames);

        // Usando lambda para transformar os nomes em letras maiúsculas
        List<String> upperCaseNames = names.stream()
                .map(name -> name.toUpperCase())
                .collect(Collectors.toList());

        // Imprimindo os nomes em letras maiúsculas
        System.out.println("Nomes em maiúsculas: " + upperCaseNames);
    }
}

