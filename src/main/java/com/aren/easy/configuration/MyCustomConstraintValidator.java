package com.aren.easy.configuration;


import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.lang.annotation.Annotation;

public class MyCustomConstraintValidator implements ConstraintValidator<MyCustomConstraint,String>{


    @Override
    public void initialize(MyCustomConstraint myCustomConstraint) {

    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (!(("上海").equals(value) || ("北京").equals(value))) {
            return false;
        }
            return true;
    }
}
