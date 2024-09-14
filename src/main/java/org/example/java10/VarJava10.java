package org.example.java10;

import java.util.List;
import java.util.Map;

public class VarJava10 {
    public static void main(String[] args) {
        // Usando var para inferir tipos primitivos
        var number = 10;        // int
        var text = "Hello";     // String
        var decimal = 10.5;     // double
        var flag = true;        // boolean

        System.out.println("Número: " + number);
        System.out.println("Texto: " + text);
        System.out.println("Decimal: " + decimal);
        System.out.println("Flag: " + flag);

        // Usando var com coleções
        var list = List.of("Java", "Kotlin", "Scala"); // Lista de Strings
        System.out.println("Lista: " + list);

        // Usando var com map
        var map = Map.of("chave1", 1, "chave2", 2);    // Mapa de Strings para Inteiros
        System.out.println("Mapa: " + map);

        // Usando var com loops
        for (var item : list) {
            System.out.println("Item: " + item);
        }
    }
}

