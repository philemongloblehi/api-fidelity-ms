/*
 * Copyright (c) 2019. Philemon GLOBLEHI, Back-end developer
 */

package com.api.fidelityms.model;

import org.hibernate.validator.constraints.UniqueElements;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Email;

@Entity
public class Center {

    @Id
    @GeneratedValue
    private Long id;

    @UniqueElements
    private String code;

    private String designation;

    private String phone;

    @UniqueElements
    @Email
    private String email;

    private String webSite;

    private String address;

    public Center() {
        super();
    }

    public Center(String code, String designation, String phone, String email, String webSite, String address) {
        super();
        this.code = code;
        this.designation = designation;
        this.phone = phone;
        this.email = email;
        this.webSite = webSite;
        this.address = address;
    }

    public Center(Long id, String code, String designation, String phone, String email, String webSite, String address) {
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

    @Override
    public String toString() {
        return "Centre{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", designation='" + designation + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", webSite='" + webSite + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Center centre = (Center) o;

        if (!id.equals(centre.id)) return false;
        if (!code.equals(centre.code)) return false;
        if (!designation.equals(centre.designation)) return false;
        if (!phone.equals(centre.phone)) return false;
        if (!email.equals(centre.email)) return false;
        if (!webSite.equals(centre.webSite)) return false;
        return address.equals(centre.address);
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + code.hashCode();
        result = 31 * result + designation.hashCode();
        result = 31 * result + phone.hashCode();
        result = 31 * result + email.hashCode();
        result = 31 * result + webSite.hashCode();
        result = 31 * result + address.hashCode();
        return result;
    }
}
