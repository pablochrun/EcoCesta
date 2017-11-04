package com.pablo.ecocesta.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.NotNull;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by irene on 04/11/2017.
 */

@Entity(nameInDb = "Category")
public class Category {

    @Id(autoincrement = true)
    private Long id;

    @Property(nameInDb = "name")
    @NotNull
    private String name;

    @Generated(hash = 2033714148)
    public Category(Long id, @NotNull String name) {
        this.id = id;
        this.name = name;
    }

    @Generated(hash = 1150634039)
    public Category() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
