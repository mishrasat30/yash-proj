package com.yash.api.entities;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "item_price", schema = "sql12657952")
public class ItemPrice implements Serializable {
    private static final long serialVersionUID = -2180834997931879513L;
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "price", nullable = false)
    private Double price;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "item_id", nullable = false)
    private Item item;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "restaurant_del_ptnr_comb_id", nullable = false)
    private RestaurantDelPtnrComb restaurantDelPtnrComb;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public RestaurantDelPtnrComb getRestaurantDelPtnrComb() {
        return restaurantDelPtnrComb;
    }

    public void setRestaurantDelPtnrComb(RestaurantDelPtnrComb restaurantDelPtnrComb) {
        this.restaurantDelPtnrComb = restaurantDelPtnrComb;
    }

}