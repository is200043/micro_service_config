/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.business.order.item;

import java.util.Set;
import javax.persistence.*;

/**
 *
 * @author chonlakornpunphopthaworn
 */
@Entity
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "saleOrderId")
    private SaleOrder saleOrder;
    @ManyToOne
    @JoinColumn(name = "productId")
    private Product product;
    private Integer qty;

    public Item() {
    }

    public Item(SaleOrder saleOrder, Product product, Integer qty) {
        this.saleOrder = saleOrder;
        this.product = product;
        this.qty = qty;
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public SaleOrder getSaleOrder() {
        return saleOrder;
    }

    public void setSaleOrder(SaleOrder saleOrder) {
        this.saleOrder = saleOrder;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
