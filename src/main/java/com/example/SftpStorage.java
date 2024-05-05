package com.example;

public class SftpStorage implements Storage {

    @Override
    public void save() {
        System.out.println("Saving to SFTP");
    }

}
