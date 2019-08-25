package com.api.fidelityms.model;

import org.hibernate.validator.constraints.UniqueElements;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Email;

@Entity
public class Customer {

    @Id
    @GeneratedValue
    private Long id;

    @UniqueElements
    private String login;

    @UniqueElements
    @Email
    private String email;

    private String password;

    private String lastName;

    private String firstName;

    private String phone;

    private String address;

    public Customer() {
        super();
    }

    public Customer(String login, String email, String password, String lastName, String firstName, String phone, String address) {
        super();
        this.login = login;
        this.email = email;
        this.password = password;
        this.lastName = lastName;
        this.firstName = firstName;
        this.phone = phone;
        this.address = address;
    }

    public Customer(Long id, String login, String email, String password, String lastName, String firstName, String phone, String address) {
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

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Customer customer = (Customer) o;

        if (!id.equals(customer.id)) return false;
        if (!login.equals(customer.login)) return false;
        if (!email.equals(customer.email)) return false;
        if (!password.equals(customer.password)) return false;
        if (!lastName.equals(customer.lastName)) return false;
        if (!firstName.equals(customer.firstName)) return false;
        if (!phone.equals(customer.phone)) return false;
        return address.equals(customer.address);
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + login.hashCode();
        result = 31 * result + email.hashCode();
        result = 31 * result + password.hashCode();
        result = 31 * result + lastName.hashCode();
        result = 31 * result + firstName.hashCode();
        result = 31 * result + phone.hashCode();
        result = 31 * result + address.hashCode();
        return result;
    }
}
