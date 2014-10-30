package com.realdolmen.domain.option;

import com.realdolmen.domain.Enums;

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
    private Enums.Type type;
    private String name;
    private String description;
    private BigDecimal price;


    public Option() {
    }

    public Option(Enums.Type type, String name, String description, BigDecimal price) {
        this.type = type;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public Enums.Type getType() {
        return type;
    }

    public void setType(Enums.Type type) {
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

}