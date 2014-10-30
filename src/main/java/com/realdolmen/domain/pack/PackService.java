package com.realdolmen.domain.pack;

import com.realdolmen.domain.option.Option;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by TLAAU71 on 30/10/2014.
 */
@Service
public class PackService {

    @Autowired
    private PackRepository packRepository;


    public List<Pack> findAll(){
        return packRepository.findAll();
    }

    public BigDecimal getPrice(List<Option> options){
        BigDecimal totelPrice = new BigDecimal(0);
        for (Option option : options) {
            totelPrice.add(option.getPrice());
        }
        return totelPrice.multiply(new BigDecimal(0.9));
    }

}
