/*
 * Copyright (c) 2019. Philemon GLOBLEHI, Back-end developer.
 * Phone: (+225) 79-08-10-50
 * Email: philemongloblehi@gmail.com
 */

package com.api.fidelityms.dto;

public class CenterDto {

    private Long id;
    private String code;
    private String designation;
    private String phone;
    private String email;
    private String webSite;
    private String address;

    public CenterDto() {
        super();
    }

    public CenterDto(String code, String designation, String phone, String email, String webSite, String address) {
        super();
        this.code = code;
        this.designation = designation;
        this.phone = phone;
        this.email = email;
        this.webSite = webSite;
        this.address = address;
    }

    public CenterDto(Long id, String code, String designation, String phone, String email, String webSite, String address) {
        super();
        this.id = id;
        this.code = code;
        this.designation = designation;
        this.phone = phone;
        this.email = email;
        this.webSite = webSite;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

//    public void setId(Long id) {
//        this.id = id;
//    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWebSite() {
        return webSite;
    }

    public void setWebSite(String webSite) {
        this.webSite = webSite;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
