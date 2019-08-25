/*
 * Copyright (c) 2019. Philemon GLOBLEHI, Back-end developer.
 * Phone: (+225) 79-08-10-50
 * Email: philemongloblehi@gmail.com
 * CreatedAt 25/08/2019 09:24
 */

package com.api.fidelityms.dto;

public class FidelityCardDto {

    private Long id;
    private String number;
    private String createdAt;
    private String updatedAt;
    private String deletedAt;

    public FidelityCardDto() {
        super();
    }

    public FidelityCardDto(String number, String createdAt, String updatedAt, String deletedAt) {
        super();
        this.number = number;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.deletedAt = deletedAt;
    }

    public FidelityCardDto(Long id, String number, String createdAt, String updatedAt, String deletedAt) {
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

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(String deletedAt) {
        this.deletedAt = deletedAt;
    }
}
