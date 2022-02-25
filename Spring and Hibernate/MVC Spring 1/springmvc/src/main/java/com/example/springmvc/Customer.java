package com.example.springmvc;

import com.example.springmvc.validation.CourseCode;

import javax.validation.constraints.*;

public class Customer {
    private String firstName;

    @NotNull(message="is required")
    @Size(min=3, message="should have 3 or more characters")
    private String lastName;

    @NotNull(message="is required")
    @Min(value=0, message = "Must be greater or equal to zero")
    @Max(value=10, message = "Must not be greater than 10")
    private Integer freePasses;

    @Pattern(regexp="^[a-zA-Z0-9]{5}", message="only 5 chars/digits")
    private String postalCode;

    @CourseCode(value = "TOLL", message = "Must start with TOLL")
    private String courseCode;

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getFreePasses() {
        return this.freePasses;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getPostalCode() {
        return this.postalCode;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public void setFreePasses(Integer freePasses) {
        this.freePasses = freePasses;
    }
}
