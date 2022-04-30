package com.example.springmvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {

    private String courseCode;

    @Override
    public void initialize(CourseCode constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
        courseCode = constraintAnnotation.value();
    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        boolean result;

        if (s != null) {
            result = s.startsWith(courseCode);
        }
        else {
            result = false;
        }

        return result;
    }
}
