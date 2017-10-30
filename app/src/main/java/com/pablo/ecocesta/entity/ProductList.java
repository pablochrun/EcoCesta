package com.pablo.ecocesta.entity;

import com.pablo.ecocesta.converter.MeasureConverter;
import com.pablo.ecocesta.utils.Measure;

import org.greenrobot.greendao.annotation.Convert;
import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Property;

/**
 * Created by irene on 29/10/2017.
 */
@Entity(nameInDb = "ProductList")
public class ProductList {

    @Id(autoincrement = true)
    private Long id;

    private long supermarketListId;

    @Property(nameInDb = "units")
    private int units;

    @Property(nameInDb = "unit_price")
    private double unitPrice;

    @Property(nameInDb = "total_price")
    private double totalPrice;

    @Property(nameInDb = "total_discount")
    private double totalDiscount;

    @Property(nameInDb = "selected")
    private boolean selected;

    @Convert(converter = MeasureConverter.class, columnType = Integer.class)
    @Property(nameInDb = "measure")
    private Measure measure;

    @Property(nameInDb = "kg_price")
    private double priceKg;

    @Generated(hash = 171793706)
    public ProductList(Long id, long supermarketListId, int units, double unitPrice,
            double totalPrice, double totalDiscount, boolean selected,
            Measure measure, double priceKg) {
        this.id = id;
        this.supermarketListId = supermarketListId;
        this.units = units;
        this.unitPrice = unitPrice;
        this.totalPrice = totalPrice;
        this.totalDiscount = totalDiscount;
        this.selected = selected;
        this.measure = measure;
        this.priceKg = priceKg;
    }

    @Generated(hash = 1565041128)
    public ProductList() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public long getSupermarketListId() {
        return supermarketListId;
    }

    public void setSupermarketListId(long supermarketListId) {
        this.supermarketListId = supermarketListId;
    }

    public int getUnits() {
        return units;
    }

    public void setUnits(int units) {
        this.units = units;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
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

    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    public Measure getMeasure() {
        return this.measure;
    }

    public void setMeasure(Measure measure) {
        this.measure = measure;
    }

    public double getPriceKg() {
        return this.priceKg;
    }

    public void setPriceKg(double priceKg) {
        this.priceKg = priceKg;
    }

    public boolean isSelected() {
        return selected;
    }

    public boolean getSelected() {
        return this.selected;
    }
}
