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
public class CenterFidelityCard {

    @Id
    @GeneratedValue
    private Long id;

    @UniqueElements
    private String number;

    private Date createdAt;

    private Date deletedAt;

    private Date updatedAt;

    private boolean isActivate;

    public CenterFidelityCard() {
        super();
    }

    public CenterFidelityCard(String number, Date createdAt, Date deletedAt, Date updatedAt, boolean isActivate) {
        super();
        this.number = number;
        this.createdAt = createdAt;
        this.deletedAt = deletedAt;
        this.updatedAt = updatedAt;
        this.isActivate = isActivate;
    }

    public CenterFidelityCard(Long id, String number, Date createdAt, Date deletedAt, Date updatedAt, boolean isActivate) {
        super();
        this.id = id;
        this.number = number;
        this.createdAt = createdAt;
        this.deletedAt = deletedAt;
        this.updatedAt = updatedAt;
        this.isActivate = isActivate;
    }

    public Long getId() {
        return id;
    }

//    public void setId(Long id) {
//        this.id = id;
//    }

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

    public Date getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(Date deletedAt) {
        this.deletedAt = deletedAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public boolean isActivate() {
        return isActivate;
    }

    public void setActivate(boolean activate) {
        isActivate = activate;
    }

    @Override
    public String toString() {
        return "CenterFidelityCard{" +
                "id=" + id +
                ", number='" + number + '\'' +
                ", createdAt=" + createdAt +
                ", deletedAt=" + deletedAt +
                ", updatedAt=" + updatedAt +
                ", isActivate=" + isActivate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CenterFidelityCard that = (CenterFidelityCard) o;

        if (isActivate != that.isActivate) return false;
        if (!id.equals(that.id)) return false;
        if (!number.equals(that.number)) return false;
        if (!createdAt.equals(that.createdAt)) return false;
        if (!deletedAt.equals(that.deletedAt)) return false;
        return updatedAt.equals(that.updatedAt);
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + number.hashCode();
        result = 31 * result + createdAt.hashCode();
        result = 31 * result + deletedAt.hashCode();
        result = 31 * result + updatedAt.hashCode();
        result = 31 * result + (isActivate ? 1 : 0);
        return result;
    }
}
