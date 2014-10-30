package com.realdolmen.domain.custompack;

import com.realdolmen.domain.option.Option;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

/**
 * Created by BPTAT47 on 29/10/2014.
 */
@Entity
public class CustomPack {

    @Id
    @GeneratedValue
    private Integer id;
    @OneToMany
    private List<Option> options;

    public Integer getId() {
        return id;
    }

    public List<Option> getOptions() {
        return options;
    }

    public void setOptions(List<Option> options) {
        this.options = options;
    }
}
