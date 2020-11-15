package com.fatih.dagger2practice.Dagger;

import com.fatih.dagger2practice.Car.Engine;
import com.fatih.dagger2practice.Car.PetrolEngine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class PetrolEngineModule {

    @Binds
    abstract Engine bindEngine(PetrolEngine engine);

}
