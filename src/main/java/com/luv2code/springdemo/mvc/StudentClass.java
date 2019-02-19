package com.luv2code.springdemo.mvc;

import java.util.LinkedHashMap;

public class StudentClass {

    private String firstName;
    private String lastName;
    private String country;
    private String countryTwo;
    private String favouriteLanguage;

    private LinkedHashMap<String, String> countryOptions;
    private String[] operatingSystems;


    public StudentClass() {
        // populate country options
        countryOptions = new LinkedHashMap<>();

        countryOptions.put("BR", "Brazil");
        countryOptions.put("FR", "France");
        countryOptions.put("DE", "Germany");
        countryOptions.put("UK", "United Kingdom");

    }

    public String getFavouriteLanguage() {
        return favouriteLanguage;
    }

    public void setFavouriteLanguage(String favouriteLanguage) {
        this.favouriteLanguage = favouriteLanguage;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {

        this.country = country;
    }

    public String getCountryTwo() {
        return countryTwo;
    }

    public void setCountryTwo(String countryTwo) {
        this.countryTwo = countryTwo;
    }

    public LinkedHashMap<String, String> getCountryOptions() {
        return countryOptions;
    }

    public String[] getOperatingSystems() {
        return operatingSystems;
    }

    public void setOperatingSystems(String[] operatingSystems) {
        this.operatingSystems = operatingSystems;
    }
}
