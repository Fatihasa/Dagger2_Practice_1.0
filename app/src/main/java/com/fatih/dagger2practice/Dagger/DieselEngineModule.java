package com.fatih.dagger2practice.Dagger;

import com.fatih.dagger2practice.Car.DieselEngine;
import com.fatih.dagger2practice.Car.Engine;

import dagger.Module;
import dagger.Provides;

@Module
public class DieselEngineModule {

    private int horsePower;

    public DieselEngineModule(int horsePower) {
        this.horsePower = horsePower;
    }

    @Provides
    Engine providesEngine(){

        return new DieselEngine(horsePower);
    }

}
