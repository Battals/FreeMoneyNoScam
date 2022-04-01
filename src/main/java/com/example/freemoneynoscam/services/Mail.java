package com.example.freemoneynoscam.services;

public class Mail {

    private int id;
    private String email;

    public Mail(int id, String email) {
        this.id = id;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Email{" +
                "id=" + id +
                ", email='" + email + '\'' +
                '}';
    }
}
