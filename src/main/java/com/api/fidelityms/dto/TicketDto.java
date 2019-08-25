/*
 * Copyright (c) 2019. Philemon GLOBLEHI, Back-end developer.
 * Phone: (+225) 79-08-10-50
 * Email: philemongloblehi@gmail.com
 * CreatedAt 25/08/2019 10:15
 */

package com.api.fidelityms.dto;

public class TicketDto {

    private Long id;
    private String title;
    private String message;
    private String status;
    private String createdAt;
    private String closedAt;

    public TicketDto() {
        super();
    }

    public TicketDto(String title, String message, String status, String createdAt, String closedAt) {
        super();
        this.title = title;
        this.message = message;
        this.status = status;
        this.createdAt = createdAt;
        this.closedAt = closedAt;
    }

    public TicketDto(Long id, String title, String message, String status, String createdAt, String closedAt) {
        super();
        this.id = id;
        this.title = title;
        this.message = message;
        this.status = status;
        this.createdAt = createdAt;
        this.closedAt = closedAt;
    }

    public Long getId() {
        return id;
    }

//    public void setId(Long id) {
//        this.id = id;
//    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getClosedAt() {
        return closedAt;
    }

    public void setClosedAt(String closedAt) {
        this.closedAt = closedAt;
    }
}
