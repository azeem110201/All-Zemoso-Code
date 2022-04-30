package com.example.springmvc;

import java.util.LinkedHashMap;

public class Student {
    private String firstName;
    private String lastName;
    private String country;
    private LinkedHashMap<String, String> countryOptions;
    private String favoriteLanguage;
    private String[] operatingSystems;

    public Student(){
        countryOptions = new LinkedHashMap<>();

        countryOptions.put("IND","India");
        countryOptions.put("US","United States of America");
        countryOptions.put("UK","United Kingdom");
        countryOptions.put("RUS","Russia");
        countryOptions.put("CAN","Canada");

    }

    public void setOperatingSystems(String[] operatingSystems) {
        this.operatingSystems = operatingSystems;
    }

    public String[] getOperatingSystems() {
        return this.operatingSystems;
    }

    public String getFavoriteLanguage() {
        return favoriteLanguage;
    }

    public void setFavoriteLanguage(String favoriteLanguage) {
        this.favoriteLanguage = favoriteLanguage;
    }

    public LinkedHashMap<String, String> getCountryOptions() {
        return countryOptions;
    }

    public void setCountryOptions(LinkedHashMap<String, String> countryOptions) {
        this.countryOptions = countryOptions;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCountry() {
        return this.country;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }
}
