package com.realdolmen.domain.pack;

import com.realdolmen.domain.option.Option;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by TLAAU71 on 30/10/2014.
 */
@Service
public class PackService {

    public BigDecimal getPrice(Pack pack){
        List<Option> options = pack.getOptions();
        BigDecimal totelPrice = new BigDecimal(0);
        for (Option option : options) {
            totelPrice.add(option.getPrice());
        }
        return totelPrice.multiply(new BigDecimal(0.9));
    }
}
