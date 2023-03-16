package org.lessons.java.bonus;

public class Wish {
    private String name;
    private String receiver;

    public Wish(String name, String receiver) {
        this.name = name;
        this.receiver = receiver;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }
}
