package com.example;

public record House(String address, int numberOfBedrooms, boolean hasBasement) implements Building {
}
