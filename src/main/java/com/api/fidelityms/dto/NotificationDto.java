/*
 * Copyright (c) 2019. Philemon GLOBLEHI, Back-end developer.
 * Phone: (+225) 79-08-10-50
 * Email: philemongloblehi@gmail.com
 * CreatedAt 25/08/2019 10:08
 */

package com.api.fidelityms.dto;

public class NotificationDto {

    private Long id;
    private String message;
    private String createdAt;

    public NotificationDto() {
        super();
    }

    public NotificationDto(String message, String createdAt) {
        super();
        this.message = message;
        this.createdAt = createdAt;
    }

    public NotificationDto(Long id, String message, String createdAt) {
        super();
        this.id = id;
        this.message = message;
        this.createdAt = createdAt;
    }

    public Long getId() {
        return id;
    }

//    public void setId(Long id) {
//        this.id = id;
//    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }
}
