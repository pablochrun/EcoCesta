package com.pablo.ecocesta.entity;

/**
 * Created by irene on 15/10/2017.
 */

public enum Allergy {
    MILK ("Milk"),
    EGG ("Egg"),
    GLUTEN ("Gluten");

    String value;

    Allergy(String value){
        this.value = value;
    }
}
