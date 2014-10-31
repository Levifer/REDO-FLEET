package com.realdolmen.util;

import com.realdolmen.domain.Enums;
import com.realdolmen.domain.carmodel.CarModel;
import com.realdolmen.domain.employee.Employee;
import com.realdolmen.domain.option.Option;
import com.realdolmen.domain.option.OptionService;
import com.realdolmen.domain.pack.Pack;
import com.realdolmen.domain.pack.PackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Random;

/**
 * Created by BPTAT47 on 30/10/2014.
 */
@Component
public class TestData implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    private TestDataInserter inserter;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        inserter.insertOptions();
        inserter.insertAPack();
        inserter.insertACarModel();
        inserter.insertASecondCarModelWithAnUpdatedPack();
        inserter.insertEmployees();
    }
}
