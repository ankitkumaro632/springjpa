package com.jpa.springjpa.JPA;

public class PlayerNameDto {

    private String firstName;
    private String lastName;

    public PlayerNameDto(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
