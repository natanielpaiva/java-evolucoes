package org.example.java17.sealed.exemplo2;

public class Exemplo {
    public static void main(String[] args) {
        // Inicializando o estado com Start
        State currentState = new Start();
        System.out.println(currentState);

        // Transição para o estado Processing
        currentState = new Processing();
        System.out.println(currentState);

        // Transição para o estado Finished
        currentState = new Finished();
        System.out.println(currentState);
    }
}
