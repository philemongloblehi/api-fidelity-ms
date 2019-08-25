/*
 * Copyright (c) 2019. Philemon GLOBLEHI, Back-end developer
 */

package com.api.fidelityms.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Activity {

    @Id
    @GeneratedValue
    private Long id;

    private String type;

    private String designation;

    private Date startDate;

    private Date endDate;

    public Activity() {
        super();
    }

    public Activity(String type, String designation, Date startDate, Date endDate) {
        super();
        this.type = type;
        this.designation = designation;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Activity(Long id, String type, String designation, Date startDate, Date endDate) {
        super();
        this.id = id;
        this.type = type;
        this.designation = designation;
        this.startDate = startDate;
        this.endDate = endDate;
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
        return "Activity{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", designation='" + designation + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Activity activity = (Activity) o;

        if (!id.equals(activity.id)) return false;
        if (!type.equals(activity.type)) return false;
        if (!designation.equals(activity.designation)) return false;
        if (!startDate.equals(activity.startDate)) return false;
        return endDate.equals(activity.endDate);
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + type.hashCode();
        result = 31 * result + designation.hashCode();
        result = 31 * result + startDate.hashCode();
        result = 31 * result + endDate.hashCode();
        return result;
    }
}
