package org.lessons.java.gift;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Gift> gift = new ArrayList<>();

        boolean exit = false;

        while (!exit) {
            System.out.println("Vuoi inserire un nuovo regalo? y/n");
            exit = scan.nextLine().equals("n");
            if (!exit) {
                System.out.println("Descrizione del regalo: ");
                String description = scan.nextLine();
                System.out.println("Destinatario del regalo: ");
                String receiver = scan.nextLine();
                gift.add(new Gift(description, receiver));
                System.out.println("La tua lista contiene " + gift.size() + " regali");
            }
        }
        System.out.println(gift);

        scan.close();
    }
}
