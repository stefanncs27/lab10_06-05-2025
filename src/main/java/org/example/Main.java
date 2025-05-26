package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Cream o lista de nume
        List<String> nume = new ArrayList<>();
        nume.add("Alex");   // Adaugam numele "Alex"
        nume.add("Ion");    // Adaugam numele "Ion"
        nume.add("Vasile"); // Adaugam numele "Vasile"
        nume.add("Ana");    // Adaugam numele "Ana"
        nume.add("Dan");    // Adaugam numele "Dan"

        // Afisam numele care au mai putin de 4 caractere
        System.out.println("Nume cu mai putin de 4 caractere:");
        nume.stream()  // Cream un stream din lista de nume
                .filter(n -> n.length() < 4)  // Filtram numele care au mai putin de 4 caractere
                .forEach((n) -> System.out.println(n));  // Afisam fiecare nume care indeplineste conditia

        // Afisam numele sortate dupa lungime
        System.out.println("Nume sortate dupa lungime:");
        nume.stream()  // Cream un stream din lista de nume
                .sorted((a, b) -> a.length() - b.length())  // Sortam numele in functie de lungimea lor
                .forEach(n -> System.out.println(n + " " + n.length()));  // Afisam fiecare nume si lungimea acestuia

        // Afisam numele separate prin virgula
        System.out.println("Nume separate prin virgula:");
        String numeCuVirgula = String.join(", ", nume);  // Concateneaza toate numele, separandu-le prin virgula
        System.out.println(numeCuVirgula);  // Afisam stringul rezultat
    }
}
