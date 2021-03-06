package com.realdolmen.domain.car;

import com.realdolmen.domain.carmodel.CarModel;

import javax.persistence.*;
import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by TLAAU71 on 29/10/2014.
 */
@Entity
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
public class Car implements Serializable {

    @Id
    @GeneratedValue
    @XmlTransient
    private Integer id;

    @ManyToOne
    @XmlElement
    private CarModel model;

    @XmlElement
    private Integer mileage;

    @Temporal(TemporalType.DATE)
    @XmlElement
    private Date carInUse;


    public Integer getId() {
        return id;
    }

    public CarModel getModel() {
        return model;
    }

    public void setModel(CarModel model) {
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
