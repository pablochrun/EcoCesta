package com.pablo.ecocesta.entity;

import com.pablo.ecocesta.converter.MeasureConverter;
import com.pablo.ecocesta.utils.Measure;

import org.greenrobot.greendao.annotation.Convert;
import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.ToOne;
import org.greenrobot.greendao.DaoException;
import org.greenrobot.greendao.annotation.NotNull;

/**
 * Created by irene on 29/10/2017.
 */
@Entity(nameInDb = "ProductList")
public class ProductList {

    @Id(autoincrement = true)
    private Long id;

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

    private long globalListId;

    private long supermarketId;

    @ToOne(joinProperty = "supermarketId")
    private Supermarket supermarket;

    /** Used to resolve relations */
    @Generated(hash = 2040040024)
    private transient DaoSession daoSession;

    /** Used for active entity operations. */
    @Generated(hash = 1190443415)
    private transient ProductListDao myDao;

    @Generated(hash = 627365598)
    private transient Long supermarket__resolvedKey;

    @Generated(hash = 496405407)
    public ProductList(Long id, int units, double unitPrice, double totalPrice,
            double totalDiscount, boolean selected, Measure measure, double priceKg,
            long globalListId, long supermarketId) {
        this.id = id;
        this.units = units;
        this.unitPrice = unitPrice;
        this.totalPrice = totalPrice;
        this.totalDiscount = totalDiscount;
        this.selected = selected;
        this.measure = measure;
        this.priceKg = priceKg;
        this.globalListId = globalListId;
        this.supermarketId = supermarketId;
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

    public long getGlobalListId() {
        return globalListId;
    }

    public void setGlobalListId(long globalListId) {
        this.globalListId = globalListId;
    }
    

    public long getSupermarketId() {
        return supermarketId;
    }

    public void setSupermarketId(long supermarketId) {
        this.supermarketId = supermarketId;
    }

    /** To-one relationship, resolved on first access. */
    @Generated(hash = 1709373299)
    public Supermarket getSupermarket() {
        long __key = this.supermarketId;
        if (supermarket__resolvedKey == null
                || !supermarket__resolvedKey.equals(__key)) {
            final DaoSession daoSession = this.daoSession;
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            SupermarketDao targetDao = daoSession.getSupermarketDao();
            Supermarket supermarketNew = targetDao.load(__key);
            synchronized (this) {
                supermarket = supermarketNew;
                supermarket__resolvedKey = __key;
            }
        }
        return supermarket;
    }

    /** called by internal mechanisms, do not call yourself. */
    @Generated(hash = 817255004)
    public void setSupermarket(@NotNull Supermarket supermarket) {
        if (supermarket == null) {
            throw new DaoException(
                    "To-one property 'supermarketId' has not-null constraint; cannot set to-one to null");
        }
        synchronized (this) {
            this.supermarket = supermarket;
            supermarketId = supermarket.getId();
            supermarket__resolvedKey = supermarketId;
        }
    }

    /**
     * Convenient call for {@link org.greenrobot.greendao.AbstractDao#delete(Object)}.
     * Entity must attached to an entity context.
     */
    @Generated(hash = 128553479)
    public void delete() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }
        myDao.delete(this);
    }

    /**
     * Convenient call for {@link org.greenrobot.greendao.AbstractDao#refresh(Object)}.
     * Entity must attached to an entity context.
     */
    @Generated(hash = 1942392019)
    public void refresh() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }
        myDao.refresh(this);
    }

    /**
     * Convenient call for {@link org.greenrobot.greendao.AbstractDao#update(Object)}.
     * Entity must attached to an entity context.
     */
    @Generated(hash = 713229351)
    public void update() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }
        myDao.update(this);
    }

    /** called by internal mechanisms, do not call yourself. */
    @Generated(hash = 629944583)
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getProductListDao() : null;
    }
}
