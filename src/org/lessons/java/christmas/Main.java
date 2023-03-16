package org.lessons.java.christmas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        List<String> wishList = new ArrayList<>();

        boolean stop = false;

        while (!stop) {
            System.out.print("Add wish: ");
            String item = scan.nextLine();
            // aggiungo n alla lista
            wishList.add(item);
            System.out.println("You have now " + wishList.size() + " wishes.");
            System.out.print("Stop?(y/n): ");
            stop = scan.nextLine().equalsIgnoreCase("y");
        }
    }
}