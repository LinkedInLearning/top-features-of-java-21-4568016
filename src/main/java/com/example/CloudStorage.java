package com.example;

public class CloudStorage implements Storage {

    @Override
    public void save() {
        System.out.println("Saving to cloud storage");
    }

}
