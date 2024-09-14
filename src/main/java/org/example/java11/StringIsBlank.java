package org.example.java11;

public class StringIsBlank {
    public static void main(String[] args) {
        String empty = "";
        String spaces = "   ";
        String text = "Java";

        System.out.println(empty.isBlank());  // true
        System.out.println(spaces.isBlank()); // true
        System.out.println(text.isBlank());   // false
    }
}

