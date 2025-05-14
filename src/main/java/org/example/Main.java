package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> nume = new ArrayList<>();
        nume.add("Alex");
        nume.add("Ion");
        nume.add("Vasile");
        nume.add("Ana");
        nume.add("Dan");

        System.out.println("Nume cu mai putin de 4 caractere:");
        nume.stream()
                .filter(n -> n.length() < 4)
                .forEach((n) -> System.out.println(n));

        System.out.println("Nume sortate dupa lungime:");
        nume.stream()
                .sorted((a, b) -> a.length() - b.length())
                .forEach(n -> System.out.println(n + " " + n.length()));

        System.out.println("Nume separate prin virgula:");
        String numeCuVirgula = String.join(", ", nume);
        System.out.println(numeCuVirgula);

    }
}
