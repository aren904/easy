package com.aren.easy.configuration;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
//自定义
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = MyCustomConstraintValidator.class)
public @interface MyCustomConstraint {
    String message() default "请输入中国政治中心或经济中心的城市名";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
