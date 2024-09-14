package org.example.java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateTimeJava8 {
    public static void main(String[] args) {
        // Criando uma data (somente data, sem hora)
        LocalDate today = LocalDate.now();
        System.out.println("Data de hoje: " + today);

        // Criando uma hora (somente hora, sem data)
        LocalTime currentTime = LocalTime.now();
        System.out.println("Hora atual: " + currentTime);

        // Criando uma data e hora específica
        LocalDateTime meeting = LocalDateTime.of(2024, Month.DECEMBER, 25, 14, 30);
        System.out.println("Reunião marcada para: " + meeting);

        // Formatando data e hora com um padrão específico
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        String formattedMeeting = meeting.format(formatter);
        System.out.println("Reunião formatada: " + formattedMeeting);

        // Somando 2 semanas à data de hoje
        LocalDate twoWeeksLater = today.plus(2, ChronoUnit.WEEKS);
        System.out.println("Daqui a 2 semanas: " + twoWeeksLater);

        // Subtraindo 3 dias da data de hoje
        LocalDate threeDaysAgo = today.minusDays(3);
        System.out.println("3 dias atrás: " + threeDaysAgo);

        // Comparando datas
        if (today.isBefore(twoWeeksLater)) {
            System.out.println("Hoje é antes de duas semanas depois.");
        }

        // Calculando a diferença entre duas datas
        long daysBetween = ChronoUnit.DAYS.between(threeDaysAgo, today);
        System.out.println("Dias entre 3 dias atrás e hoje: " + daysBetween);
    }
}


