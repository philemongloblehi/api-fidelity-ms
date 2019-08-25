/*
 * Copyright (c) 2019. Philemon GLOBLEHI, Back-end developer.
 * Phone: (+225) 79-08-10-50
 * Email: philemongloblehi@gmail.com
 */

package com.api.fidelityms.dto;

public class ActivityDto {

    private Long id;
    private String type;
    private String designation;
    private String startDate;
    private String endDate;

    public ActivityDto() {
        super();
    }

    public ActivityDto(String type, String designation, String startDate, String endDate) {
        super();
        this.type = type;
        this.designation = designation;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public ActivityDto(Long id, String type, String designation, String startDate, String endDate) {
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

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
}
