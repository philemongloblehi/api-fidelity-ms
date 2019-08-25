/*
 * Copyright (c) 2019. Philemon GLOBLEHI, Back-end developer
 */

package com.api.fidelityms.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class FidelityProgram {

    @Id
    @GeneratedValue
    private Long id;

    private String designation;

    private double amount;

    private String details;

    private Date startDate;

    private Date endDate;

    public FidelityProgram() {
        super();
    }

    public FidelityProgram(String designation, double amount, String details, Date startDate, Date endDate) {
        super();
        this.designation = designation;
        this.amount = amount;
        this.details = details;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public FidelityProgram(Long id, String designation, double amount, String details, Date startDate, Date endDate) {
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

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "FidelityProgram{" +
                "id=" + id +
                ", designation='" + designation + '\'' +
                ", amount=" + amount +
                ", details='" + details + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FidelityProgram that = (FidelityProgram) o;

        if (Double.compare(that.amount, amount) != 0) return false;
        if (!id.equals(that.id)) return false;
        if (!designation.equals(that.designation)) return false;
        if (!details.equals(that.details)) return false;
        if (!startDate.equals(that.startDate)) return false;
        return endDate.equals(that.endDate);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id.hashCode();
        result = 31 * result + designation.hashCode();
        temp = Double.doubleToLongBits(amount);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + details.hashCode();
        result = 31 * result + startDate.hashCode();
        result = 31 * result + endDate.hashCode();
        return result;
    }
}
