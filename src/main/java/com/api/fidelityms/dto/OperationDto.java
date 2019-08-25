/*
 * Copyright (c) 2019. Philemon GLOBLEHI, Back-end developer.
 * Phone: (+225) 79-08-10-50
 * Email: philemongloblehi@gmail.com
 * CreatedAt 25/08/2019 10:11
 */

package com.api.fidelityms.dto;

public class OperationDto {

    private Long id;
    private String type;
    private String designation;
    private String createdAt;
    private double amount;
    private int point;

    public OperationDto() {
        super();
    }

    public OperationDto(String type, String designation, String createdAt, double amount, int point) {
        super();
        this.type = type;
        this.designation = designation;
        this.createdAt = createdAt;
        this.amount = amount;
        this.point = point;
    }

    public OperationDto(Long id, String type, String designation, String createdAt, double amount, int point) {
        super();
        this.id = id;
        this.type = type;
        this.designation = designation;
        this.createdAt = createdAt;
        this.amount = amount;
        this.point = point;
    }

    public Long getId() {
        return id;
    }

//    public void setId(Long id) {
//        this.id = id;
//    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }
}
