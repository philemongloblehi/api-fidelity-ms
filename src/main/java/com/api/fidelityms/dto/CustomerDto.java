/*
 * Copyright (c) 2019. Philemon GLOBLEHI, Back-end developer.
 * Phone: (+225) 79-08-10-50
 * Email: philemongloblehi@gmail.com
 */

package com.api.fidelityms.dto;

public class CustomerDto {

    private Long id;
    private String login;
    private String email;
    private String password;
    private String lastName;
    private String firstName;
    private String phone;
    private String address;

    public CustomerDto() {
        super();
    }

    public CustomerDto(String login, String email, String password, String lastName, String firstName, String phone, String address) {
        super();
        this.login = login;
        this.email = email;
        this.password = password;
        this.lastName = lastName;
        this.firstName = firstName;
        this.phone = phone;
        this.address = address;
    }

    public CustomerDto(Long id, String login, String email, String password, String lastName, String firstName, String phone, String address) {
        super();
        this.id = id;
        this.login = login;
        this.email = email;
        this.password = password;
        this.lastName = lastName;
        this.firstName = firstName;
        this.phone = phone;
        this.address = address;
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

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
