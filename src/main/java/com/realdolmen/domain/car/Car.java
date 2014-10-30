package com.realdolmen.domain.car;

import com.realdolmen.domain.Model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by TLAAU71 on 29/10/2014.
 */
@Entity
public class Car {

    @Id
    @GeneratedValue
    private Integer id;

    @ManyToOne
    private Model model;


    private Integer mileage;
    @Temporal(TemporalType.DATE)
    private Date carInUse;


    public Integer getId() {
        return id;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public Integer getMileage() {
        return mileage;
    }

    public void setMileage(Integer mileage) {
        this.mileage = mileage;
    }

    public Date getCarInUse() {
        return carInUse;
    }

    public void setCarInUse(Date carInUse) {
        this.carInUse = carInUse;
    }
}
