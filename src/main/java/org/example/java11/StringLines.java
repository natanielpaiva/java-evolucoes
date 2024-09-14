package org.example.java11;

public class StringLines {
    public static void main(String[] args) {
        String multiLineText = "Java 11\né\nmuito\nlegal!";

        multiLineText.lines().forEach(System.out::println);
        // Saída:
        // Java 11
        // é
        // muito
        // legal!
    }
}

