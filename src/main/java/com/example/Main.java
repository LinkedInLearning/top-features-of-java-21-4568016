package com.example;

public class Main {

    public static void main(String[] args) {

        var sftpStorage = new SftpStorage();
        var cloudStorage = new CloudStorage();

        uploadFile(sftpStorage);
        uploadFile(cloudStorage);

    }

    private static void uploadFile(Storage storage) {
        if (storage instanceof SftpStorage sftpStorage) {
            System.out.println("Uploading file to SFTP");
            sftpStorage.save();
        } else if (storage instanceof CloudStorage cloudStorage) {
            System.out.println("Uploading file to cloud storage");
            cloudStorage.save();
        } else {
            throw new IllegalArgumentException("Storage type not supported");
        }
    }


}
