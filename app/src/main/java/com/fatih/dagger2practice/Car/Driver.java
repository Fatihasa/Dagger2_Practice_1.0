package com.fatih.dagger2practice.Car;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class Driver {


    @Inject
    public Driver(Driver driver) {

    }
}
