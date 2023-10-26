package org.lessons.java.bonus;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Word {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci una parola: ");
        String word = scanner.nextLine();

        Map<Character, Integer> count = new HashMap<>();


        for (char character : word.toCharArray()) {
            if (count.containsKey(character)) {
                int occurrences = count.get(character);
                count.put(character, occurrences + 1);
            } else {
                count.put(character, 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : count.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

    }
}
