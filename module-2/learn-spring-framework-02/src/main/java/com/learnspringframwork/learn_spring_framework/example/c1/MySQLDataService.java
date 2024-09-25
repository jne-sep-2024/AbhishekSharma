package com.learnspringframwork.learn_spring_framework.example.c1;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Component
@Repository
@Qualifier("MySQLDataServiceQualifier")
public class MySQLDataService implements DataService {

    @Override
    public int[] retrieveData() {

        return new int[]{10, 20, 30, 40, 50};
    }
}
