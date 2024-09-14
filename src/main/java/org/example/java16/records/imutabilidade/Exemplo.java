package org.example.java16.records.imutabilidade;

public class Exemplo {
    public static void main(String[] args) {
        // Criação de um novo usuário
        User user = new User("João Silva", "joao@example.com");
        System.out.println("Original User: " + user);

        // "Atualizando" o email (criando um novo objeto)
        User updatedUser = new User(user.name(), "joao.silva@example.com");
        System.out.println("Updated User: " + updatedUser);
    }
}
