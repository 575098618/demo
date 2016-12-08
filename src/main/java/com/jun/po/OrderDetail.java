package com.jun.po;

public class OrderDetail {
    private Integer id;

    private String itemsnum;

    private Integer itemsid;

    private Integer ordersid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getItemsnum() {
        return itemsnum;
    }

    public void setItemsnum(String itemsnum) {
        this.itemsnum = itemsnum == null ? null : itemsnum.trim();
    }

    public Integer getItemsid() {
        return itemsid;
    }

    public void setItemsid(Integer itemsid) {
        this.itemsid = itemsid;
    }

    public Integer getOrdersid() {
        return ordersid;
    }

    public void setOrdersid(Integer ordersid) {
        this.ordersid = ordersid;
    }
}