package com.luv2code.springdemo.mvc;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Customer {


    @NotNull(message = "is required")
    @Size(min = 1)
    private String firstName;

    @NotNull(message = "is required")
    @Size(min = 1)
    private String lastNme;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLustNme() {
        return lastNme;
    }

    public void setLustNme(String lastNme) {
        this.lastNme = lastNme;
    }
}
