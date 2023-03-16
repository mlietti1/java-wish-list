package org.lessons.java.bonus;

import java.util.List;
import java.util.Random;

public class ChristmasLetter {


    private String name;
    private String address;
    private List<String> wishList;
    private final boolean nice;

    // constructor
    public ChristmasLetter(String name, String address, List<String> wishList) {
        Random random = new Random();
        nice = random.nextBoolean();
        this.name = name;
        this.address = address;
        this.wishList = wishList;
    }

    // getters, setters


    public boolean isNice() {
        return nice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<String> getWishList() {
        return wishList;
    }

    public void setWishList(List<String> wishList) {
        this.wishList = wishList;
    }

    // methods

    public String sendLetter(){

        if(wishList.size() > 5){
            throw new RuntimeException("You added too many wishes!");
        }
        if(!nice){
            throw new RuntimeException("I'm sorry, I couldn't send your letter. Seems like you're on the naughty list. ");
        }
        return "Your letter has been successfully sent to the North Pole!";
    }
}
