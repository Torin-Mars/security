package com.imooc.dto;

import com.fasterxml.jackson.annotation.JsonView;
import com.imooc.vaildator.MyConstraint;
import org.hibernate.validator.constraints.NotBlank;

import java.util.Date;

public class User {

    public interface UserSimpleView{};
    public interface UserDetailView extends UserSimpleView{};

    private int id;
    @NotBlank(message = "密码不能为空")
    private String username;
    @MyConstraint(message = "这是一个自定义校验")
    private String password;
    private Date birthDay;

    @JsonView(UserSimpleView.class)
    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    @JsonView(UserSimpleView.class)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @JsonView(UserDetailView.class)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    @JsonView(UserSimpleView.class)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", birthDay=" + birthDay +
                '}';
    }
}
