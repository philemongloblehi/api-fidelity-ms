/*
 * Copyright (c) 2019. Philemon GLOBLEHI, Back-end developer.
 * Phone: (+225) 79-08-10-50
 * Email: philemongloblehi@gmail.com
 * CreatedAt 25/08/2019 10:17
 */

package com.api.fidelityms.dto;

public class UserDto {

    private Long id;
    private String login;
    private String email;
    private String password;
    private String role;

    public UserDto() {
        super();
    }

    public UserDto(String login, String email, String password, String role) {
        super();
        this.login = login;
        this.email = email;
        this.password = password;
        this.role = role;
    }

    public UserDto(Long id, String login, String email, String password, String role) {
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
}
