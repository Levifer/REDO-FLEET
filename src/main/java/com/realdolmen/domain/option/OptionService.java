package com.realdolmen.domain.option;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by TLAAU71 on 30/10/2014.
 */
@Service
public class OptionService {

    @Autowired
    private OptionRepository optionRepository;

    public List<Option> findAll(){
        return optionRepository.findAll();
    }
}
