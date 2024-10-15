package com.supply_house.special_hrs.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "special_hours",schema = "supply_house")
public class SpecialHour {
    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "hours")
    private String hours;

    public Integer getId() {
        return id;
    }

    public String getHours() {
        return hours;
    }

    public void setHours(String hours) {
        this.hours = hours;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
