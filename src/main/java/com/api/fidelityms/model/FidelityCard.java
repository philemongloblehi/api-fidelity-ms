/*
 * Copyright (c) 2019. Philemon GLOBLEHI, Back-end developer
 */

package com.api.fidelityms.model;

import org.hibernate.validator.constraints.UniqueElements;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class FidelityCard {

    @Id
    @GeneratedValue
    private Long id;

    @UniqueElements
    private String number;

    private Date createdAt;

    private Date updatedAt;

    private Date deletedAt;

    public FidelityCard() {
        super();
    }

    public FidelityCard(String number, Date createdAt, Date updatedAt, Date deletedAt) {
        super();
        this.number = number;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.deletedAt = deletedAt;
    }

    public FidelityCard(Long id, String number, Date createdAt, Date updatedAt, Date deletedAt) {
        this.id = id;
        this.number = number;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.deletedAt = deletedAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Date getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(Date deletedAt) {
        this.deletedAt = deletedAt;
    }

    @Override
    public String toString() {
        return "FidelityCard{" +
                "id=" + id +
                ", number='" + number + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", deletedAt=" + deletedAt +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FidelityCard that = (FidelityCard) o;

        if (!id.equals(that.id)) return false;
        if (!number.equals(that.number)) return false;
        if (!createdAt.equals(that.createdAt)) return false;
        if (!updatedAt.equals(that.updatedAt)) return false;
        return deletedAt.equals(that.deletedAt);
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + number.hashCode();
        result = 31 * result + createdAt.hashCode();
        result = 31 * result + updatedAt.hashCode();
        result = 31 * result + deletedAt.hashCode();
        return result;
    }
}
