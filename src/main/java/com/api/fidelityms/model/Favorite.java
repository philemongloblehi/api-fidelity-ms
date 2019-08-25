/*
 * Copyright (c) 2019. Philemon GLOBLEHI, Back-end developer.
 * Phone: (+225) 79-08-10-50
 * Email: philemongloblehi@gmail.com
 */

package com.api.fidelityms.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Favorite {

    @Id
    @GeneratedValue
    private Long id;

    private String designation;

    public Favorite() {
        super();
    }

    public Favorite(String designation) {
        super();
        this.designation = designation;
    }

    public Favorite(Long id, String designation) {
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

    @Override
    public String toString() {
        return "Favorite{" +
                "id=" + id +
                ", designation='" + designation + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Favorite favorite = (Favorite) o;
        return id.equals(favorite.id) &&
                designation.equals(favorite.designation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, designation);
    }
}
