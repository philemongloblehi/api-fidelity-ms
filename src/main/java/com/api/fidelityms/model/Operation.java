/*
 * Copyright (c) 2019. Philemon GLOBLEHI, Back-end developer
 */

package com.api.fidelityms.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Operation {

    @Id
    @GeneratedValue
    private Long id;

    private String type;

    private String designation;

    private Date createdAt;

    private double amount;

    private int point;

    public Operation() {
        super();
    }

    public Operation(String type, String designation, Date createdAt, double amount, int point) {
        super();
        this.type = type;
        this.designation = designation;
        this.createdAt = createdAt;
        this.amount = amount;
        this.point = point;
    }

    public Operation(Long id, String type, String designation, Date createdAt, double amount, int point) {
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

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
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

    @Override
    public String toString() {
        return "Operation{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", designation='" + designation + '\'' +
                ", createdAt=" + createdAt +
                ", amount=" + amount +
                ", point=" + point +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Operation operation = (Operation) o;

        if (Double.compare(operation.amount, amount) != 0) return false;
        if (point != operation.point) return false;
        if (!id.equals(operation.id)) return false;
        if (!type.equals(operation.type)) return false;
        if (!designation.equals(operation.designation)) return false;
        return createdAt.equals(operation.createdAt);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id.hashCode();
        result = 31 * result + type.hashCode();
        result = 31 * result + designation.hashCode();
        result = 31 * result + createdAt.hashCode();
        temp = Double.doubleToLongBits(amount);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + point;
        return result;
    }
}
