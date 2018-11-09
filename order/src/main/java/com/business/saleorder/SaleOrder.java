/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.business.saleorder;

import com.business.item.Item;
import java.util.Date;
import java.util.Set;
import javax.persistence.*;

/**
 *
 * @author chonlakornpunphopthaworn
 */
@Entity
public class SaleOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Date date;
    private String status;
    private String promotion;
    private Double subnet;
    private Double discount;
    private Double net;
    @OneToMany(mappedBy = "saleOrder", cascade = CascadeType.ALL)
    private Set<Item> items;

    public SaleOrder() {
    }

    public SaleOrder(Date date, String status, String promotion, Double subnet, Double discount, Double net, Set<Item> items) {
        this.date = date;
        this.status = status;
        this.promotion = promotion;
        this.subnet = subnet;
        this.discount = discount;
        this.net = net;
        this.items = items;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPromotion() {
        return promotion;
    }

    public void setPromotion(String promotion) {
        this.promotion = promotion;
    }

    public Double getSubnet() {
        return subnet;
    }

    public void setSubnet(Double subnet) {
        this.subnet = subnet;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public Double getNet() {
        return net;
    }

    public void setNet(Double net) {
        this.net = net;
    }

    public Set<Item> getItems() {
        return items;
    }

    public void setItems(Set<Item> items) {
        this.items = items;
    }

}
