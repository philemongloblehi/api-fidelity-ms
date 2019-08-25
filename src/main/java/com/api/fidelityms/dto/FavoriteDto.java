/*
 * Copyright (c) 2019. Philemon GLOBLEHI, Back-end developer.
 * Phone: (+225) 79-08-10-50
 * Email: philemongloblehi@gmail.com
 */

package com.api.fidelityms.dto;

public class FavoriteDto {

    private Long id;
    private String designation;

    public FavoriteDto() {
        super();
    }

    public FavoriteDto(String designation) {
        super();
        this.designation = designation;
    }

    public FavoriteDto(Long id, String designation) {
        super();
        this.id = id;
        this.designation = designation;
    }

    public Long getId() {
        return id;
    }

//    public void setId(Long id) {
//        this.id = id;
//    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
}
