package com.yash.api.entities;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "restaurant_del_ptnr_comb", schema = "sql12657952")
public class RestaurantDelPtnrComb implements Serializable {
    private static final long serialVersionUID = -5950097864932119552L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "del_ptnr_id", nullable = false)
    private DelPtnr delPtnr;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "restaurant_id", nullable = false)
    private Restaurant restaurant;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public DelPtnr getDelPtnr() {
        return delPtnr;
    }

    public void setDelPtnr(DelPtnr delPtnr) {
        this.delPtnr = delPtnr;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

}