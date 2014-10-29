package com.realdolmen.domain;

import javax.annotation.Generated;
import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Created by TLAAU71 on 29/10/2014.
 */
@Entity
public class Model {
    @Id
    @GeneratedValue
    private Integer id;
    private String brand;
    private String type;
    private Enums.Fuel fuelType;
    @Temporal(TemporalType.DATE)
    private Date year;
    private int quarter;
    private int minKm;
    private int maxKm;
    private int deliveryTime;
    private int fiscalHp;
    private int co2;
    private int category;

    @OneToOne
    private Pack pack;

    @OneToMany
    private List<Car> cars;

    public Model() {
    }

    public Model(String brand, String type, Enums.Fuel fuelType, Date year, int quarter, Pack pack, int minKm, int maxKm, int deliveryTime, int fiscalHp, int co2, int category) {
        this.brand = brand;
        this.type = type;
        this.fuelType = fuelType;
        this.year = year;
        this.quarter = quarter;
        this.pack = pack;
        this.minKm = minKm;
        this.maxKm = maxKm;
        this.deliveryTime = deliveryTime;
        this.fiscalHp = fiscalHp;
        this.co2 = co2;
        this.category = category;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Enums.Fuel getFuelType() {
        return fuelType;
    }

    public void setFuelType(Enums.Fuel fuelType) {
        this.fuelType = fuelType;
    }

    public Date getYear() {
        return year;
    }

    public void setYear(Date year) {
        this.year = year;
    }

    public int getQuarter() {
        return quarter;
    }

    public void setQuarter(int quarter) {
        this.quarter = quarter;
    }

    public Pack getPack() {
        return pack;
    }

    public void setPack(Pack pack) {
        this.pack = pack;
    }

    public int getMinKm() {
        return minKm;
    }

    public void setMinKm(int minKm) {
        this.minKm = minKm;
    }

    public int getMaxKm() {
        return maxKm;
    }

    public void setMaxKm(int maxKm) {
        this.maxKm = maxKm;
    }

    public int getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(int deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public int getFiscalHp() {
        return fiscalHp;
    }

    public void setFiscalHp(int fiscalHp) {
        this.fiscalHp = fiscalHp;
    }

    public int getCo2() {
        return co2;
    }

    public void setCo2(int co2) {
        this.co2 = co2;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public Integer getId() {
        return id;
    }

    public List<Car> getCars() {

        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }
}
