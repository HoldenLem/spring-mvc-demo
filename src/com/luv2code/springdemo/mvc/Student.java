package com.luv2code.springdemo.mvc;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Student {
    private String firstName;

    private String lastName;

    private LinkedHashMap<String,String> countryOption;
    private String country;

    public String getCountry() {
        return country;
    }


    public void setCountry(String country) {
        this.country = country;
    }

    public Student() {
        // populate county options: use ISO country code
        countryOption  = new LinkedHashMap<>();
        countryOption.put("BR","Brazil");
        countryOption.put("UA","Ukraine");
        countryOption.put("PL","Poland");
        countryOption.put("RM", "Romania");
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

    public LinkedHashMap<String, String> getCountryOption() {
        return countryOption;
    }
}
