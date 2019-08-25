/*
 * Copyright (c) 2019. Philemon GLOBLEHI, Back-end developer.
 * Phone: (+225) 79-08-10-50
 * Email: philemongloblehi@gmail.com
 */

package com.api.fidelityms.dto;

public class CenterFidelityCardDto {

    private Long id;
    private String number;
    private String createdAt;
    private String deletedAt;
    private String updatedAt;
    private boolean isActivate;

    public CenterFidelityCardDto() {
        super();
    }

    public CenterFidelityCardDto(String number, String createdAt, String deletedAt, String updatedAt, boolean isActivate) {
        super();
        this.number = number;
        this.createdAt = createdAt;
        this.deletedAt = deletedAt;
        this.updatedAt = updatedAt;
        this.isActivate = isActivate;
    }

    public CenterFidelityCardDto(Long id, String number, String createdAt, String deletedAt, String updatedAt, boolean isActivate) {
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

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(String deletedAt) {
        this.deletedAt = deletedAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public boolean isActivate() {
        return isActivate;
    }

    public void setActivate(boolean activate) {
        isActivate = activate;
    }
}
