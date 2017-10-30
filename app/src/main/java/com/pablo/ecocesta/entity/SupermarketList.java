package com.pablo.ecocesta.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;

import java.util.Date;

/**
 * Created by irene on 15/10/2017.
 */
@Entity(nameInDb = "SupermarketList")
public class SupermarketList {

    @Id(autoincrement = true)
    private Long id;

    @Property(nameInDb = "list_name")
    private String list_name;

    @Property(nameInDb = "list_created_at")
    private String listCreatedAt;

    @Property(nameInDb = "list_updated_at")
    private String listUpdatedAt;

    @Property(nameInDb = "total_price")
    private double totalPrice;

    @Property(nameInDb = "total_discount")
    private double totalDiscount;

    @Property(nameInDb = "list_completed")
    private boolean listCompleted;

    @Property(nameInDb = "purchase_date")
    private Date purchaseDate;

    @Property(nameInDb = "limit_date")
    private Date limitDate;

    private long globalListId;

   // private List<Supermarket> supermarkets;

    //@ToMany(referencedJoinProperty = "supermarketListId")
    private ProductList productsList;

    public boolean isListCompleted() {
        return listCompleted;
    }

    /*
    public void setSupermarkets(List<Supermarket> supermarkets) {
        this.supermarkets = supermarkets;
    }
    */

    public void setProductsList(ProductList productsList) {
        this.productsList = productsList;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getList_name() {
        return this.list_name;
    }

    public void setList_name(String list_name) {
        this.list_name = list_name;
    }

    public String getListCreatedAt() {
        return this.listCreatedAt;
    }

    public void setListCreatedAt(String listCreatedAt) {
        this.listCreatedAt = listCreatedAt;
    }

    public String getListUpdatedAt() { return this.listUpdatedAt; }

    public void setListUpdatedAt(String listUpdatedAt) {
        this.listUpdatedAt = listUpdatedAt;
    }

    public long getGlobalListId() {
        return this.globalListId;
    }

    public void setGlobalListId(long globalListId) {
        this.globalListId = globalListId;
    }

    public double getTotalPrice() {
        return this.totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public double getTotalDiscount() {
        return this.totalDiscount;
    }

    public void setTotalDiscount(double totalDiscount) {
        this.totalDiscount = totalDiscount;
    }

    public boolean getListCompleted() {
        return this.listCompleted;
    }

    public void setListCompleted(boolean listCompleted) {
        this.listCompleted = listCompleted;
    }

    public Date getPurchaseDate() {
        return this.purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public Date getLimitDate() {
        return this.limitDate;
    }

    public void setLimitDate(Date limitDate) {
        this.limitDate = limitDate;
    }


}
