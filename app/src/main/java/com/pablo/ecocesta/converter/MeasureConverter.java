package com.pablo.ecocesta.converter;

import com.pablo.ecocesta.utils.Measure;

import org.greenrobot.greendao.DaoException;
import org.greenrobot.greendao.converter.PropertyConverter;

/**
 * Created by irene on 30/10/2017.
 */

public class MeasureConverter implements PropertyConverter<Measure, Integer> {
    @Override
    public Measure convertToEntityProperty(Integer databaseValue) {
        if(databaseValue == null) {
            return null;
        } else {
            for(Measure value : Measure.values()) {
                if(value.value() == databaseValue) {
                    return value;
                }
            }

            throw new DaoException("Can't convert Measure from database value: " + databaseValue.toString());
        }
    }

    @Override
    public Integer convertToDatabaseValue(Measure entityProperty) {
        if(entityProperty == null) {
            return null;
        } else {
            return entityProperty.value();
        }
    }
}
