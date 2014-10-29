package com.realdolmen.domain;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

/**
 * Created by TLAAU71 on 29/10/2014.
 */
@Entity
public class Option {
    @Id
    @GeneratedValue
    private Integer id;
    private Type type;
    private String name;
    private String description;
    private BigDecimal price;

    @ManyToMany
    private List<Pack> packs;

    @ManyToOne
    private CustomPack customPack;

    public Option() {
    }

    public Option(Type type, String name, String description, BigDecimal price) {
        this.type = type;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public List<Pack> getPacks() {

        return packs;
    }

    public void setPacks(List<Pack> packs) {
        this.packs = packs;
    }

    public CustomPack getCustomPack() {
        return customPack;
    }

    public void setCustomPack(CustomPack customPack) {
        this.customPack = customPack;
    }
}
