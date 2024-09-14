package org.example.java11;

public class StringStrip {
    public static void main(String[] args) {
        String str = "   Java 11   ";

        System.out.println("'" + str.strip() + "'");          // Saída: 'Java 11'
        System.out.println("'" + str.stripLeading() + "'");   // Saída: 'Java 11   '
        System.out.println("'" + str.stripTrailing() + "'");  // Saída: '   Java 11'
    }
}

