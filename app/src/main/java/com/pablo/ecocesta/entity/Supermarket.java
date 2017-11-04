package com.pablo.ecocesta.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by irene on 30/10/2017.
 */
@Entity(nameInDb = "Supermarket")
public class Supermarket {

    @Id(autoincrement = true)
    private Long id;

    @Property(nameInDb = "name")
    private String name;

    @Property(nameInDb = "latitude")
    private float latitude;

    @Property(nameInDb = "longitude")
    private float longitude;

    @Property(nameInDb = "address")
    private String address;

    @Property(nameInDb = "codePostal")
    private int codePostal;

    @Property(nameInDb = "telephone")
    private String telephone;

    @Generated(hash = 1303935195)
    public Supermarket(Long id, String name, float latitude, float longitude,
            String address, int codePostal, String telephone) {
        this.id = id;
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
        this.address = address;
        this.codePostal = codePostal;
        this.telephone = telephone;
    }

    @Generated(hash = 957046942)
    public Supermarket() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(int codePostal) {
        this.codePostal = codePostal;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}