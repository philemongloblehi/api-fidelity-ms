/*
 * Copyright (c) 2019. Philemon GLOBLEHI, Back-end developer.
 * Phone: (+225) 79-08-10-50
 * Email: philemongloblehi@gmail.com
 * CreatedAt 25/08/2019 09:59
 */

package com.api.fidelityms.dto;

public class FidelityProgramDto {

    private Long id;
    private String designation;
    private double amount;
    private String details;
    private String startDate;
    private String endDate;

    public FidelityProgramDto() {
        super();
    }

    public FidelityProgramDto(String designation, double amount, String details, String startDate, String endDate) {
        super();
        this.designation = designation;
        this.amount = amount;
        this.details = details;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public FidelityProgramDto(Long id, String designation, double amount, String details, String startDate, String endDate) {
        super();
        this.id = id;
        this.designation = designation;
        this.amount = amount;
        this.details = details;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Long getId() {
        return id;
    }

//    public void setId(Long id) {
//        this.id = id;
//    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

}
