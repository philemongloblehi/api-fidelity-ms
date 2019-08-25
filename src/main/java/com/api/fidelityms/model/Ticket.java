/*
 * Copyright (c) 2019. Philemon GLOBLEHI, Back-end developer.
 * Phone: (+225) 79-08-10-50
 * Email: philemongloblehi@gmail.com
 */

package com.api.fidelityms.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;
import java.util.Objects;

@Entity
public class Ticket {

    @Id
    @GeneratedValue
    private Long id;

    private String title;

    private String message;

    private String status;

    private Date createdAt;

    private Date closedAt;

    public Ticket() {
        super();
    }

    public Ticket(String title, String message, String status, Date createdAt, Date closedAt) {
        super();
        this.title = title;
        this.message = message;
        this.status = status;
        this.createdAt = createdAt;
        this.closedAt = closedAt;
    }

    public Ticket(Long id, String title, String message, String status, Date createdAt, Date closedAt) {
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

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getClosedAt() {
        return closedAt;
    }

    public void setClosedAt(Date closedAt) {
        this.closedAt = closedAt;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", message='" + message + '\'' +
                ", status='" + status + '\'' +
                ", createdAt=" + createdAt +
                ", closedAt=" + closedAt +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ticket ticket = (Ticket) o;
        return id.equals(ticket.id) &&
                title.equals(ticket.title) &&
                message.equals(ticket.message) &&
                status.equals(ticket.status) &&
                createdAt.equals(ticket.createdAt) &&
                closedAt.equals(ticket.closedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, message, status, createdAt, closedAt);
    }
}
