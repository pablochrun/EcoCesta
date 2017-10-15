package com.pablo.ecocesta.entities;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.Generated;

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

    @Generated(hash = 1347411316)
    public SupermarketList(Long id, String list_name, String listCreatedAt,
            String listUpdatedAt) {
        this.id = id;
        this.list_name = list_name;
        this.listCreatedAt = listCreatedAt;
        this.listUpdatedAt = listUpdatedAt;
    }

    @Generated(hash = 97964699)
    public SupermarketList() {
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
    
}
