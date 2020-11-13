package com.fatih.dagger2practice.Dagger;

import com.fatih.dagger2practice.Car.Car;
import com.fatih.dagger2practice.MainActivity;

import dagger.Component;

@Component (modules = {WheelsModule.class, DieselEngineModule.class})
public interface CarComponant {


    Car getCar();

    void inject(MainActivity mainActivity);
}
