package com.pablo.ecocesta.entity;

import org.greenrobot.greendao.DaoException;
import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.ToMany;

import java.util.List;

/**
 * Created by irene on 15/10/2017.
 */
@Entity(nameInDb = "GlobalList")
public class GlobalList {

    @Id(autoincrement = true)
    private Long id;

    @Property(nameInDb = "list_name")
    private String list_name;

    @Property(nameInDb = "list_created_at")
    private String listCreatedAt;

    @Property(nameInDb = "list_updated_at")

    private String listUpdatedAt;

    @ToMany(referencedJoinProperty = "globalListId")
    private List<ProductList> productLists;

    /** Used to resolve relations */
    @Generated(hash = 2040040024)
    private transient DaoSession daoSession;

    /** Used for active entity operations. */
    @Generated(hash = 246779444)
    private transient GlobalListDao myDao;

    @Generated(hash = 1263113563)
    public GlobalList(Long id, String list_name, String listCreatedAt,
            String listUpdatedAt) {
        this.id = id;
        this.list_name = list_name;
        this.listCreatedAt = listCreatedAt;
        this.listUpdatedAt = listUpdatedAt;
    }

    @Generated(hash = 1740026657)
    public GlobalList() {
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

    public String getListUpdatedAt() {
        return this.listUpdatedAt;
    }

    public void setListUpdatedAt(String listUpdatedAt) {
        this.listUpdatedAt = listUpdatedAt;
    }

    public List<ProductList> getProductList() {
        return productLists;
    }

    public void setProductList(List<ProductList> productLists) {
        this.productLists = productLists;
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

    /**
     * To-many relationship, resolved on first access (and after reset).
     * Changes to to-many relations are not persisted, make changes to the target entity.
     */
    @Generated(hash = 400714658)
    public List<ProductList> getProductLists() {
        if (productLists == null) {
            final DaoSession daoSession = this.daoSession;
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            ProductListDao targetDao = daoSession.getProductListDao();
            List<ProductList> productListsNew = targetDao._queryGlobalList_ProductLists(id);
            synchronized (this) {
                if (productLists == null) {
                    productLists = productListsNew;
                }
            }
        }
        return productLists;
    }

    /** Resets a to-many relationship, making the next get call to query for a fresh result. */
    @Generated(hash = 1629923042)
    public synchronized void resetProductLists() {
        productLists = null;
    }

    /** called by internal mechanisms, do not call yourself. */
    @Generated(hash = 1049633461)
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getGlobalListDao() : null;
    }
}
