package com.realdolmen.domain;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

/**
 * Created by TLAAU71 on 29/10/2014.
 */
@Entity
public class Pack {
    @Id
    @GeneratedValue
    private Integer id;
    private BigDecimal price;
    private BigDecimal benefitPrice;
    private BigDecimal upgrade;
    private BigDecimal downgrade;

    @OneToOne
    private Model model;

    @ManyToMany
    private List<Option> options;

    public Pack() {
    }

    public Pack(BigDecimal price, BigDecimal benefitPrice, BigDecimal upgrade, BigDecimal downgrade, List<Option> options) {
        this.price = price;
        this.benefitPrice = benefitPrice;
        this.upgrade = upgrade;
        this.downgrade = downgrade;
        this.options = options;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getBenefitPrice() {
        return benefitPrice;
    }

    public void setBenefitPrice(BigDecimal benefitPrice) {
        this.benefitPrice = benefitPrice;
    }

    public BigDecimal getUpgrade() {
        return upgrade;
    }

    public void setUpgrade(BigDecimal upgrade) {
        this.upgrade = upgrade;
    }

    public BigDecimal getDowngrade() {
        return downgrade;
    }

    public void setDowngrade(BigDecimal downgrade) {
        this.downgrade = downgrade;
    }

    public List<Option> getOptions() {
        return options;
    }

    public void setOptions(List<Option> options) {
        this.options = options;
    }

    public Integer getId() {
        return id;
    }

    public Model getModel() {

        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }
}
