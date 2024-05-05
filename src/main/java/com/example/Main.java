package com.example;

public class Main {

    public static void main(String[] args) {

        var sftpStorage = new SftpStorage();
        var cloudStorage = new CloudStorage();

        uploadFile(sftpStorage);
        uploadFile(cloudStorage);

    }

    private static void uploadFile(Storage storage) {
        switch (storage) {
            case SftpStorage sftpStorage -> {
                System.out.println("Storage type is SFTP");
                sftpStorage.save();
            }
            case CloudStorage cloudStorage -> {
                System.out.println("Storage type is cloud storage");
                cloudStorage.save();
            }
            default -> throw new IllegalArgumentException("Storage type not supported");
        }
    }


}
