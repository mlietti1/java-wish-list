package org.lessons.java.christmas;

import java.util.*;

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
            System.out.println("You now have " + wishList.size() + " wishes.");
            System.out.print("Stop? (y/n): ");
            stop = scan.nextLine().equalsIgnoreCase("y");
        }

        System.out.print("What's your name? ");
        String name = scan.nextLine();
        System.out.println("What's your address? ");
        String address = scan.nextLine();

        ChristmasLetter letter = new ChristmasLetter(name, address, wishList);

        try{
            System.out.println(letter.sendLetter());
            Collections.sort(wishList);

            System.out.println("Sender: " + name + "\n" + "Address: " + address + "\n" + "Wishlist: ");

            int i = 0;
            for (String item:
                    wishList) {
                i++;
                System.out.println(i + ". " + item);
            }
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }

        scan.close();

    }
}