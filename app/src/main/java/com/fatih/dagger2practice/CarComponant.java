package com.fatih.dagger2practice;

import dagger.Component;

@Component (modules = WheelsModule.class)
public interface CarComponant {


    Car getCar();

    void inject(MainActivity mainActivity);
}
