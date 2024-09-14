package org.example.java12a15;

public class Switch {
    public static void main(String[] args) {
        // Definindo um dia da semana
        String day = "TUESDAY";

        // Usando Switch Expressions para determinar o tipo de dia
        String typeOfDay = switch (day) {
            case "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY" -> "Dia da semana";
            case "SATURDAY", "SUNDAY" -> "Final de semana";
            default -> "Dia inválido";
        };

        // Imprimindo o resultado
        System.out.println(day + " é um " + typeOfDay);
    }
}

