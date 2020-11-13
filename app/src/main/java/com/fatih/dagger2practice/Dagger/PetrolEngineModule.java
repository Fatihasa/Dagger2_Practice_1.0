package com.fatih.dagger2practice.Dagger;

import com.fatih.dagger2practice.Car.Engine;
import com.fatih.dagger2practice.Car.PetrolEngine;

import dagger.Module;
import dagger.Provides;

@Module
public class PetrolEngineModule {

    private int horsePower;


    public PetrolEngineModule(int horsePower) {
        this.horsePower = horsePower;
    }

    @Provides
     Engine providesEngine(){
        return new PetrolEngine(horsePower);
     }

}
