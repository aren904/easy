package com.aren.easy.pojo;

import com.aren.easy.configuration.MyCustomConstraint;
import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.*;
import java.io.Serializable;
//@Validated
@Data
public class User implements Serializable {
private Long id;

//@NotBlank(message = "用户名不能为空")
@Length(min=5,max = 10,message = "用户名长度在5-10位数之间")
private String name;
//
//@Email(message = "请输入邮箱")
//@NotBlank(message = "邮箱不能为空")
private String email;

@NotNull(message = "年龄不能为空")
@Min(value = 0,message="年龄要正数")
@Max(value = 10,message = "最大10岁")
private Integer age;

@MyCustomConstraint
private String answer;
}
