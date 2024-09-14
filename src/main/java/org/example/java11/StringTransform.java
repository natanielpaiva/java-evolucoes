package org.example.java11;

public class StringTransform {
    public static void main(String[] args) {
        // Exemplo do método stripIndent()
        String text = "   Java 11\n   é\n   muito\n   legal!";
        String stripped = text.stripIndent();
        System.out.println(stripped);
        // Saída:
        // Java 11
        // é
        // muito
        // legal!

        // Exemplo do método transform()
        String transformed = "java".transform(s -> s.toUpperCase() + " 11");
        System.out.println(transformed); // Saída: "JAVA 11"
    }
}

