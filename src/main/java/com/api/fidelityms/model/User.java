/*
 * Copyright (c) 2019. Philemon GLOBLEHI, Back-end developer
 */

package com.api.fidelityms.model;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.UniqueElements;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import java.util.Objects;

@Entity
public class User {

    @Id
    @GeneratedValue
    private Long id;

    @UniqueElements
    private String login;

    @UniqueElements
    @Email
    private String email;

    @Length(min = 8, max = 20, message = "Invalid password")
    private String password;

    private String role;

    public User() {
        super();
    }

    public User(String login, String email, String password, String role) {
        super();
        this.login = login;
        this.email = email;
        this.password = password;
        this.role = role;
    }

    public User(Long id, String login, String email, String password, String role) {
        super();
        this.id = id;
        this.login = login;
        this.email = email;
        this.password = password;
        this.role = role;
    }

    public Long getId() {
        return id;
    }

//    public void setId(Long id) {
//        this.id = id;
//    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", role='" + role + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id.equals(user.id) &&
                login.equals(user.login) &&
                email.equals(user.email) &&
                password.equals(user.password) &&
                role.equals(user.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, login, email, password, role);
    }
}
