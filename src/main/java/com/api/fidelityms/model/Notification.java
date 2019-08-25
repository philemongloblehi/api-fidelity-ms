/*
 * Copyright (c) 2019. Philemon GLOBLEHI, Back-end developer
 */

package com.api.fidelityms.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Notification {

    @Id
    @GeneratedValue
    private Long id;

    private String message;

    private Date createdAt;

    public Notification() {
        super();
    }

    public Notification(String message, Date createdAt) {
        super();
        this.message = message;
        this.createdAt = createdAt;
    }

    public Notification(Long id, String message, Date createdAt) {
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

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "Notifications{" +
                "id=" + id +
                ", message='" + message + '\'' +
                ", createdAt=" + createdAt +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Notification that = (Notification) o;

        if (!id.equals(that.id)) return false;
        if (!message.equals(that.message)) return false;
        return createdAt.equals(that.createdAt);
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + message.hashCode();
        result = 31 * result + createdAt.hashCode();
        return result;
    }
}
