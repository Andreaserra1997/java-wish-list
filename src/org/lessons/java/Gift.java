package org.lessons.java;

public class Gift {
    //ATTRIBUTI
    private String description;
    private String receiver;

    //COSTRUTTORI
    public Gift(String description, String receiver) {
        this.description = description;
        this.receiver = receiver;
    }

    //GETTER E SETTER
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }
    @Override
    public String toString() {
        return "Gift{" +
                "description='" + description + '\'' +
                ", receiver='" + receiver + '\'' +
                '}';
    }
}
