package com.learnspringframwork.learn_spring_framework.example.c1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.Arrays;

//@Component
@Service
public class BusinessCalculationService {

    private DataService dataService;

    @Autowired
    public BusinessCalculationService(@Qualifier("MySQLDataServiceQualifier") DataService dataService) {
        super();
        this.dataService = dataService;
    }

    public int findMax() {

        return Arrays.stream(dataService.retrieveData()).max().orElse(0);
    }

}
